package Graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class BFSandDFS {
	
	static HashMap<Integer, Node> nodeLookup = new HashMap<>();
	
	public static class Node{
		private int id;
		LinkedList<Node> adjacent = new LinkedList<>();
		private Node(int id){
			this.id = id;
		}
	}
	
	private Node getNode(int id){
		if(nodeLookup.containsKey(id)){
			return nodeLookup.get(id);
		}
		return null;
	}
	
	public void addEdge(int source, int destination){
		Node s = getNode(source);
		Node d = getNode(destination);
		s.adjacent.add(d);
	}
	
	public boolean hasPathDFS(int source, int destination){
		Node s = getNode(source);
		Node d = getNode(destination);
		HashSet<Integer> visited = new HashSet<>();
		return hasPathDFS(s, d, visited);
	}
	
	public boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited){
		if(visited.contains(source)){
			return false;
		}
		visited.add(source.id);
		if(source == destination){
			return true;
		}
		
		for (Node child : source.adjacent) {
			if(hasPathDFS(child, destination, visited)){
				return true;
			}
		}
		return false;
	}
	
	public boolean hasPathBFS(Node source, Node destination){
		LinkedList<Node> nextToVisit = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		
		nextToVisit.add(source);
		
		while(!nextToVisit.isEmpty()){
			Node node = nextToVisit.remove();
			
			if(node == destination){
				return true;
			}
			if(visited.contains(node)){
				continue;
			}
			visited.add(node.id);
			
			for(Node child : node.adjacent){
				nextToVisit.add(child);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BFSandDFS bfdf = new BFSandDFS();
		Node A = new Node(1);
		Node B = new Node(2);
		Node C = new Node(3);
		Node D = new Node(4);
		Node E = new Node(5);
		
		bfdf.addEdge(1, 2);
		bfdf.addEdge(2, 4);
		bfdf.addEdge(1, 3);
		bfdf.addEdge(3, 5);
		bfdf.addEdge(4, 5);;
		Node s = bfdf.getNode(1);
		Node d = bfdf.getNode(5);
		System.out.println(bfdf.hasPathBFS(s, d));
		//bfdf.hasPathDFS(1, 5);

	}

}
