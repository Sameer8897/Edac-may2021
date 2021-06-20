package dataStructure;

public class BT{
Node root;

static class Node{
	int data;
	Node left,right;
	
	Node(int d){
		data=d;
		left=right=null;
	}
}
BT(){
	root=null;
}
	BT(int d)
	{	
		root=new Node(d);
	}
	
	void Inorder(Node node)
	{
		if(node==null)
			return;
		Inorder(node.left);
		System.out.println("node.data");
		Inorder(node.right);
	}

public static void main(String args[]) {
	
	
	BT t1=new BT();
	t1.root=new Node(11);
	t1.root.left=new Node(12);
	t1.root.right=new Node(13);
	
}
}


