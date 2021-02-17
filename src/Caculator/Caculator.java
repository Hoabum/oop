package Caculator;
public class Caculator {
	private int first;
	private int second;
	// constructor
	public Caculator(int first, int second) {
		super();
		this.setFirst(first);
		this.setSecond(second);
	}
	// setter and getter
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	// methof of caculator
	public int add() {
		return first + second;
	}
	public int subtract() {
		return first - second;
	}
	public double multiply() {
		return first *second;
	}
	public double divide() {
		return (double)first/second;
	}
	public void swap() {
		int temp = first;
		first = second;
		second = temp;
	}
}
