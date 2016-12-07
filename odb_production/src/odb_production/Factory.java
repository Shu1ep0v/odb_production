package odb_production;

// �����������
public class Factory { 

	private String codeFactory;
	private String nameFactory;
	private String address;
	private String phone;
	
	public Factory (String codeFactory, String nameFactory, String address, String phone) {
		this.codeFactory = codeFactory;
		this.nameFactory = nameFactory;
		this.address = address;
		this.phone = phone;
	}
	
	public String getCodeFactory() { return this.codeFactory;}
	public String getName() { return this.nameFactory;}
	public String getAddress() { return this.address;}
	public String getPhone() { return this.phone;}
	
	public String toString() {
		return "��� �����������: "+codeFactory+
				"\n ��������: "+nameFactory+
				"\n �����: "+address+
				"\n ����� ��������: "+phone;
	}
}
