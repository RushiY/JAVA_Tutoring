package double_linked_list;

public class DLLCrude {
	public static DLLNode head;
	public static DLLNode tail;

	public static void main(String[] args) {
		head = new DLLNode(1);
		DLLNode n2 = new DLLNode(2);
		DLLNode n3 = new DLLNode(3);
		tail = new DLLNode(4);

		head.next = n2;
		n2.prev = head;
		n2.next = n3;
		n3.prev = n2;
		n3.next = tail;
		tail.prev = n3;

		// Crude

		addNodeAtEnd(5);
		addNodeAtStart(0);

		addNodeAfterInput(2, 12);
		addNodeBeforeInput(2, 11);

		inputAndDeleteByData(12);
		inputAndDeleteByPosition(1);

		amountOfNodesHead();
		amountOfNodesTail();

		System.out.println(amountOfNodesHeadRec(0, head));
		System.out.println(amountOfNodesTailRec(0, tail));

		System.out.println(runnerRecurrsiveHead(head, head.next));
		System.out.println(runnerRecurrsiveTail(tail, tail.prev));

		System.out.println(runnerRecurrsiveHeadTail(head, tail));
		runnerIterativeHeadTail();

		presentInListHead();
		presentInListTail();
		presentInListHeadTail();

		System.out.println(presentInListHeadTailRec(head, tail, 2));

		iterativeTwoSum(8);
		advancedTwoSum(8);
		System.out.println(recursiveTwoSum(head, tail, 9));

		printHead();
		System.out.println();
		printTail();
	}

	public static void printHead() {
		DLLNode temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void printTail() {
		DLLNode temp = tail;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}
	}

	public static void addNodeAtEnd(int value) {
		DLLNode n = new DLLNode(value);
		n.prev = tail;
		tail.next = n;
		tail = n;
	}

	public static void addNodeAtStart(int value) {
		DLLNode n = new DLLNode(value);
		n.next = head;
		head.prev = n;
		head = n;
	}

	public static void addNodeAfterInput(int input, int value) {
		DLLNode n = new DLLNode(value);
		DLLNode temp = head;
		while (temp.data != input) {
			temp = temp.next;
		}

		n.next = temp.next;
		n.prev = temp;
		temp.next.prev = n;
		temp.next = n;

	}

	public static void addNodeBeforeInput(int input, int value) {
		DLLNode n = new DLLNode(value);
		DLLNode temp = head;
		while (temp.next.data != input) {
			temp = temp.next;
		}

		n.next = temp.next;
		n.prev = temp;
		temp.next.prev = n;
		temp.next = n;
	}

	public static void inputAndDeleteByData(int input) {
		DLLNode temp = head;
		while (temp.next.data != input) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		temp.next.prev = temp;
	}

	public static void inputAndDeleteByPosition(int count) {
		DLLNode temp = head;
		while (count != 0) {
			temp = temp.next;
			count--;
		}
		temp.next = temp.next.next;
		temp.next.prev = temp;
	}

	public static void amountOfNodesHead() {
		DLLNode temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		System.out.println("There are " + count + " nodes in the double linked list (head).");
	}

