package trees;

public class Traversals {

	public static void main(String[] args) {
		Node root = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		Node six = new Node(6);
		Node seven = new Node(7);

		root.left = two;
		root.right = three;
		two.left = four;
		two.right = five;
		three.left = six;
		three.right = seven;

		// inOrder(root);
		// preOrder(root);
		// postOrder(root);

		// System.out.println(maxium(root));
		// System.out.println(amount(root));
		System.out.println(leaf(root));

	}

	public static void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}

	public static void preOrder(Node root) {
		if (root == null) {
			return;
		}

		System.out.println(root.data);
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void postOrder(Node root) {
		if (root == null) {
			return;
		}

		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data);
	}

	public static int maxium(Node root) {

		if (root == null) {
			return -1;
		}

		return Math.max(root.data, Math.max(maxium(root.left), maxium(root.right)));
	}

	public static int amount(Node root) {
		if (root == null) {
			return 0;
		}

		return amount(root.left) + amount(root.right) + 1;
	}

	public static int leaf(Node root) {
		if (root == null) {
			return 0;
		}

		if (root.left == null && root.right == null) {
			return 1;
		}
		return leaf(root.left) + leaf(root.right);
	}

}