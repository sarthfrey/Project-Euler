public class Euler7 {
	public static void main(String[] args) {
		boolean divisible; // Indicates if a number is prime by that point in iteration
		int counter = 0; // # of primes identified
		for (int i = 2; i < 10000000; i++) {
			divisible = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					divisible = true;
				}
			}
			if (!divisible) {
				counter++;
				if (counter == 10001) {
					System.out.println(i);
				}
			}
		}
	}
}
