package ArraysAndStrings;

import java.util.Stack;

public class BalancedParanthesis {
	
	public static boolean isBalanced(String str){
		Stack<Character> st = new Stack<Character>();
		for(char ch : str.toCharArray()){
			if(ch=='[' || ch=='{' || ch=='('){
				st.push(ch);
			}
			if(ch=='}'){
				if(st.isEmpty() || st.pop()!='{') return false;
			}else if(ch==']'){
				if(st.isEmpty() || st.pop()!='[') return false;
			}else if(ch==')'){
				if(st.isEmpty() || st.pop()!='(') return false;
			}
		}
		return st.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "}";
		System.out.println(isBalanced(str));
	}

}
