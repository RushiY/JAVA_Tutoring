package recursion;

import java.util.*;

public class StringMinMaxIntRecurrsion {
	public static void main(String[] args) {
		System.out.println(rec(4));

		String word = "maam";
		boolean check = Palandrom(0, word.length() - 1, word);
		System.out.println(check);

		int[] array = { 3, 2, 1, 4, 5 };
		System.out.println(IterativeMax(array));
		System.out.println(IterativeMin(array));

		int[] array1 = { 1, 2, 3, 4, 5 };
		System.out.println(AddUp(0, array1, 0));

		int[] array2 = { 3, 2, 5, 1, 4 };
		int size = array2.length;
		System.out.println(RecurrsionMax(array2, size));
		System.out.println(RecurrsionMin(array2, size));

		Scanner key = new Scanner(System.in);
		System.out.print("Enter a number --> ");
		int num = key.nextInt();
		int newNum = (int) Math.sqrt(num);
		boolean flag = false;

		for (int i = 2; i <= newNum; i++) {
			if (num % i == 0) {
				System.out.println(num + "  not prime.");
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println(num + " is prime.");
		}
		System.out.println(Prime(num, 2));
	}

	public static int rec(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * rec(n - 1);
		}
	}

	public static boolean Palandrom(int start, int end, String word) {
		if (word.charAt(start) != word.charAt(end)) {

			return false;
		}
		if (start >= end) {
			return true;

		}
		return Palandrom(start + 1, end - 1, word);
	}

	public static int IterativeMax(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static int IterativeMin(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static int AddUp(int index, int[] array, int sum) {
		if (index == array.length) {
			return sum;
		}
		return AddUp(index + 1, array, sum + array[index]);
	}

	public static int RecurrsionMax(int[] array, int size) {
		if (size == 1) {
			return array[0];
		}
		return Math.max(RecurrsionMax(array, size - 1), array[size - 1]);
	}

	public static int RecurrsionMin(int[] array, int size) {
		if (size == 1) {
			return array[0];
		}
		return Math.min(RecurrsionMin(array, size - 1), array[size - 1]);
	}

	public static String Prime(int num, int index) {
		if (num % index == 0) {
			return num + " is not prime.";
		}
		if (index == (int) Math.sqrt(num)) {
			return num + " is prime.";
		}
		return Prime(num, index + 1);
	}
}