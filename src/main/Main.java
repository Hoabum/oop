package main;
import java.io.Console;

import Caculator.*;
public class Main {
	public static void main(String[] args) {
		int first = 3, second =4;
		Caculator caculator = new Caculator(first, second);
		caculator.swap();
		System.out.println("first: "+ caculator.getFirst() +", second: "+caculator.getSecond());
	}
}
