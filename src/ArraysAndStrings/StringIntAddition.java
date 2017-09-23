package ArraysAndStrings;

public class StringIntAddition {
	
	public static int stringSum(String str1, String str2){
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		return num1+num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(stringSum("123", "4561"));

	}

}
