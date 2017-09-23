package ArraysAndStrings;
public class OneAway {
	
	public static boolean oneWay(String str1, String str2) {
		if(str1.length()==str2.length()){
			return replace(str1,str2);
		}else if(str1.length()-1==str2.length()){
			return insert(str2,str1);
		}else if(str2.length()-1==str1.length()){
			return insert(str1,str2);
		}
		return false;
	}
	
	public static boolean replace(String str1, String str2){
		boolean foundDifference=false;
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				if(foundDifference){
					return false;
				}
				foundDifference=true;
			}
		}
		return true;
	}
	
	public static boolean insert(String str1, String str2){
		int index1=0, index2=0;
		while(index1<str1.length() && index2<str2.length()){
			if(str1.charAt(index1) != str2.charAt(index2)){
				if(index1!=index2){
					return false;
				}
				index2++;
			}
			else{
				index1++;
				index2++;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(oneWay("apple", "aple"));
	}

}
