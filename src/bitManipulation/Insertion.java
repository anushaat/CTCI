package bitManipulation;

public class Insertion {
	
	public static int updateBit(int N, int M, int i, int j){
		int imask = ((1<<i)-1);
		int jmask = -1<<(j+1);
		
		int mask = imask | jmask;
		
		
		int clearN = N & mask;
		int shiftM = M<<i;
		
		int finalN = clearN | shiftM;
		return finalN;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Integer.toBinaryString(updateBit(1024, 19, 2, 5)));
	}

}
