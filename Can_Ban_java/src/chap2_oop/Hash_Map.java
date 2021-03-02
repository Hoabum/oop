package chap2_oop;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer>People = new HashMap<String,Integer>();
		People.put("bp",93 );
		People.put("hcm", 59);
		People.put("binh dinh", 77);
		
		for(String i: People.keySet())
		{
			System.out.println("Thong tin "+ i + "so " +People.get(i));
		}

	}

}
