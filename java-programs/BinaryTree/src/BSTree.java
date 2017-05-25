
public class BSTree {
	private int key;
	private BSTree left;
	private BSTree right;
	
	BSTree(int key, BSTree left, BSTree right) {
		setKey(key);
		setLeft(left);
		setRight(right);
	}
	
	BSTree(int chave) {
		this(chave, new BSTree(), new BSTree());
	}
	
	BSTree() {
		this(-1, null, null);
	}
	
	public void setLeft(BSTree tree) {
		this.left = tree;
	}
	
	public void setRight(BSTree tree) {
		this.right = tree;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public int getKey() {
		return this.key;
	}
	
	public BSTree getLeft() {
		return this.left;
	}
	
	public BSTree getRight() {
		return this.right;
	}
	
	public boolean isEmpty() {
		return getKey() == -1 && getLeft() == null && getRight() == null;
	}
	
	public void attach(int key) {
		setKey(key);
		setLeft(new BSTree());
		setRight(new BSTree());
	}
	
	public boolean insert(int key) {
		boolean success = true;
		
		if (isEmpty()) {
			attach(key);
		} else {
			if (key < this.getKey()) {
				left.insert(key);
			} else if (key > this.getKey()) {
				right.insert(key);
			} else {
				success = false;
			}
		}
		
		return success;
	}
	
	public void preOrder() {
		if (!isEmpty()) {
			System.out.println("Valor: " + key);
			left.preOrder();
			right.preOrder();
		}
	}
	
	public void posOrder() {
		if (!isEmpty()) {
			left.posOrder();
			right.posOrder();
			System.out.println("Valor: " + key);
		}
	}
	
	public void inOrder() {
		if (!isEmpty()) {
			left.inOrder();
			System.out.println("Valor: " + key);
			right.inOrder();
		}
	}
	
	public int findMin(BSTree tree) {
		BSTree current = tree;
		
		while(current.getLeft() != null && current.getLeft().getKey() != -1) {
			current = current.getLeft();
		}
		
		return current.getKey();
	}
	
	public int findMax(BSTree tree) {
		BSTree current = tree;
		
		while (current.getRight() != null && current.getRight().getKey() != -1) {
			current = current.getRight();
		}
		
		return current.getKey();
	}
	
	public BSTree find(int key) {
		if (!isEmpty()) {
			if (this.getKey() == key) {
				return this;
			} else {
				if (key > this.getKey()) {
					if (this.getRight() == null) {
						return null;
					}
					
					return this.getRight().find(key);
				} else {
					if (this.getLeft() == null) {
						return null;
					}
					
					return this.getLeft().find(key);
				}
			}
		} else {
			return null;
		}
	}
	
	@Override
	public String toString() {
		return "Key: " + this.getKey() + ", Right Key: " + this.getRight().getKey() + ", Left key: " + this.getLeft().getKey();
	}
}
