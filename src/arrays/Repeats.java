package arrays;

import java.util.Arrays;

public class Repeats {

	public static void main(String[] args) {
		int[] array = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8,
				9 };
		repeats(array);
	}

	public static void repeats(int[] array) {
		int[] unique = new int[array.length];
		unique[0] = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] != array[i - 1]) {
				unique[i] = array[i];

			} 
		}
		Arrays.sort(unique);
		for (int i = 0; i < unique.length; i++) {
			if (unique[i] != 0 && array[i] != 0) {
				System.out.print(unique[i] + " ");
			} else {
				if (unique[i] != 0) {
					System.out.print(0 + " ");
					System.out.print(unique[i] + " ");
				}
			}
		}
	}
}