	public static void amountOfNodesTail() {
		DLLNode temp = tail;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.prev;
		}
		System.out.println("There are " + count + " nodes in the double linked list (tail).");
	}

	public static int amountOfNodesHeadRec(int count, DLLNode head) {
		if (head == null) {
			return count;
		}
		return amountOfNodesHeadRec(count + 1, head.next);
	}

	public static int amountOfNodesTailRec(int count, DLLNode tail) {
		if (tail == null) {
			return count;
		}
		return amountOfNodesTailRec(count + 1, tail.prev);
	}

	public static int runnerRecurrsiveHead(DLLNode slow, DLLNode fast) {
		if (fast == null || fast.next == null) {
			return slow.data;
		}
		return runnerRecurrsiveHead(slow.next, fast.next.next);
	}

	public static int runnerRecurrsiveTail(DLLNode slow, DLLNode fast) {
		if (fast == null || fast.prev == null) {
			return slow.data;
		}
		return runnerRecurrsiveTail(slow.prev, fast.prev.prev);
	}

	public static int runnerRecurrsiveHeadTail(DLLNode tempStart, DLLNode tempEnd) {
		if (tempStart == tempEnd || tempStart.next == tempEnd || tempEnd.prev == tempStart) {
			return tempStart.data;
		}
		return runnerRecurrsiveHeadTail(tempStart.next, tempEnd.prev);
	}

	public static void runnerIterativeHeadTail() {
		DLLNode tempStart = head;
		DLLNode tempEnd = tail;
		System.out.println(tempStart.data + " " + tempEnd.data);

		while (tempStart != tempEnd && tempStart.next != tempEnd && tempEnd.prev != tempStart) {
			tempStart = tempStart.next;
			tempEnd = tempEnd.prev;
		}
		System.out.println("The middle number is " + tempStart.data);
	}

	public static void presentInListHead() {
		int input = 2;
		DLLNode temp = head;
		while (temp != null) {
			temp = temp.next;
			if (temp.data == input) {
				System.out.println("The number is present.");
				return;
			}
		}
		System.out.println("The number is not present.");

	}

	public static void presentInListTail() {
		int input = 2;
		DLLNode temp = tail;
		while (temp != null) {
			temp = temp.prev;
			if (temp.data == input) {
				System.out.println("The number is present.");
				return;
			}
		}
		System.out.println("The number is not present.");
	}

	public static void presentInListHeadTail() {
		int input = 2;
		DLLNode tempStart = head;
		DLLNode tempEnd = tail;

		while (tempStart != tempEnd) {
			if (tempStart.data == input || tempEnd.data == input) {
				System.out.println("The number is present");
				return;
			}
			tempStart = tempStart.next;
			tempEnd = tempEnd.prev;
		}
		System.out.println("The number is not present");
	}

	public static boolean presentInListHeadTailRec(DLLNode tempStart, DLLNode tempEnd, int input) {
		if (tempStart == tempEnd) {
			return false;
		}
		if (tempStart.data == input || tempEnd.data == input) {
			return true;
		}
		return presentInListHeadTailRec(tempStart.next, tempEnd.prev, input);
	}

	public static void iterativeTwoSum(int input) {
		DLLNode tempStart = head;
		DLLNode tempEnd = tail;
		DLLNode temp2 = tail;
		boolean flag = false;

		while (flag == false && tempStart != null) {
			if (tempEnd == null && tempStart.next != null) {
				tempStart = tempStart.next;
				tempEnd = temp2;

			}

			if (tempStart.data + tempEnd.data == input) {
				flag = true;
				System.out.println("The numbers that add up to " + input + " are " + tempStart.data + " and "
						+ tempEnd.data + ".");
				return;
			}

			tempEnd = tempEnd.prev;
		}

		if (flag == false) {
			System.out.println("No answer.");
		}
	}

	public static void advancedTwoSum(int input) {
		DLLNode tempStart = head;
		DLLNode tempEnd = tail;

		while (tempStart.next != tempEnd) {
			if (tempStart.data + tempEnd.data == input) {
				System.out.println("The numbers that add up to " + input + " are " + tempStart.data + " and "
						+ tempEnd.data + ".");
				return;
			} else if (tempStart.data + tempEnd.data > input) {
				tempEnd = tempEnd.prev;
			} else {
				tempStart = tempStart.next;
			}
		}
		System.out.println("No answer");
	}

	public static boolean recursiveTwoSum(DLLNode tempStart, DLLNode tempEnd, int input) {
		if (tempStart == tempEnd) {
			return false;
		} else if (tempStart.data + tempEnd.data == input) {
			return true;
		} else if (tempStart.data + tempEnd.data > input) {
			return recursiveTwoSum(tempStart, tempEnd.prev, input);
		} else {
			return recursiveTwoSum(tempStart.next, tempEnd, input);
		}
	}
}
