public class Euler2 {
	public static void main(String[] args) {
		int firstNumberInstance = 1;
		int secondNumberInstance = 2;
		int temp = 0;
		int sum = 2;
		while(secondNumberInstance <= 4000000)
		{
			temp = firstNumberInstance + secondNumberInstance;
			firstNumberInstance = secondNumberInstance;
			secondNumberInstance = temp;
			if (secondNumberInstance % 2 == 0)
			{
				sum += secondNumberInstance;
			}
		}
		System.out.println(sum);
	}

}
