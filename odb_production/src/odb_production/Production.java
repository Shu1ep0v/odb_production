package odb_production;

// Производство
public class Production {

	private int year;
	private double size;
	private Product pr;
	private Factory fctr;
	
	public Production (int year, double size, Product pr, Factory fctr) {
		this.year = year;
		this.size = size;
		this.pr = pr;
		this.fctr = fctr;
	}
	
	public int getYear() {return this.year;}
	public double getSize() {return this.size;}
	public Product getPr() {return this.pr;}
	public Factory getFctr() { return this.fctr;}
	
	public String toString() {
		return "Год выпуска: "+year+
				"\n Объем выпуска: "+size+
				"\n Изделие: "+pr+
				"\n Предприятие: "+fctr;
	}
}
