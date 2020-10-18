package arrays;

import java.util.*;

public class FLPositions {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Enter a target number --> ");
		int target = key.nextInt();
		int[] array = { 5, 7, 8, 10, 8, 7 };
		positions(array, target);
	}

	public static void positions(int[] array, int target) {
		int[] index = new int[1];
		int k = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				index[k] = i;
				break;
			}
		}
		int l = 0;
		for (int i = array.length - 1; i > 1; i--) {
			if (array[i] < array[i - 1] && array[i] == target) {
				l = i;
			}
		}

		System.out.println(index[0] + " is the first position.\n" + l + " is the last position.");
	}
}