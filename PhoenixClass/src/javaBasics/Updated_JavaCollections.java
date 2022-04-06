package javaBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Updated_JavaCollections {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/*
		 ArraysList vs LinkedList
		 ArraysList:
			- not ideal with large datasets
			- not ideal with lots of chnages in data
			- not ideal with deletion
			- ideal for retrieval of data
			- ideal for searching

		 LinkedList:
			- ideal with large sets of data
			- ideal with change in data / removing
			- retrieval of data is not ideal
			- in doubly Linked List nodes have the information about the next and previous nodes
			- by default Java give you doubly LinkedList
			- for searching devide the data into half, check the data number if it is in
			- the second half go backward from the end. If it is in the first half then
			  start from the begning

		 	With Queue it is FIFO
		 	With Stack it is LIFO (Used in checking if (), [], and {} closed as they open)
		 */

		LinkedList<String> ls = new LinkedList<>(); // doubly LinkedLIst
		ls.add("Test");
		System.out.println(ls.get(0));

		List<String> data = new ArrayList<>(); // upcasting
		List<String> data2 = new LinkedList<>(); // upcating

		Stack<String> temp = new Stack<>();
		temp.push("one");
		temp.push("two");

		System.out.println(temp);
		System.out.println(temp.peek()); // peek is going to return but not remove the value on the top of the stack
		System.out.println(temp);
		System.out.println(temp.pop()); // pop is going to return and remove the value on the top of the stack
		System.out.println(temp);

		Queue<String> temp2 = new PriorityQueue<>();
		temp2.add("1");
		temp2.add("2");

		System.out.println(temp2);
		System.out.println(temp2.peek()); // peek mean whats the first element to process (FIFO)
		System.out.println(temp2.poll());
		System.out.println(temp2);

		System.out.println("================");

		HashSet<String> tempSet = new HashSet<>();
		tempSet.add("jack");
		tempSet.add("david");
		System.out.println(tempSet.add("david")); 
		tempSet.add("Jack"); // Hashset is case sensitive so it accepts duplicate values with different case
		System.out.println(tempSet); // Hasset is an unordered data collection that will not accept duplicate entries

		System.out.println("===============");

		HashMap<String, String> data3 = new HashMap<>();

		data3.put("firstName", "Jack");
		data3.put("lastName", "Mahon");
		data3.put("age", "55");
		data3.put("firstName", "Brian"); // HashMap will substitute the lastest value with the initial value

		System.out.println(data3);
		System.out.println(data3.get("firstName"));
		System.out.println(data3.get("age"));

		System.out.println("================");

		HashMap<Integer, String> data4 = new HashMap<>();
		data4.put(1, "one");
		data4.put(2, "two");
		data4.put(3, "three");
		System.out.println(data4);

		System.out.println(data4.get(2));
		
		/*
		 Maps are key value pair data structure
		 keys must be unique, the values can be duplicate
		 we define the data types for keys and values
		 keys comes first and then value like ==== < key, value>
		 to add data to the map, we use method put (key, value);
		 to get the value of a key we use method get (key) 
		 */

		// some of the important methods of maps are:
		// getKeySet() will return a set of all of the keys in the map

		System.out.println(data4.keySet());

		// values() will return all of the values in your map
		System.out.println(data4.values());

		// containsValue () chekcs to see if such value exists in the map, if yes it
		// returns true if not returns false
		System.out.println(data4.containsValue("four"));

		// containsKey () will check to see if such key exist in the map, if yes it will
		// return true otherwise it will return false
		System.out.println(data4.containsKey(1));

		// how to iterate through a map
		// to get one value from a map, we use get (key)
		System.out.println(data4.get(2));

		System.out.println("===============");

		// to get all of the keys we use keySet ()
		// we can use for each loop to iterate through a set.
		for (Integer key : data4.keySet()) {
			System.out.println("key: " + key + "   value : " + data4.get(key));
		}

		System.out.println("======================");

		// if you need to go through the values and you dont need the keys, you can also
		// do the following
		for (String value : data4.values()) {
			System.out.println(value);
		}

		// Count the frequency of each chracter in a given String
		String str = "this is a test string that we should count the number of occurence of each character";

		// to count occurence of one char
		int count_t = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 't') {
				count_t++;
			}
		}

		System.out.println("t " + count_t);

		System.out.println("================");

		// to count occurence of all chars

		// make a map with chars as keys and int as values
		// we will store count of each char in the value

		HashMap<Character, Integer> charOccurence = new HashMap<>();

		// 1. go through all of the chars
		// 2. we check to see if the char is already in the map
		// - if yes, get the current count and increase the current count
		// - if no, then add the char to the map and give it count of 1 in value

		for (char c : str.toCharArray()) {
			if (charOccurence.containsKey(c)) {
				// true means the char is already in the map
				// we have to get the current count
				// increase the current count
				int newCount = charOccurence.get(c) + 1;
				charOccurence.put(c, newCount);

			} else {
				// the char is not in the map
				// it is the first time we are seeing this char
				// add the char to the map
				// add value 1 for the count
				charOccurence.put(c, 1);

			}
		}
		System.out.println(charOccurence);
	}

}