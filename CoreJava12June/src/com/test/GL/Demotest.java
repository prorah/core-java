package com.test.GL;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demotest {

	public static void main(String[] args) {
		String input = "aabbbccaaaa";
		
		char[] chArr = input.toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < chArr.length; i++) {
			if (map.containsKey(chArr[i])&&i!=0&&chArr[i]==chArr[i-1]) {
				map.put(chArr[i], map.get(chArr[i]) + 1);
			} else if (map.containsKey(chArr[i]) && i != 0 && chArr[i] != chArr[i - 1]) {
				map.put(chArr[i], 1);
			} else {
				map.put(chArr[i], 1);
			}

		}
		Set<Entry<Character,Integer>> entrySet=map.entrySet();
		for(Entry entry:entrySet){
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}

	}

}
