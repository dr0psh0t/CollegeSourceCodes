package bst.genericBST;

public class TestGenericBST {

	public static void main(String[] args) {
		
		/*BinarySearchTree<Integer> bsTree = new BinarySearchTree<>();
		
		bsTree.insert(5);
		bsTree.insert(3);
		bsTree.insert(8);
		
		for(int search = 0; search < 10; ++search)
			System.out.println((bsTree.search(search)) ? search+" is found" : search+" isn't found");
		
		System.out.println();
		
		bsTree.preorder();
		System.out.println();
		bsTree.inorder();
		System.out.println();
		bsTree.postorder();*/
		
		BinarySearchTree<Character> bsTree = new BinarySearchTree<>();
		
		char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
		
		bsTree.insert('e');
		bsTree.insert('c');
		bsTree.insert('h');
		bsTree.insert('i');
		bsTree.insert('j');
		bsTree.insert('a');
		bsTree.insert('d');
		
		for(int g = 0; g < 10; ++g)
			System.out.println((bsTree.search(alpha[g]) ? alpha[g]+" is found" : alpha[g]+" isn't found"));
		
		System.out.println();
		
		bsTree.preorder();
		System.out.println();
		bsTree.inorder();
		System.out.println();
		bsTree.postorder();
		System.out.println();
		
		System.out.println("Tree height: "+bsTree.treeHeight());
		System.out.println("# of nodes: "+bsTree.treeNodeCount());
		System.out.println("# of leaf nodes: "+bsTree.treeLeavesCount());
	}
}