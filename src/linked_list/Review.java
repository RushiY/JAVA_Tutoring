package linked_list;

public class Review {
	private static Node head;

	public static void main(String[] args) {
		head = new Node(0);
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);

		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
	}

	public static void review1() {
		
	}

}
