package arrays;

import java.util.*;

public class Matrix {

	public static void main(String[] args) {
		// matrix();
		// matrixUnknown();
		// largest();
		// unique();
		// frequency();
		// maxiumRow();
		//zigzag();
		reverse();
	}

	public static void matrix() {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
		}
	}

	public static void matrixUnknown() {
		Scanner key = new Scanner(System.in);
		int[][] array = new int[3][3];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print("Enter the value for " + i + ", " + j + ": ");
				int input = key.nextInt();
				array[i][j] = input;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void largest() {
		int[][] array = { { 3, 2, 6 }, { 1, 5, 9 }, { 7, 3, 11 } };
		int greatest = 0;
		for (int i = 1; i < array.length; i++) {
			for (int j = 1; j < array[0].length; j++) {
				if (array[i][j] > greatest) {
					greatest = array[i][j];
				}
			}
		}
		System.out.println("The greatest element is: " + greatest);
	}

	public static void unique() {
		int[][] array = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int unique = array[0][0];
		for (int i = 1; i < array.length; i++) {
			for (int j = 1; j < array[0].length; j++) {
				if (array[i][j] != unique) {
					System.out.println("The array is not unique.");
					return;

				}
			}
			System.out.println("The array is unique.");
		}

	}

	public static void frequency() {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 3 }, { 7, 8, 9 } };
		int input = 3;
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] == input) {
					counter++;
				}
			}
		}
		System.out.println("The frequency of " + input + " is " + counter);
	}

	public static void maxiumRow() {
		int[][] array = { { 3, 2, 6 }, { 1, 5, 9 }, { 7, 3, 11 } };

		for (int i = 0; i < array.length; i++) {
			int maxium = 0;
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] > maxium) {
					maxium = array[i][j];
				}
			}
			System.out.println("The maxium for row " + i + " is " + maxium);
		}
	}

	public static void zigzag() {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 3 }, { 7, 8, 9 }, { 7, 2, 9 } };
		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				for (int j = array[0].length - 1; j >= 0; j--) {
					System.out.print(array[i][j]);
				}
			} else {
				for (int j = 0; j < array[0].length; j++) {
					System.out.print(array[i][j]);
				}
			}
			System.out.println();
		}
	}
	
	public static void reverse(){
		int[][] array = { { 1, 2, 3 }, { 4, 5, 3 }, { 7, 8, 9 } };

	    System.out.println();
	    for (int i = array.length -1; i >=0 ; i--) {
	        for (int j = array[0].length -1; j >=0 ; j--) {
	            System.out.print(array[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
}
