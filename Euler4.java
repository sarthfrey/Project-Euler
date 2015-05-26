// Computes the greatest palindromic product of two 3 digit natural numbers
public class Euler4 {
	public static void main (String[] args) {
		int x;
		int largestPalindrome = 0;
		String xString = "blah";
		String xStringReverse = "halb";
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				x = i * j;
				xString = Integer.toString(x);
				xStringReverse = reverse(xString);
				if((xString.equals(xStringReverse)) && (x > largestPalindrome)) {
					largestPalindrome = x;
				}
			}
		}
		System.out.println(largestPalindrome);
	}
	public static String reverse(String str) {
		if ((null == str) || (str.length() <= 1)) {
			return str;
		}
		return (reverse(str.substring(1)) + str.charAt(0)).toString();
	}
}
// Prints 906609
