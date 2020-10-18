package linked_list;

public class Create2 {

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

		// Print Jobs
		// reverse(head);

		/*
		 * Node temp = pairWiseSwapNode(head); while (temp != null) {
		 * System.out.print(temp.data + " "); temp = temp.next; }
		 */
		
		Node add = addition(head,head2);
		while(add!=null) {
			System.out.print(add.data);
			add=add.next;
		}
		//kthNodeTraverseOnce(head, 3);
	}

	public static void reverset(Node head) {
		Node temp = head;
		int[] array = new int[5];

		while (temp != null) {
			for (int i = 0; i < array.length; i++) {
				array[i] = temp.data;
				temp = temp.next;
			}
		}

		for (int i = 0; i < array.length / 2; i++) {
			int temp2 = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp2;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static Node reverseNode(Node head) {

		Node current = head;
		Node previous = null;
		Node next;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public static void Runner(Node head) {
		Node slow = head;
		Node fast = head.next;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		System.out.println(slow.data);
	}

	public static int runnerRecurrsive(Node slow, Node fast) {
		if (fast == null || fast.next == null) {
			return slow.data;
		}
		return runnerRecurrsive(slow.next, fast.next.next);
	}

	public static Node reverseNodeRunner(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node temp = reverseNodeRunner(head.next);
		head.next.next = head;
		head.next = temp;
		return temp;
	}

	public static void reverse(Node head) {
		Node temp = head;
		int[] array = new int[5];

		while (temp != null) {
			for (int i = 0; i < array.length; i++) {
				array[i] = temp.data;
				temp = temp.next;
			}
		}

		for (int i = 0; i < array.length / 2; i++) {
			int temp2 = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp2;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static Node reverseRec(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node temp = reverseRec(head.next);
		head.next.next = head;
		head.next = null;
		return temp;

	}

	public static Node pairWiseSwaps(Node head) {
		Node temp = head;
		while (temp != null && temp.next != null) {
			int test = temp.next.data;
			temp.next.data = temp.data;
			temp.data = test;
			temp = temp.next.next;

		}
		return head;
	}

	public static void recurrsivePairWiseSwap(Node head) {
		if (head == null || head.next == null) {
			return;
		}
		int test = head.next.data;
		head.next.data = head.data;
		head.data = test;
		recurrsivePairWiseSwap(head.next.next);
	}

	public static Node recursivePairWise(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node rem = head.next.next;
		Node newhead = head.next;
		head.next.next = head;
		head.next = recursivePairWise(rem);
		return newhead;

	}

	public static Node reverseRLL(Node head) {
		Node current = head;
		Node previous = null;
		Node next = head;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			// System.out.println("Current: " + current.data);
			// System.out.println("Next: " + next.data);
			// System.out.println("Previous: " + previous.data);
		}
		return previous;
	}

	public static Node reverseRLLRec(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node temp = reverseRec(head.next);
		head.next.next = head;
		head.next = null;
		return temp;
	}

	public static Node pairWiseSwap(Node head) {
		Node temp = head;
		while (temp != null && temp.next != null) {
			int test = temp.next.data;
			temp.next.data = temp.data;
			temp.data = test;
			temp = temp.next.next;

		}
		return head;
	}

	public static void pairWiseSwapRec(Node head) {
		if (head == null || head.next == null) {
			return;
		}
		int test = head.next.data;
		head.next.data = head.data;
		head.data = test;
		pairWiseSwapRec(head.next.next);
	}

	public static Node pairWiseSwapNode(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node rem = head.next.next;
		Node newHead = head.next;
		head.next.next = head;
		head.next = pairWiseSwapNode(rem);
		return newHead;
	}

	public static int kthNode(Node head, int input) {
		Node current = head;
		Node previous = null;
		Node next = head;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		Node temp = previous;
		while (input != 1) {
			temp = temp.next;
			input--;
		}
		return temp.data;
	}

	public static void kthNodeNoReverse(Node head, int input) {
		Node temp = head;
		Node temp1 = head;
		int counter = 0;
		while (temp != null) {
			counter++;
			temp = temp.next;
		}
		input = counter - input;
		while (input != 1) {
			temp1 = temp1.next;
			input--;
		}
		System.out.println(temp1.next.data);
	}

	public static void kthNodeTraverseOnce(Node head, int input) {
		Node temp = head;
		Node temp2 = head;
		while(input != 0) {
			temp2 = temp2.next;
			input--;
		}
		while(temp2 !=  null) {
			temp = temp.next;
			temp2 = temp2.next;
		}
		System.out.println(temp.data);
	}
	
	public static Node addition(Node head1, Node head2) {
		Node temp1 = head1;
		Node temp2 = head2;
		Node dummy = new Node(0);
		Node res = dummy;
		int sum = 0;
		
		while(temp1 != null || temp2 != null) {
			if(temp1 != null) {
				sum += temp1.data;
				temp1 = temp1.next;
			}
			if(temp2 != null) {
				sum += temp2.data;
				temp2 = temp2.next;
			}
			res.next = new Node(sum%10);
			sum /= 10;
			res = res.next;
		}
		if(sum != 0) {
			res.next = new Node(sum);
		}
		return dummy.next;
	}
}
