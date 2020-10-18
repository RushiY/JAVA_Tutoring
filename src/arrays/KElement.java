package arrays;

import java.util.*;

public class KElement {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Enter a value --> ");
		int find = key.nextInt();
		int[] array = { 10, 14, 7, 15, 8, 20 };
		System.out.println(Largest(array, find));
	}

	public static String Largest(int[] array, int k) {
		Arrays.sort(array);
		System.out.println("K is: " + k);
		return "The kth largest is: " + array[array.length - k];
	}
}
