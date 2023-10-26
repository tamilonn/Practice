package code.test.tamil.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class JavaCollectionsExample {

	public static void main(String[] args) {
		
		//ArrayList
		executeArrayList();
		
		//Date
		executeDate();
		
		//HashMap
		executeHashMap();
		
		//Iterator
		executeIterator();
		
		//HashSet
		executeHashSet();
		
		//TreeSet
		executeTreeSet();
		
		

	}

	private static void executeTreeSet() {

		Set myTreeSet = new TreeSet<String>();
		myTreeSet.add("Zebra");
		myTreeSet.add("Annai");
		myTreeSet.add("Brindavan");
		myTreeSet.add("Zebra");
		
		System.out.println("MyTreeSet contains: " + myTreeSet);
	}

	private static void executeHashSet() {

		Set myHashSet = new HashSet<Integer>();
		myHashSet.add(500);
		myHashSet.add(100);
		myHashSet.add(200);
		myHashSet.add(200);
		System.out.println("Hashset contains: " + myHashSet);
	}

	private static void executeIterator() {

		List myArrayList = new ArrayList<String>();
		myArrayList.add("Tamilselvan");
		myArrayList.add("Viji");
		
		Iterator itr = myArrayList.iterator();
		
		while (itr.hasNext()) {
			System.out.println("myArrayList element is: " + itr.next());
		}
		
		//Instead we cna  use for loop
		for (int i=0; i< myArrayList.size(); i++ ) {
			System.out.println("Using for loop.. myArrayList element is: " + myArrayList.get(i));
		}
		
		
		
	}

	private static void executeHashMap() {

		Map myMap = new HashMap<Integer, String>();
		
		myMap.put(1000, "Tamil");
		
		for (int i=0; i< 500; i++) {
			myMap.put(i, ""+i);
		}
		
		System.out.println("myMap contains: "+ myMap);
		
		System.out.println("Key 1000 returns value : "+ myMap.get(1000));
	}

	private static void executeDate() {

		Date myDate = new Date();
		System.out.println("myDate is : " + myDate);
		

	}

	/*
	 * Explanins ArrayList example
	 */
	private static void executeArrayList() {

		List myArrayList = new ArrayList<String>();
		myArrayList.add("Tamilselvan");
		myArrayList.add("Viji");
		
		for (int i=0; i<100; i++) {
			myArrayList.add(Integer.valueOf(i));
			
		}
		
		for (int i=0; i<100; i++) {
			myArrayList.add(Integer.valueOf(i+10));
			
		}
		
		System.out.println("myArrayList contains: " + myArrayList);
		
		for (int i=0; i<myArrayList.size(); i++) {
			System.out.println("myArrayList["+ i +"] = " + myArrayList.get(i));
			
		}
		
		
		
	}

}
