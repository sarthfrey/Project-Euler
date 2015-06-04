
public class Euler6 {

	public static void main(String[] args) {
		int sumOfSquares = 0;
		int instSquare= 0;
		int squareOfSum = 0;
		int sum = 0;
		int answer = 0;
		for (int i = 1; i <= 100; i++) {
			instSquare = i * i;
			sumOfSquares += instSquare;
		}
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		squareOfSum = sum * sum;
		answer = squareOfSum - sumOfSquares;
		System.out.println(answer);
	}

}
