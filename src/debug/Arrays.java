package debug;
public class Arrays {
	public static void main(String[] args) {
		int[] array = { -3, 5, 4, -1 };
		find(array);
		minium(array);
	}

	public static void find(int[] array) {
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < array.length - 1; i++) {
			int temp2 = array[i];
			for (int j = i + 1; j < array.length; j++) {
				if (temp2 > result) {
					result = temp2;
				}
				temp2 += array[j];
			}
		}
		System.out.println("Greatest: " + result);
	}
	
	public static void minium(int[] array) {
		int result = Integer.MAX_VALUE;
		
		for(int i= 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] - array[j] < result) {
					result = array[i] - array[j];
				}
			}
		}
		System.out.println(result);
	}
}
