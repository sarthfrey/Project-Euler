public class Euler5 {
	public static void main(String[] args) {
		boolean isNotDivisible = true;
		int answer = 0;
			for (int i = 1; i<300000000; i++) {
				isNotDivisible = false;
				for (int j = 1; j <= 20; j++) {
					if (i % j != 0) {
						isNotDivisible = true;
					}
				}
				if (isNotDivisible == false) {
					answer = i;
					System.out.println(answer);
				}
			}
		}
}
