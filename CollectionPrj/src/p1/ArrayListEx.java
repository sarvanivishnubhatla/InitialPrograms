package p1;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListEx {

	public static void showList()
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(0);
		list.add(100);
		list.add(0,300);
		list.add(0,200);
		list.add(1,600);
		//System.out.println(list);
		for(Integer o :list)
		{
			System.out.println(o);
		}
		System.out.println("Iterator");
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("size"+list.size());
		System.out.println("removed number = " +list.remove(1));
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}
	public static void main(String[] args) {
		/*ArrayListEx ex=new ArrayListEx();
		ex.*/showList();

	}

}
