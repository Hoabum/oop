package chap2_oop;
import chap1_basic.Teacher;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentOne = new Student();
		Student studentTwo =new Student();
		studentOne.name="Nguyen thanh hoa";
		studentOne.birthday =20;
		studentOne.msv= "6051071042";
		studentOne.showInf();
		System.out.println("-------------------------------");
		studentTwo.name="Nguyen thanh hoang";
		studentTwo.birthday =10;
		studentTwo.msv= "6051071043";
		studentTwo.showInf();
		
	}

}
