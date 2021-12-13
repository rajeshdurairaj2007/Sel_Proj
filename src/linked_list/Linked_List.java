package linked_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {
	public static void main(String[] args) {
		List<Integer> ex7 = new LinkedList<Integer>();
		ex7.add(30);
		ex7.add(20);
		ex7.add(10);
		ex7.add(40);
		ex7.add(40);
		System.out.println(ex7);
		
/*		System.out.println("Generic:  "+ex7); //Display based on insertion
		
		//size
		int s = ex.size();
		System.out.println("Size :  "+s);
		//get
	//	int g = ex.get(3);
	//	System.out.println(g);
		
		//for loop
		for(int i=0; i < ex.size(); i++)
		{
			System.out.println(ex.get(i));
		}
	*/	
		//enhanced For-Loop
		for (Integer integer : ex7) {
			System.out.println("Enhanced Loop :  "+integer);
		}
		
		ex7.remove(2);
		System.out.println("Remove:   "+ex7);
		
		ex7.add(2, 50);
		System.out.println("Add :  "+ex7);
		
		ex7.set(2, 60);  //set means replace
		System.out.println("Set :  "+ex7);
		
		boolean b = ex7.contains(40);
		System.out.println(b);
		
		Boolean b1 = ex7.contains(100);
		System.out.println(b1);
		
		System.out.println(ex7);
		//ex7.clear();
		System.out.println("Clear: "+ex7);
		
		//indexOf
		int x3 = ex7.indexOf(40);
		System.out.println(x3);
		
		//Last indexOf
		int x4 = ex7.lastIndexOf(40);
		System.out.println(x4);
		
		//add all
		List<Integer> ex2 = new LinkedList<Integer>();
		ex2.addAll(ex7);
		System.out.println(ex2);
		System.out.println(ex7);
		
		//Remove All - Remove Common values
		List<Integer> t = new LinkedList<Integer>();
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		
		List<Integer> t1 = new LinkedList<Integer>();
		t1.add(1000);
		t1.add(20);
		t1.add(30);
		t1.add(2000);
		
		t.removeAll(t1);
		System.out.println(t);
		
		t1.removeAll(t);
		System.out.println(t1);
		
		//RetainAll - Keep common values
		
		t1.retainAll(t);
		System.out.println(t1);
 		
	}

	
}
