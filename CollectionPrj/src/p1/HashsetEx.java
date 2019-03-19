package p1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashsetEx {
	public static void showSet()
	{
		Set<String>hset=new HashSet<String>();
		hset.add("Abc");
		hset.add("sar");
		hset.add(null);
		hset.add("123");
		hset.add("a12b");
		System.out.println(hset);
		/*Iterator<String>it=hset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
	}
	public static void showLinkHashSet()
	{
		Set<String>hset=new LinkedHashSet<String>();
		hset.add("Abc");
		hset.add("sar");
		hset.add(null);
		hset.add("123");
		hset.add("a12b");
		hset.add(null);
		hset.add("1234");
		System.out.println(hset);
	}
	public static void showTree()
	{
		Set<String>tset=new TreeSet<String>();
		tset.add("ABC");
		tset.add("sar");
		tset.add("null");
		tset.add("123");
		tset.add("A12b");
		tset.add("null");
		System.out.println(tset);
	}

	public static void main(String[] args) {
		showSet();
		showTree();
		showLinkHashSet();
	}

}
