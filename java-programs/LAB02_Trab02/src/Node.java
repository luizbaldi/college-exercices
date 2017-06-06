
public class Node {
	private String item;
	private Integer frequency;
	private Node left;
	private Node right;
	private Node next;
	private Node prev;
	
	public Node(String item, Integer frequency) {
		setItem(item);
		setFrequency(frequency);
	}
	
	public String getItem() {
		return item;
	}
	public Integer getFrequency() {
		return frequency;
	}
	public Node getLeft() {
		return left;
	}
	public Node getRight() {
		return right;
	}
	public Node getNext() {
		return next;
	}
	public Node getPrev() {
		return prev;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	
}
