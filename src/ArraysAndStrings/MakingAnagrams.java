package ArraysAndStrings;

import java.util.HashMap;

public class MakingAnagrams {
	
	public static int numberNeeded(String first, String second) {
		HashMap<Character, Integer> map1 = new HashMap<>();
		int len1 = first.length();
		int len2 = second.length();
		int count = len1+ len2;
		
		for(int i=0; i<len1; i++){
			char c = first.charAt(i);
			if(!map1.containsKey(c)){
				map1.put(c, 1);
			}
			else{
				map1.put(c, map1.get(c)+1);
			}
		}
		
		for(int i=0; i<len2; i++){
			char c = second.charAt(i);
			if(map1.containsKey(c)){
				map1.put(c, map1.get(c)-1);
				count -= 2;
			}
		}
		return count;
	}
	
	public static int numberNeeded2(String first, String second) {
		int[] charVal = new int[26];
		int count = 0;
		
		for(int i=0; i<first.length(); i++){
			charVal[first.charAt(i)-'a'] += 1;
		}
		
		for(int i=0; i<second.length(); i++){
			charVal[second.charAt(i) - 'a'] -= 1;
		}
		
		for(int i=0; i<26; i++){
			count += Math.abs(charVal[i]);
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberNeeded("abcc", "cdef"));
	}

}
