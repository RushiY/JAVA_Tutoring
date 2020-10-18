package double_linked_list;

public class DLLNode {
	int data;
	DLLNode next;
	DLLNode prev;
	
	public DLLNode(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}
