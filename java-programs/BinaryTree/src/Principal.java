
public class Principal {
	
	public static void main(String[] args) {
		BSTree tree = new BSTree();
		
		tree.insert(8);
		tree.insert(3);
		tree.insert(1);
		tree.insert(6);
		tree.insert(4);
		tree.insert(7);
		tree.insert(10);
		tree.insert(14);
		tree.insert(13);
		
		// System.out.println("\n-- Imprimindo �rvore em pr� ordem --");
		// tree.preOrder();
		
		// System.out.println("\n-- Imprimindo �rvore em p�s ordem --");
		// tree.posOrder();
		
		// System.out.println("\n-- Imprimindo �rvore em ordem --");
		// tree.inOrder();
		
		System.out.println("Min value: " + tree.findMin(tree));
		System.out.println("Max value: " + tree.findMax(tree));
		
		System.out.println("Find tree by key six: " + tree.find(6));
	}
}
