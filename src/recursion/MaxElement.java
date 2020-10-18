package recursion;

public class MaxElement {

	public static void main(String[] args) {
		int[] array = {10,30,20,50,40};
		System.out.println(min(array, array.length));
	}

	public static int min(int[] array, int n) {
		if(n == 1) {
			return array[0];
		}
		return Math.min(min(array,n-1), array[n-1]);
	}
	
	public static int max(int[] array, int n) {
		if(n == 1) {
			return array[0];
		}
		return Math.max(max(array,n-1), array[n-1]);
	}
}
