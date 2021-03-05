package BaiTap;

import java.util.Scanner;

public class Doi_so {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap 1 so:(1->100):  ");
		int n = scanner.nextInt();
		String []a = {"Mot","Hai","Ba","Bon","Nam","Sau","Bay","Tam","Chin","Muoi"};
		if(n<11) 
		{
			for(int i=0;i<11;i++)
			{
				if(n== i+1)
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
		else if(n <100)
		{
			int c = ((n%100/10));
			int dv = n%10;
			System.out.println(a[c-1]+" "+a[dv-1]);
			
		}
		
	}
}
