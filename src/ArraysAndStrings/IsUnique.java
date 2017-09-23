package ArraysAndStrings;

import java.util.Arrays;
import java.util.HashSet;

public class IsUnique {
	
	//Use of extra DataStructure - O(n)
	public static boolean isUniqueHS(String str) {
		HashSet<Character> set= new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			if(!set.contains(str.charAt(i))){
				set.add(str.charAt(i));
			}
			else{
				return false;
			}
		}
		return true;
	}
	
	
	//Use of extra DataStructure - O(n)
	public static boolean isUniqueBool(String str) {
		if(str.length() > 128){
			return false;
		}
		
		boolean[] charSet = new boolean[128];
		
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if(charSet[val]) {return false;}
			
			charSet[val] = true;
		}
		
		return true;
	}

	
	
	//Without Extra DataStructure - O(n)
	public static boolean isUniqueBit(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			
			if((checker & (1<<val)) > 0){
				return false;
			}
			
			checker |= (1<<val);
		}
		return true;
		
	}
	
	
	//Using sorting - O(nlogn)
	public static boolean isUniqueSort(String str) {
		char[] charSet = str.toCharArray();
		Arrays.sort(charSet);
		
		for (int i = 0; i < charSet.length-1; i++) {
			if(charSet[i] == charSet[i+1]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdefg";
		System.out.println(isUniqueHS(str));
		System.out.println(isUniqueBool(str));
		System.out.println(isUniqueBit(str));
		System.out.println(isUniqueSort(str));

	}

}
