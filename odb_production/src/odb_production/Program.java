package odb_production;

import java.util.List;

/*import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;*/
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;
import com.db4o.query.Query;

public class Program {

	public static void listResult(ObjectSet result) {
		System.out.println(result.size());
		while (result.hasNext()) {
			System.out.println(result.next());
		}
	}

	public static void main(String[] args) throws Exception {
		ObjectContainer db;// = Db4o.openFile("odb_production.data");
		String dB4oFileName = "odb_production";
		db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), dB4oFileName);

		try {
			// db = Db4o.openFile("books.data");

			Material mtr01 = new Material("Алюминий", "цветной металл", "кг", "68.00 руб");
			Material mtr02 = new Material("Медь", "цветной металл", "кг", "90.00 руб");
			Material mtr03 = new Material("Латунь", "цветной металл", "кг", "55.00 руб");
			Material mtr04 = new Material("Бронза", "цветной металл", "кг", "105.00 руб");
			Material mtr05 = new Material("Никель", "цветной металл", "кг", "78.00 руб");	

			Specification spec01 = new Specification (0.15, "01.12.2015", "01.12.2016", mtr01);
			Specification spec02 = new Specification (0.3, "01.12.2005", "25.05.2009", mtr02);
			Specification spec03 = new Specification (0.5, "04.04.2005", "01.12.2016", mtr03);
			Specification spec04 = new Specification (0.3, "01.12.2005", "25.05.2009", mtr04);	
			Specification spec05 = new Specification (0.15, "01.12.2015", "01.12.2016", mtr05);
			
			List<Specification> specList1=new ArrayList<Specification>(); 
			specList1.Add(spec01); 
			specList1.Add(spec02); 
			specList2.Add(spec04); 
			
			Product product01 = new Product ("01", "Подстаканник", true, "подставка под стакан", 58975,  specList1);
			Product product02 = new Product ("02", "Бронзовая труба", true, "для водоснабжения, отопления, кондиционирования", 70000,  specList2);
			
			Factory fctr01 = new Factory ("01", "Кировский завод по обработке цв.металлов", "610016, Киров,Октябрьский пр.,18", "+7(8332)40-65-01");
			Factory fctr02 = new Factory ("02", "Завод медных труб", "Industrijska zona BB 19250 Majdanpek, Serbia", "+381-30-453-000");
			Factory fctr03 = new Factory ("03", "Кольчугинский завод цветных металлов", "601785, Владимирская обл.,г.Кольчугино,ул.Карла Маркса, д.25", "+7(49245)91-702");
			
			Production production01 = new Production ("2016", "150000", product01, fctr01);
			Production production02 = new Production ("2016", "85000", product02, fctr01);
			
			db.store(mtr01);
			db.store(mtr02);
			db.store(mtr03);
			db.store(mtr04);
			db.store(mtr05);
			
			db.store(spec01);
			db.store(spec02);
			db.store(spec03);
			db.store(spec04);
			db.store(spec05);
			
			db.store(product01);
			db.store(product02);
			
			db.store(fctr01);
			db.store(fctr02);
			db.store(fctr03);
			
			db.store(production01);
			db.store(production02);
						
			db.commit();

			// Find all books of Tolstoy
			/*
			 * ObjectSet<Book> book1 = db.queryByExample(new Book(null,
			 * "Толстой", 0, 0));
			 * 
			 * System.out.println("Книги Л.Н. Толстого:");
			 * 
			 * while (book1.hasNext()) { System.out.println(book1.next()); }
			 * System.out.println(
			 * "\n ------------------------------------------------------------------------------------------------------------- \n"
			 * );
			 * 
			 * 
			 * // Native Queries // Find all books with page < 100
			 * ObjectSet<Book> books = db.query(new Predicate<Book>() { public
			 * boolean match(Book book) { return book.getPage() < 100; } });
			 * 
			 * System.out.println(
			 * "Native Queries: Книги с количеством страниц < 100:");
			 * 
			 * while (books.hasNext()) { System.out.println(books.next()); }
			 * System.out.println(
			 * "\n ------------------------------------------------------------------------------------------------------------- \n"
			 * );
			 */

			/*
			 * // Advanced Native Queries // Find all books with 40<page<100 or
			 * books of Tolstoy ObjectSet <Book> result = db.query(new
			 * Predicate<Book>() { public boolean match(Book book) { return
			 * book.getPage() > 40 && book.getPage() < 100 ||
			 * book.getAuthorName().equals("Толстой"); } });
			 * 
			 * System.out.println(
			 * "Advanced Native Queries: Книги с количеством страниц > 40, но < 100 или книги Л.Н. Толстого:"
			 * );
			 * 
			 * while (result.hasNext()) { System.out.println(result.next()); }
			 * System.out.println(
			 * "\n ------------------------------------------------------------------------------------------------------------- \n"
			 * );
			 * 
			 * }
			 */

			// SODA Query API

			/*
			 * System.out.println("SODA Query API:");
			 * 
			 * Query query=db.query(); query.constrain(Book.class);
			 * query.descend("authorName").constrain("Толстой"); ObjectSet
			 * result=query.execute(); listResult(result);
			 * 
			 * 
			 * }
			 */

			//
			// store First Author
			/*storeFirstAuthor(db);

			// store Second Author
			storeSecondAuthor(db);

			// retrieve All Authors
			ObjectSet<Authors> rAuthors = retrieveAllAuthors(db);
			listResult(rAuthors);


			// retrieve All Books
			ObjectSet<Book> rBook = retrieveAllBooks(db);
			listResult(rBook);

			
		}*/

		finally {
			// if (db != null)
			db.close();
		}

	}

	// store First Author
	/*private static void storeFirstAuthor(ObjectContainer db) {
		Authors author1 = new Authors("Шекспир");
		Book book1 = new Book("Ромео и Джульетта", "Шекспир", 1798, 400);
		author1.setBook(book1);
		db.store(author1);
	}

	// store Second Author
	private static void storeSecondAuthor(ObjectContainer db) {
		Book book2 = new Book("Граф Монте-Кристо", "Дюма", 1786, 2045);
		db.store(book2);
		Authors author2 = new Authors("Дюма");
		author2.setBook(book2);
		db.store(author2);
	}

	// retrieve All Authors
	private static ObjectSet<Authors> retrieveAllAuthors(ObjectContainer db) {
		Authors proto = new Authors(null);
		ObjectSet<Authors> result = db.queryByExample(proto);
		return result;
	}

	// retrieve All Books
	private static ObjectSet<Book> retrieveAllBooks(ObjectContainer db) {
		Book proto = new Book(null, null, 0, 0);
		ObjectSet<Book> result = db.queryByExample(proto);
		return result;
	}*/

}