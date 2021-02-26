package Canban;

public class multiplication_table {

	public static void main(String[] args) {
		for(int i = 2;i<=9;i++)
		{
			System.out.println("Bang cua chuong: "+i);
			int number=i;
			for(int j=1;j<=10;j++)
			{
				System.out.printf("%d x %d =%d%n", number,j,number*j);
			}
			
		}
		System.out.println();
	}

}
