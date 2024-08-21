package week2.assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 3, 5, 6, 7, 9, 11, 13 };
		for (int i = 0; i <= num.length - 1; i++) {
			//System.out.println("now checking for number : " + num[i]);
			for (int j = 2; j <= num[i] - 1; j++) {
				if (num[i] % j == 0) {
					System.out.println("GIven number " + num[i] + " is not a prime number");
					break;

				} else {
					if (j == num[i] - 1) {
						System.out.println("GIven number " + num[i] + " is a prime number");
					} else {
						continue;
					}
				}

			}
		}

	}

}
