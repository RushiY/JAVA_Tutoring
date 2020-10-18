package arrays;

import java.util.*;

public class ReverseRotation {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int[] array = { 10, 20, 30, 40, 50 };

		System.out.print("Enter a rotation amount --> ");
		int k = key.nextInt();

		Recurrsion(array, 0, array.length - 1);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		Advanced(array, 0, array.length - 1);
		Advanced(array, 0, k - 1);
		Advanced(array, k, array.length - 1);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}

		int[] array2 = new int[] { 1, 2, 3, 4, 5 };

		System.out.print("Enter a rotation amount --> ");
		int n = key.nextInt();

		System.out.println("Original array: ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}

		for (int i = 0; i < n; i++) {
			int j = 0;
			int last = array2[array2.length - 1];

			for (j = array2.length - 1; j > 0; j--) {
				array2[j] = array2[j - 1];
			}
			array2[0] = last;
		}

		System.out.println();

		System.out.println("Array after rotation: ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		
		int[] array3 = {10,10,20,20,20,30,30,40,50,50,50};
        DuplicatesRemoved(array3);
	}

	public static void Advanced(int[] array, int start, int end) {

		while (start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}

	public static void Recurrsion(int[] array, int start, int end) {
		if (start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			Recurrsion(array, start + 1, end - 1);
		}

	}
	
	public static void DuplicatesRemoved(int[] array)
    {
        int[] temp = new int[11];
        temp[0] = array[0];
        int j = 1;
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] != array[i-1])
            {
                temp[j] = array[i];
                j+=1;
            }
        }
        
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(temp[i] + " ");
        }
    }
}
