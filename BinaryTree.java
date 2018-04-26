
 class BinaryTree{

	public Node root;

	/*public BinaryTree(int d)
	{
		root=new Node(d);
	}
*/
	public BinaryTree()
	{
		 root=null;
	}

	public Node insert(Node root,int newdata)
	{
		if(root==null)
		{
			root=new Node(newdata);
		}
		else if(newdata<=root.data)
		{
			root.left=insert(root.left,newdata);
		}
		else if(newdata>root.data)
		{
			root.right=insert(root.right,newdata);
		}
		return root;
	}

	public boolean search(Node root,int key)
	{
		if(root==null)
		{
			return false; 
		}
		else if (key==root.data)
		{
			return true;
		}
		else if(key<=root.data)
		{
			return	search(root.left,key);
		}
		else 
			return search(root.right,key);
	}

}
 
