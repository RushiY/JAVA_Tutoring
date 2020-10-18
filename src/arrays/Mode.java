package arrays;

import java.util.*;

public class Mode {

	public static void main(String[] args) {
		int[] array = { 1, 1, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3 };
		mode(array);
	}

	public static void mode(int[] array) {
		int[] unique = new int[array.length];
		int[] count = new int[array.length];
		int counter = 0;
		unique[0] = array[0];
		for (int i = 1; i < array.length - 1; i++) {
			if (array[i] != array[i - 1]) {
				unique[i] = array[i];

			}
		}

		Arrays.sort(unique);
		int i = 0;

		for (int k = 0; k < unique.length; k++) {
			for (i = 0; i < array.length; i++) {
				if (unique[k] == array[i]) {
					counter++;
				}
			}
			count[k] = counter;
			counter = 0;
		}

		int greatest = 0;
		for (int m = 1; m < count.length; m++) {
			if (count[m] > count[m - 1]) {
				greatest = m;
			}
		}

		System.out.println(unique[greatest]);
	}
}