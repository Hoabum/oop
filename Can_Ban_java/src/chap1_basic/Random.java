package Canban;

public class Random {


	public static void main(String[] args) {
		int age = 21;// khai bao tuoi
		
		char name;
		final int  year =2001;
		double var4 = year + (double)age;
		int max =100;
		int min =1;
		int range =(max-min)+1;
		int randomNumber = (int)(Math.random()*range )+min;
		System.out.println("random: "+randomNumber );
		}



}
