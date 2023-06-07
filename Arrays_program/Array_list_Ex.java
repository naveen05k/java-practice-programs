package Arrays_program;

import java.util.ArrayList;

public class Array_list_Ex {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
//add
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		System.out.println(list);

//add at index
		list.add(0, 11);
		System.out.println(list);
//get
		System.out.println(list.get(2));
//set
		list.set(1, 10);
		System.out.println(list);
//remove
		list.remove(2);
System.out.println(list);
		
	}

}
