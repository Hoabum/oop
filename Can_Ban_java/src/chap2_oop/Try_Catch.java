package chap2_oop;

public class Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int[]arr = {1,2,3};
			System.out.println(arr[5]);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("hello");
		}

	}

}
