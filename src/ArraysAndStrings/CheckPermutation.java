package ArraysAndStrings;

import java.util.Arrays;
import java.util.HashMap;

public class CheckPermutation {
	
	public static boolean checkPermutationSort(String str1, String str2) {
		if(str1.length() != str2.length()){
			return false;
		}
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for (int i = 0; i < ch1.length; i++) {
			if(ch1[i] != ch2[i]){
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean checkPermutationHM(String str1, String str2) {
		if(str1.length() != str2.length()){
			return false;
		}
		
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			if(!map.containsKey(c)){
				map.put(c, 1);
			}else{
				map.put(c, map.get(c)+1);
			}
		}
		
		//map.forEach((key, value) -> System.out.println(key + ":" + value));
		
		for (int i = 0; i < str2.length(); i++) {
			char c = str2.charAt(i);
			if(!map.containsKey(c) || map.get(c)<1){
				return false;
			}else{
				map.put(c, map.get(c)-1);
			}
		}
		return true;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "anusha";
		String str2 = "ahsuna";
		System.out.println(checkPermutationSort(str1, str2));
		System.out.println(checkPermutationHM(str1, str2));

	}

}
