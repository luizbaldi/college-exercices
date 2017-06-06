import java.util.ArrayList;

public class HuffmanTree {
	private Node root;
	private Node newRoot;
	private Node node;
	private Node current;
	private Node end;
	private String codedString = "";
	
	HuffmanTree() {
		setRoot(null);
		setCurrent(null);
		setEnd(null);
	}
	
	public Node buildLeafNodesLinkedList(ArrayList<Character> unrepeatedChars, Integer[] countOfChar) {
		for (int i = 0; i < countOfChar.length; i++) {
			Node node = new Node(unrepeatedChars.get(i).toString(), countOfChar[i]);
			if (getRoot() == null) {
				setRoot(node);
				setEnd(node);
			} else {
				setCurrent(getRoot());
				while (getCurrent().getNext() != null) {
					setCurrent(getCurrent().getNext());
				}
				getCurrent().setNext(node);
				getCurrent().getNext().setPrev(getCurrent());
				setEnd(node);
			}
		}
		return getRoot();
	}
	
	public void treeMaker(Node root, Node end) {
		setNode(new Node(end.getPrev().getItem() + end.getItem(), end.getPrev().getFrequency()
				+ end.getFrequency()));
		getNode().setLeft(end.getPrev());
		getNode().setRight(end);
		end.getPrev().getPrev().setNext(getNode());
		getNode().setPrev(end.getPrev().getPrev());
		end = getNode();
		end.setNext(null);

		if (root.getNext() == end) {
			setNode(new Node(root.getItem()+ end.getItem(), root.getFrequency() + end.getFrequency()));
			getNode().setLeft(root);
			getNode().setRight(end);
			getNode().setNext(null);
			getNode().setPrev(null);
			setNewRoot(getNode());
		} else {
			treeMaker(root, end);
		}
	}

	public String treeToHuffmanCode(ArrayList<Character> unrepeatedChars, Integer[] countOfChar, char[] messageToCharArr) {
		char checker;

		for (int i = 0; i < messageToCharArr.length; i++) {
			setCurrent(getNode());
			checker = messageToCharArr[i];
			String code = "";
			while (true) {
				if (getCurrent().getLeft().getItem().toCharArray()[0] == checker) {
					code += "0";
					break;
				} else {
					code += "1";
					if (getCurrent().getRight() != null) {
						if (getCurrent().getRight().getItem().toCharArray()[0] == unrepeatedChars
								.get(countOfChar.length - 1)) {
							break;
						}
						setCurrent(getCurrent().getRight());
					} else {
						break;
					}
				}
			}
			setCodedString(getCodedString() + code);
		}
		return getCodedString();
	}
	
	public String huffmanCodeToText(String codedString, Node node) {
		String decodedString = "";
		Node auxNode = node;
		for (char code : codedString.toCharArray()) {
			if (code == '0') {
				decodedString += auxNode.getLeft().getItem();
				auxNode = getNewRoot();
			} else if (code == '1' && auxNode.getRight().getLeft() == null && auxNode.getRight().getRight() == null) {
				decodedString += auxNode.getRight().getItem();
				auxNode = getNewRoot();
			} else if (code == '1' && !isLeaf(auxNode)) {
				auxNode = auxNode.getRight();
			}
		}
		return decodedString;
	}
	
	public Boolean isLeaf (Node node) {
		return (node.getLeft() == null && node.getRight() == null) ? true : false;
	}
	
	public static void inOrder(Node root) {
		if (root != null) {
			System.out.print(root.getItem() + "->");
			inOrder(root.getLeft());
			inOrder(root.getRight());
		}
	}
	
	public Node getRoot() {
		return root;
	}
	public Node getNewRoot() {
		return newRoot;
	}
	public Node getNode() {
		return node;
	}
	public Node getCurrent() {
		return current;
	}
	public Node getEnd() {
		return end;
	}	
	public String getCodedString() {
		return codedString;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	public void setNewRoot(Node newRoot) {
		this.newRoot = newRoot;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	public void setCurrent(Node current) {
		this.current = current;
	}
	public void setEnd(Node end) {
		this.end = end;
	}

	public void setCodedString(String codedString) {
		this.codedString = codedString;
	}	
}
