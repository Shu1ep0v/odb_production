package odb_production;

// ��������
public class Material {
	
	private String nameMaterial;
	private String type;
	private String measure;
	private String price;
	
	public Material (String nameMaterial, String type, String measure, String price) {
		this.nameMaterial = nameMaterial;
		this.type = type;
		this.measure = measure;
		this.price = price;		
	}
	
	public String getNameMaterial() { return this.nameMaterial;}
	public String getType() { return this.type;}
	public String getMeasure() { return this.measure;}
	public String getPrice() { return this.price;}
	
	public String toString() {
		return "��������: "+nameMaterial+
				"\n ���: "+type+
				"\n ������� ���������: "+measure+
				"\n ���� �� �������: "+price;
	}	
}
