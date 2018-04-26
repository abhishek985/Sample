
public class main1 {

	public static void main(String args[])
	{
		BinaryTree tree =new BinaryTree();
		
		tree.root= new Node(1);	
		tree.root.left= new Node(5);
		tree.root.right= new Node(7);
		
		Node rootn=tree.insert(tree.root,65);	
		tree.insert(tree.root,165);	
		tree.insert(tree.root,75);	
		
		
	Boolean b=tree.search(rootn,165);
		
		if(b==true)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not found");
		}
	}
}
