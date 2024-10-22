package collections;

import java.util.Arrays;

public class MySimpleArrayList {

	private int[] data;
	private int capacity;
	private int size;
	
	MySimpleArrayList(){
		data = new int[4];
		capacity = 4;
		size = 0;
	}
	
	MySimpleArrayList(int capacity){
		data = new int[capacity];
		this.capacity = capacity;
		size = 0;
	}
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	int addElement(int element) {
		if(size == capacity) {
			// means the array is full
			// so we should grow the array
			int[] biggerData = new int[2 * capacity];
			capacity = 2 * capacity;
			System.arraycopy(data, 0, biggerData, 0, data.length); // copy data array into biggerdata array
			this.data = biggerData;
		}
		data[size] = element;
		return size++;
	}
	
	@Override
	public String toString() {
		return "MySimpleArrayList [data=" + Arrays.toString(data) + "]";
	}

}
