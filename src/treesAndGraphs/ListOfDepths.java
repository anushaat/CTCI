package treesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ListOfDepths {
	
	public static List<LinkedList<TreeNode>> listOfDepths(TreeNode root) {
		List<LinkedList<TreeNode>> depthList = new ArrayList<>();
		LinkedList<TreeNode> list = new LinkedList<>();
		if(root!=null){
			list.add(root);
		}
		while(list.size()>0){
				depthList.add(list);
				LinkedList<TreeNode> previous = list;
				list = new LinkedList<>();
				for (TreeNode prev : previous) {
					if(prev.left!=null) list.add(root.left);
					if(prev.right!=null) list.add(root.right);
				}
		}
		return depthList;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(3);
		node.right = new TreeNode(2);
		node.left.left = new TreeNode(5);
		node.left.right = new TreeNode(3);
		node.right.right = new TreeNode(9);
		
		List<LinkedList<TreeNode>> list = listOfDepths(node);
		
		for (LinkedList<TreeNode> li : list) {
			
		}

	}

}
