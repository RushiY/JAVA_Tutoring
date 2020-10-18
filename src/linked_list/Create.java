package linked_list;

import java.util.*;

public class Create {

	public static void main(String[] args) {
		Node head = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);

		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;

		Node head2 = new Node(1);
		Node n22 = new Node(2);
		Node n32 = new Node(3);
		Node n42 = new Node(4);
		Node n52 = new Node(5);

		head2.next = n22;
		n22.next = n32;
		n32.next = n42;
		n42.next = n52;

		// Original
		// print(head);
		// addNode(6, head);
		// addANode(13, 3, head);
		// head = addBGNode(0, head);
		// addBNode(12, 3, head);
		// deleteNode(12, head);
		// deleteNode(13, head);
		// print(head);
		// sum(head);
		// maxium(head);
		// count(head);
		// middleNormal(head);
		// middleRunnerTech(head);
		// System.out.println(sumRecurrsive(head, 0));
		// System.out.println(countRecurrsive(head,0));
		// System.out.println(medianRecurrsive(head, head.next));
		// search(head);
		// nthNode(head);
		// frequency(head);
		// palandrom(head);
		//join(head, head2);
		// same(head, head2);
		// System.out.println(searchRecurrsive(head, 7));
		// System.out.println(nthNodeRecurrsive(head, 5));
		// System.out.println(frequencyRecurrsive(head, 4, 0));
		joinRec(head,head2);
		while(head != null) {
		System.out.print(head.data);
		head = head.next;
		}
	}

	//////////////////////////////////////////////////////////////////////
	public static int sumRecurrsive(Node head, int sum) {
		if (head == null) {
			return sum;
		}
		return sumRecurrsive(head.next, sum + head.data);
	}

	public static int countRecurrsive(Node head, int count) {
		if (head == null) {
			return count;
		}
		return countRecurrsive(head.next, count + 1);
	}

	public static int maxRecurrsive(Node head, int max) {
		if (head == null) {
			return max;
		}
		return maxRecurrsive(head.next, Math.max(head.data, max));
	}

	public static int medianRecurrsive(Node slow, Node fast) {
		if (fast == null || fast.next == null) {
			return slow.data;
		}
		return medianRecurrsive(slow.next, fast.next.next);
	}

	public static String searchRecurrsive(Node head, int input) {
		if (head == null) {
			return "There is no match.";
		}

		if (head.data == input) {
			return "There is a match";
		}

		return searchRecurrsive(head.next, input);
	}

	public static String nthNodeRecurrsive(Node head, int input) {
		if (head == null) {
			return "There is no match.";
		}

		if (input == 1) {
			return "There is a match.";
		}
		return nthNodeRecurrsive(head.next, input - 1);
	}

	public static String frequencyRecurrsive(Node head, int input, int count) {
		if (head == null) {
			return "The count is " + count;
		}
		if (head.data == input) {
			count++;
		}
		return frequencyRecurrsive(head.next, input, count);
	}

//////////////////////////////////////////////////////////////////////
	public static void search(Node head) {
		Scanner key = new Scanner(System.in);
		System.out.print("Enter a value --> ");
		int input = key.nextInt();

		Node temp = head;
		while (temp != null) {
			if (temp.data == input) {
				System.out.println("There is a match.");
				return;
			}
			temp = temp.next;
		}
		System.out.println("There was no match.");
	}

	public static void nthNode(Node head) {
		Scanner key = new Scanner(System.in);
		System.out.print("Enter a value --> ");
		int input = key.nextInt();

		Node temp = head;
		int count = 0;
		while (temp != null) {
			if (count == input) {
				System.out.println("There is a match.");
				return;
			}
			count++;
			temp = temp.next;
		}
		System.out.println("There was no match.");
	}

	public static void frequency(Node head) {
		Scanner key = new Scanner(System.in);
		System.out.print("Enter a value --> ");
		int input = key.nextInt();

		Node temp = head;
		int counter = 0;
		while (temp != null) {
			if (input == temp.data) {
				counter++;
			}
			temp = temp.next;
		}
		System.out.println("The number " + input + " was repeated " + counter + " times.");
	}

	///////////////////////////////////////////////////////////

	public static void same(Node head, Node head2) {
		Node temp1 = head;
		Node temp2 = head2;

		while (temp1 != null && temp2 != null) {
			if (temp1.data == temp2.data) {
				temp1 = temp1.next;
				temp2 = temp2.next;
			} else {
				return;
			}
		}
		System.out.println("They are the same linked list.");

	}

	public static void join(Node head, Node head2) {
		Node temp1 = head;
		Node temp2 = head2;

		while (temp1.next != null) {
			temp1 = temp1.next;
		}
		temp1.next = temp2;
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	
	public static void joinRec(Node head1, Node head2) {
		if(head1.next == null) {
			head1.next = head2;
			return;
		}
		joinRec(head1.next, head2);
	}
}
