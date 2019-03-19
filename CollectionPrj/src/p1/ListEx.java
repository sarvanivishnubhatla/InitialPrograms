package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListEx {
	public static void showList()
	{
		List<String>l1=new ArrayList<>();
		l1.add("123");
		l1.add("a1");
		l1.add("a2");
		l1.add(null);
		String a1[]= new String[l1.size()];
		l1.toArray(a1);
		System.out.println(Arrays.toString(a1));		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showList(); 
	}

}
