package odb_production;

// ������������
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
		return "���������� ���������: "+countMaterial+
				"\n ���� ������������: "+dateEstablish+
				"\n ���� ������: "+dateCancel+
				"\n ��������: "+mtr;
	}	
}
