// Computes the sum of all the primes below 2000000
public class Euler10 {
	public static void main(String[] args) {
		boolean isPrime;
		long sum = 0L;
		for (int i = 2; i < 2000000; i++) {
			isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
// Prints 142913828922