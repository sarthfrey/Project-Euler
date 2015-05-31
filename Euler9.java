// Computes the product of the 3 terms in the pythagorean triplet with terms that sum to 1000
public class Euler9 {
	public static void main(String[] args) {
		int a, b, c;
		for (a = 1; a < 1000; a++) {
			for (b = 1; b < 1000; b++) {
				for (c = 1; c < 1000; c++) {
					if ((a*a + b*b == c*c) && (a + b + c == 1000)) {
						System.out.println(a*b*c);
					}
				}
			}
		}
	}
}
// Prints 31875000
