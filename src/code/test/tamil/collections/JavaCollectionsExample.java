package code.test.tamil.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
		
		
		

	}

	private static void executeIterator() {

		List myArrayList = new ArrayList<String>();
		myArrayList.add("Tamilselvan");
		myArrayList.add("Viji");
		
		Iterator itr = myArrayList.iterator();
		
		while (itr.hasNext()) {
			System.out.println("myArrayList element is: " + itr.next());
		}
		
		
		
	}

	private static void executeHashMap() {

		Map myMap = new HashMap<Integer, String>();
		
		myMap.put(1000, "Tamil");
		
		for (int i=0; i< 500; i++) {
			myMap.put(i, ""+i);
		}
		
		System.out.println("myMap contains: "+ myMap);
	}

	private static void executeDate() {

		Date myDate = new Date();
		System.out.println("myDate is : " + myDate);
		
		Date yesterday = new Date(2023, 10, 22);
		
		System.out.println("Yesterday is : " + yesterday);
		
		System.out.println("before date is : " + myDate.before(yesterday));
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
