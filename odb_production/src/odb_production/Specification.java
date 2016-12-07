package odb_production;

// Спецификация
public class Specification {
	
	private double countMaterial;
	private String dateEstablish;
	private String dateCancel;
	private Material mtr;
	
	public Specification (double countMaterial, String dateEstablish, String dateCancel, Material mtr) {
		this.countMaterial = countMaterial;
		this.dateEstablish = dateEstablish;
		this.dateCancel = dateCancel;
		this.mtr = mtr;
	}
	
	public double getCountMaterial() { return this.countMaterial;}
	public String getDateEstablish() { return this.dateEstablish;}
	public String getDateCancel() { return this.dateCancel;}
	public Material getMtr () { return this.mtr;}
	
	public String toString() {
		return "Количество материала: "+countMaterial+
				"\n Дата установления: "+dateEstablish+
				"\n Дата отмены: "+dateCancel+
				"\n Материал: "+mtr;
	}	
}
