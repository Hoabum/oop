package main;
import Caculator.*;
public class Main {

	public static void main(String[] args) {
		int first = 3, second =4;
		Caculator caculator = new Caculator();
		System.out.println("tong = "+ caculator.add(first,second));
		System.out.println("Hieu: "+caculator.subtract(first, second));
	}

}
