import java.util.Random;

public class OrderList {
	private int sentinel;
	private int[] list;
	
	OrderList(int tam) {
		list = new int[tam];
		sentinel = 0;
	}
	
	public void add(int value) {
		if (sentinel < list.length) {
			list[sentinel] = value;
			sentinel++;	
		} else {
			System.out.println("Array is already filled.");
		}
	}
	
	public void fillWithRandValues() {
		Random rand = new Random();
		for (int i = 0; i < list.length; i++) {
			list[i] = rand.nextInt(50) + 1;
		}
	}
	
	public void bubbleSort() {
		int[] sortedArray = BubbleSort.sort(list);
		
		printArray(sortedArray);
	}
	
	public void selectionSort() {
		SelectionSort.sort(list);
		
		printArray(list);
	}
	
	public void insertionSort() {
		InsertionSort.sort(list);
		
		printArray(list);
	}
	
	public void shellSort() {
		ShellSort.sort(list);
		
		printArray(list);
	}
	
	public void quickSort() {
		QuickSort.sort(list);
		
		printArray(list);
	}
	
	public void heapSort() {
		HeapSort.sort(list);
		
		printArray(list);
	}
	
	public void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
	}
	
	public void printArray() {
		for (int i = 0; i < list.length; i++) {
			System.out.println("array[" + i + "] = " + list[i]);
		}
	}
}
