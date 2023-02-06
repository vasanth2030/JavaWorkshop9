package linkedlist;

public class Main {
	public static void main(String[] args) {
		Node head = new Node(10);
		Node.insertDataAtEnd(head, 20);
		Node.insertDataAtEnd(head, 30);
		Node.insertDataAtEnd(head, 40);
		Node.insertDataAtEnd(head, 50);
		Node.insertDataAtEnd(head, 60);
		
		Node.printLinkedList(head);
		
		head=Node.deleteNodeAtPos(head, 3);
		Node.printLinkedList(head);

		head=Node.deleteNodeAtPos(head, 1);
		Node.printLinkedList(head);
	}
}
