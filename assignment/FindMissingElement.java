package week2.assignment;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 101, 104, 103, 102, 108, 106, 107, 111 };
		Arrays.sort(input);
		for (int j = input[0]; j <= input[input.length - 1]; j++) {
			int found = 0;
			
			for (int i = 0; i < input.length; i++) {
				if (j == input[i]) {
					found = 1;
					break;
				}
			}
			if (found == 0) {
				System.out.println("Missing number is "+j);
			}

		}

	}

}
