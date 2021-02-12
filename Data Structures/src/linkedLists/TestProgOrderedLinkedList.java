package linkedLists;

public class TestProgOrderedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderedLinkedList list = new OrderedLinkedList();
		
		list.insertNode(5);
		list.insertNode(3);
		list.insertNode(10);
		list.insertNode(6);
		list.insertNode(2);
		
		list.print();
		
		list.deleteNode(10);
		System.out.println();
		list.print();
	}

}
