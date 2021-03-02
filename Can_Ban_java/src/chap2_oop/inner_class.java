package chap2_oop;
class OuterClass
{
	int x= 10;
	class innerClass
	{
		int y=10;
	}
}
public class inner_class {


	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		OuterClass.innerClass myInter = myOuter.new innerClass();
		
		System.out.println( myOuter.x + myInter.y);
	}

}
