package Arrays_program;

import java.util.ArrayList;

public class Rermove_Even_Array_list {
	
	static void Removeeven(ArrayList<Integer>list) {
		for(int i=list.size()-1;i>=0;i--) {
			if(list.get(i)%list.size()==0)
			{
				list.remove(i);
			}
		}
		
		for(int i=list.size()-1;i>=0;i--) {
			if(list.get(i)%2==0)
			{
				list.remove(i);
			}
		}
		
		
		
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(37);
		list.add(47);
		list.add(45);
		list.add(16);
		Removeeven(list);
		System.out.println(list);	
	}

}
