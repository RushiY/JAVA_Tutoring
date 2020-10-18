package sorts_and_searches;

public class Sort {
	public static void main(String[] args) {
		int[] array = { 30, 40, 10, 50, 20 };
		SelectionSort(array);
		// BubbleSort(array);
		// LinearSearch(array);
		// System.out.println(LinearSearchRecurrsive(array, 0, 50));
		// System.out.println(BinarySearchRecurrsive(array, 0, array.length-1, 20));
		// BinarySearch(array);
	}

	public static void SelectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int minindex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[minindex] > array[j]) {
					minindex = j;
				}
			}
			int temp = array[i];
			array[i] = array[minindex];
			array[minindex] = temp;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void BubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i; j++) {
				if (array[j - 1] > array[j]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void LinearSearch(int[] array) {
		int num = 21;
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				System.out.println("The number was found.");
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("The number was not found.");
		}
	}

	public static String LinearSearchRecurrsive(int[] array, int index, int num) {
		if (array[index] == num) {
			return "The number was found";
		}
		if (index == array.length - 1) {
			return "The number was not found.";
		}
		return LinearSearchRecurrsive(array, index + 1, num);
	}

	public static void BinarySearch(int[] array) {
		int num = 21;
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int middle = (left + right) / 2;
			if (num == array[middle]) {
				System.out.println("Number was found");
				return;
			} else if (num > array[middle]) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}
		System.out.println("The number was not found.");
	}

	public static String BinarySearchRecurrsive(int[] array, int left, int right, int target) {
		int middle = (left + right) / 2;
		if (array[middle] == target) {
			return "The number was found.";
		}

		if (left >= right) {
			return "The number was not found.";
		}
		if (target > array[middle]) {
			return BinarySearchRecurrsive(array, middle + 1, right, target);
		} else {
			return BinarySearchRecurrsive(array, left, middle - 1, target);
		}
	}
}