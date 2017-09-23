package ArraysAndStrings;

import java.util.HashSet;

public class ZeroMatrix {
	
	public static int[][] zeroMatrix(int[][] matrix) {
		HashSet<Integer> rowZero = new HashSet<>();
		HashSet<Integer> colZero = new HashSet<>();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0){
					rowZero.add(i);
					colZero.add(j);
				}
			}
		}
		
		for(int i=0; i<rowZero.size(); i++){
			for(int j=0; j<matrix[0].length; j++){
				matrix[i][j] = 0;
			}
		}
		
		for(int i=0; i<colZero.size(); i++){
			for(int j=0; j<matrix.length; j++){
				matrix[j][i] = 0;
			}
		}
		
		return matrix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {{0,1,1}, {1,1,1}, {1,1,1}};
		zeroMatrix(matrix);
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}

	}

}
