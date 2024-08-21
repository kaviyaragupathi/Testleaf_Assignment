package week2.assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1[] = { 3, 2, 11, 4, 6, 7 };
		int num2[] = { 1, 2, 8, 4, 9, 6 ,90};

		for (int i = 0; i <= num1.length - 1; i++) {
			// System.out.println("Number and value is " + i + " " + num1[i]);
			int found = 0;
			for (int j = 0; j <= num2.length - 1; j++) {
				// System.out.println("Number and value is " + j + " " + num2[j]);
				if (num1[i] == num2[j]) {
					found = 1;
					break;
				}

			}

			if (found == 1) {
				System.out.println("Intersection numbers are " + num1[i]);
			}

		}

	}

}
