import java.util.Stack;

public class BinaryTree {

	public class TNode{
		int data ;
		TNode left;
		TNode right;
		public TNode(int data) {
			this.data=data;
		}
		
	}//end of the class
	public TNode root;
	public void createTree() {
	TNode  first=new TNode(9);
	TNode  second=new TNode(2);
	TNode  third=new TNode(3);
	TNode  forth=new TNode(4);

	
	root=first;
	first.left=second;
	first.right=third;
	
	second.left=forth;
	
	
	}
	
	public void inrecursive(TNode root) {
		if(root==null) {
			return;
		}
		inrecursive(root.left);
		System.out.println(root.data);
		inrecursive(root.right);
	}
	
    public void inorderiteratie() {
    	if (root==null) {
    		return;
    	}
    	TNode temp=root;
    	Stack<TNode> st=new Stack<BinaryTree.TNode>();
    	while(!st.isEmpty()|| temp!=null) {
    		if(temp!=null) {
    		temp= st.push(temp);
    		temp=temp.left;
    		}else {
    			temp=st.pop();
    			System.out.println(temp.data);
    			temp=temp.right;
    		}
    	}
    	{
    		
    	}
    }
    public void preiterative() {
		if (root==null) {
			return;
		}
	Stack<TNode> stack=new Stack<BinaryTree.TNode>();
	stack.push(root);
	while(!stack.isEmpty()) {
		TNode temp= stack.pop();
		System.out.println();
		System.out.print(temp.data+"  ");
		if(temp.right !=null) {
			stack.push(temp.right);
		}
		if(temp.left !=null) {
			stack.push(temp.left);
		}
		
		}
	}
	public void preOrder(TNode root) {
		if(root==null) {
			return;
		}
		System.out.println("the root is:\t"+root.data);
		preOrder(root.left);
		preOrder(root.right);
	}
	public void postordrrecursive(TNode root) {
		if (root==null) {
			return;
		}
		postordrrecursive(root.left);
		postordrrecursive(root.right);
		System.out.println(root.data);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tn =new BinaryTree();
		tn.createTree();
		tn.preOrder(tn.root);
		tn.inorderiteratie();
		tn.preiterative();
		tn.inrecursive(tn.root);
		tn.postordrrecursive(tn.root);

	}

}
