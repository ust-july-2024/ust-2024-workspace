package collections;

public class MySimpleArrayListDemo {

	public static void main(String[] args) {
		MySimpleArrayList arrayList = new MySimpleArrayList();
		arrayList.addElement(6);
		arrayList.addElement(10);
		System.out.println(arrayList);
		arrayList.addElement(20);
		arrayList.addElement(5);
		System.out.println(arrayList);
		arrayList.addElement(15);
		System.out.println(arrayList);
	}

}
