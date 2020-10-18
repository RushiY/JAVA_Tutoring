package recursion;

import java.util.*;

public class Prime {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Enter a number --> ");
		int num = key.nextInt();
		prime(num);
		System.out.println(primeRecurrsive(num, 2));
	}

	public static void prime(int num) {
		for (int i = 2; i < (int) Math.sqrt(num); i++) {
			if (num % i == 0) {
				System.out.println(num + " is not a prime number.");
				return;
			}
		}
		System.out.println(num + " is a prime number.");
	}

	public static String primeRecurrsive(int num, int i) {
		if(i >= Math.sqrt(num)) {
			return num + " is prime.";
		}
		if(num % i == 0) {
			return num + " is not prime.";
		}
		return primeRecurrsive(num, i+1);
	}
}
