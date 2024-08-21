package week2.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int input= 20;
	int num1=0;
	int num2=1;
	System.out.print("fibonacci serties are " +num1+" "+num2);
	for(int i=2;i<=input;i++) {
		int num3=num1+num2;
		System.out.print(" "+num3);
		num1=num2;
		num2= num3;
	}

	}

}
