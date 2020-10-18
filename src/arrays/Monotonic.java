package arrays;
public class Monotonic {

	public static void main(String[] args) {
		int[] array = { 10, 50, 30, 40, 50, 70 };
		if(increasing(array) || decreasing(array)) {
			System.out.println("The array is monotonic.");
		}else {
			System.out.println("The array is not monotonic");
		}
	}

	public static boolean increasing(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean decreasing(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			if (array[i] < array[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
