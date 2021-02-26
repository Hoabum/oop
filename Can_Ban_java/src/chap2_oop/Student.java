package chap2_oop;

public class Student {
	public  String name;
	public  int birthday;
	public String msv;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public String getMsv() {
		return msv;
	}
	public void setMsv(String msv) {
		this.msv = msv;
	}
	public void showInf()
	{
		System.out.println("Sudent Info");
		System.out.println("Name: "+this.getName());
		System.out.println("birthday: "+this.getBirthday());
		System.out.println("msv: "+ this.getMsv());
	}
	
	
	
	
}
