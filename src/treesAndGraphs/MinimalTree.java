package treesAndGraphs;

public class MinimalTree {
	
	public static TreeNode minimalHeight(int[] arr) {
		return createMinimalTree(arr, 0, arr.length-1);
	}
	
	public static TreeNode createMinimalTree(int[] arr, int low, int high) {
		if(low>high) return null;
		int mid = (low+high)/2;
		TreeNode root = new TreeNode(arr[mid]);
		root.left = createMinimalTree(arr, low, mid-1);
		root.right = createMinimalTree(arr, mid+1, high);
		
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		TreeNode root = minimalHeight(arr);
		System.out.println(root.val);
		System.out.println(root.left.val);
		System.out.println(root.right.val);
		System.out.println(root.left.left.val);
		System.out.println(root.left.right.val);
		System.out.println(root.right.left.val);
		System.out.println(root.right.right.val);
		
	}

}
