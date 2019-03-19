package p1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo

{
	
	public static void showMap()
	/*{
		Map<String,Integer>map=new TreeMap<String,Integer>();
		map.put("First",123);
		map.put("second",46);
		map.put("Third",67);
		map.put("fourth",46);
		map.put("fourth",76);
		System.out.println(map);
				
	}*/
	{
		Map<Integer,String>map=new TreeMap<Integer,String>();
		map.put(100,"sarvani");
		map.put(200,"mirza");
		map.put(100,"akhil");
		map.put(400,"srujan");
		map.put(500,null);
		System.out.println(map);
		/*System.out.println(map.get(100));
		System.out.println(map.keySet());
		System.out.println(map.values());
		Collection <String>c=map.values();
		for(String c1:c)
		{
			System.out.println(c1);
		}*/
		Set<Entry<Integer,String>>set=map.entrySet(); 
		System.out.println(set);
	}

	public static void main(String[] args) {
		showMap();
		

	}

}
