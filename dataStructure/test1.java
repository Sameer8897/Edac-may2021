package dataStructure;

public class test1 {
	static Node2 root;
 public static void main(String args[]) {
	 BST obj=new BST();
	 root=obj.insert(root,10);
	 root=obj.insert(root, 8);
	 root=obj.insert(root, 11);
	 root=obj.insert(root, 7);
	 root=obj.insert(root, 9);
	 obj.Inorder(root);
	 System.out.println();
	 obj.Preorder(root);
	 System.out.println();
	 obj.Postorder(root);
	
 }
}
class Node2{
	int data;
	Node2 left,right;
	
	Node2(int data){
		this.data=data;
		left=right=null;
	}
}
class BST{
	Node2 insert(Node2 n,int data) {
		if(n==null) {
			return new Node2(data);
		}
		if(data<n.data) {
		n.left=insert(n.left,data);
		}
		if(data>n.data) {
		n.right=insert(n.right,data);
		}
		return n;
}
	void Inorder(Node2 n)
	{
		if(n==null)
			return;
		Inorder(n.left);
		System.out.print(n.data+" ");
		Inorder(n.right);
		
}
	void Preorder(Node2 n) {
		if(n==null)
			return;
		System.out.print(n.data+" ");
		Preorder(n.left);
		Preorder(n.right);
	}
	void Postorder(Node2 n) {
		if(n==null)
			return;
		Postorder(n.left);
		Postorder(n.right);
		System.out.print(n.data+" ");
	}
}
