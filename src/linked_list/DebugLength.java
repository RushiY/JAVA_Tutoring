package linked_list;

public class DebugLength {

	public static void main(String[] args) {
		Node head = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(5);

		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		System.out.println(length(head));
	}

	public static int length(Node head) {
		int counter = 0;
		while (head != null) {
			counter++;
			head = head.next;
		}

		return counter;
	}
}