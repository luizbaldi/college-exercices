
public class Main {

	public static void main(String[] args) {
		OrderList list = new OrderList(5);
		fillList(list);
		
		//list.printArray();
		
		//list.bubbleSort();
		//list.selectionSort();
		list.insertionSort();
	}
	
	public static void fillList(OrderList list) {
		list.add(3);
		list.add(6);
		list.add(1);
		list.add(10);
		list.add(2);
	}
}
