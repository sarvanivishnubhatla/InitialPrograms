package p1;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableEx {


	public static void showNav()
	{
		NavigableSet<String>nset=new TreeSet<>();
		nset.add("e");
		nset.add("l");
		nset.add("n");
		nset.add("m");
		nset.add("t");
		NavigableSet<String>it=nset.descendingSet();
		System.out.println("desending set"+it.toString());
		/*Iterator<String>it1=nset.descendingIterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}*/
		SortedSet<String>s1=nset.headSet("m",true);
		System.out.println(s1);
		SortedSet<String>s2=nset.subSet("m",true,"n",false);
		System.out.println(s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showNav();
	}

}
