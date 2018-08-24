package demo.exception;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	
		public static void main(String[] args) {
			Set set = new TreeSet();
			set.add(new GeoCache());
			set.add(new GeoCache(12,"acc1"));
			set.add(new GeoCache(13,"acc2"));
			Iterator it = set.iterator();
			while (it.hasNext())
			System.out.print(((GeoCache) it.next()) .getAcc_id()+ " ");
		}
	}

