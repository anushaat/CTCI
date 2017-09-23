package sortingAndSearching;

public class MergeSort {
	
	public static int[] mergeSort(int[] arr){
		int[] temp = new int[arr.length];
		mergeSort(arr, temp, 0, arr.length-1);
		return arr;
	}
	
	public static void mergeSort(int[] arr, int[] temp, int leftStart, int rightEnd){
		if(leftStart>=rightEnd){
			return;
		}
		
		int mid = (leftStart + rightEnd)/2;
		
		mergeSort(arr, temp, leftStart, mid);
		mergeSort(arr, temp, mid+1, rightEnd);
		merge(arr, temp, leftStart, rightEnd);
	}
	
	public static void merge(int[] arr, int[] temp, int leftStart, int rightEnd){
		int leftEnd = (rightEnd + leftStart)/2;
		int rightStart = leftEnd + 1;
		int size = rightEnd - leftStart + 1;
		
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while(left<=leftEnd && right<=rightEnd){
			if(arr[left] <= arr[right]){
				temp[index] = arr[left];
				left++;
			}else{
				temp[index] = arr[right];
				right++;
			}
			index++;
		}
		
		System.arraycopy(arr, left, temp, index, leftEnd-left+1);
		System.arraycopy(arr, right, temp, index, rightEnd-right+1);
		System.arraycopy(temp, leftStart, arr, leftStart, size);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {9,3,6,1,7,2,8,5,4};
		mergeSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
