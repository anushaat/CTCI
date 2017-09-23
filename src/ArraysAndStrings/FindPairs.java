package ArraysAndStrings;

import java.util.HashMap;

public class FindPairs {
	
	class Pairs{
		int first;
		int second;
		public Pairs(int first, int second){
			this.first = first;
			this.second = second;
		}
	}
		
		public boolean hasPairs(int[] arr){
			HashMap<Integer, Pairs> map = new HashMap<Integer, Pairs>();
			for(int i=0; i<arr.length; i++){
				for(int j=i+1; j<arr.length;j++){
					int sum = arr[i] + arr[j];
					if(!map.containsKey(sum)){
						map.put(sum, new Pairs(i,j));
					}else{
						Pairs p = map.get(sum);
						System.out.println(arr[p.first] + " + " + arr[p.second] + " = " + arr[i] + " + " + arr[j]);
						return true;
					}
				}
			}
			return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindPairs fp = new FindPairs();
		int[] arr = {65, 30, 7, 90, 1, 9, 8};
		System.out.println(fp.hasPairs(arr));

	}

}
