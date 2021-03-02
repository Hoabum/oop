package chap2_oop;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>Chain= new LinkedList<String>();
		Chain.add("hoa");
		Chain.add("tam");
		Chain.add("hoang");
		Chain.add("cart");
		Chain.add("tree");
		// chen dau
		Chain.addFirst("go");
		System.out.println("==== chuoi da chen dau ==== ");
		System.out.println(Chain);
		
		// chen cuoi
		Chain.addLast("Teo");
		System.out.println("==== chuoi da chen cuoi ==== ");
		System.out.println(Chain);

		// xoa dau
		System.out.println("==== chuoi da xoa dau ==== ");
		Chain.removeFirst();
		System.out.println(Chain);

		//xoa cuoi
		System.out.println("==== chuoi da xoa cuoi ==== ");
		Chain.removeLast();
		System.out.println(Chain);
		//get dau
		System.out.println("get phan tu dau: "+ Chain.getFirst());
		// get cuoi
		System.out.println("get phan tu cuoi: "+ Chain.getLast());
		
	}

}
