package chap2_oop;

import java.util.ArrayList;
import java.util.Collections;


public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> MyNumber =new ArrayList<Integer>();
		MyNumber.add(30);
		MyNumber.add(20);
		MyNumber.add(4);
		MyNumber.add(11);
		MyNumber.add(34);
		// size
		
		System.out.println("size: "+MyNumber.size());
		// sap xep
		Collections.sort(MyNumber);
		for(int i:MyNumber)
		{
			System.out.println(i);
		}
		/// string 
		System.out.println("------------------------------------------------------------\n");
		ArrayList<String>Chain= new ArrayList<String>();
		Chain.add("hoa");
		Chain.add("Tam");
		Chain.add("hoang");
		Chain.add("thai");
		for(int i=0;i< Chain.size();i++)
		{
			System.out.println(Chain.get(i));
		}
		
	}

}
