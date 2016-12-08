package odb_production;

// Изделие
public class Product {

	private String codeProduct;
	private String nameProduct;
	private boolean typeProduct;
	private String goal;
	private double sizeYear;
	private List<Specification> specList; 
	
	public Product (String codeProduct, String nameProduct, boolean typeProduct, String goal, double sizeYear, List<Specification> specList) {
		this.codeProduct = codeProduct;
		this.nameProduct = nameProduct;
		this.typeProduct = typeProduct;
		this.goal = goal;
		this.sizeYear = sizeYear;
		this.specList = specList;
	}
	
	public String getCodeProduct() { return this.codeProduct;}
	public String getNameProduct() { return this.nameProduct;}
	public boolean getTypeProduct() { return this.typeProduct;}
	public String getGoal() { return this.goal;}
	public double getSizeYear() { return this.sizeYear;}
	public List<Specification> get SpecList() { return this.specList;}
	
	public String toString() {
		return "Код изделия: "+codeProduct+
				"\n Название: "+nameProduct+
				"\n Относится ли к типовому: "+typeProduct+
				"\n Цели изделия: "+goal+
				"\n Годовой объем выпуска: "+sizeYear+
				"\n Список спецификаций: "+specList; //работает не так как нужно, исправлю потом
	}	
}
