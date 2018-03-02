package com.coreConcepts.collections;

import java.util.*;

/*
 * Hashmap - this implemenation uses the hashtable as the underlying the data structure.
 * It implementation all the operations of map and it doesn't guarantee the order of key and values.
 * in hashmap it can contain one value as null and one key value as null
 * null values are always print at the top
 */
public class HashMapExample {
	public static Map<String, Object> doOperataion(){
		Map<String, Object> obj = new HashMap<>();
		
		obj.put("name","Raju");
		obj.put("age", 25);
		obj.put(null, null);
		return obj;
	}
}
