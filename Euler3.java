// Computes the largest prime factor of 600851475143
public class Euler3 {
	public static void main(String [] args) {
		long largestPrime = 0L;
		long x = 600851475143L;
		boolean isPrime = true;
		for (long i = 2L; i < x; i++) {
			isPrime = true;
			if (x % i == 0) {
				for (long j = 2L; j < i; j++) {
					if (i % j == 0) {
						isPrime = false;
					}
				}
				if (isPrime && (i > largestPrime)) {
					largestPrime = i;
				}
			}
		}
		System.out.println(largestPrime);
	}
}
// Prints 6857
