package sample;

import java.util.Scanner;


public class OddOrEven {
	int num;

	public void check(int number) {
		if (number % 2 == 0) {
			System.out.println("The numer is even");
		} else {
			System.out.println("The number is odd");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numer");
		OddOrEven o1 = new OddOrEven();
		o1.num = sc.nextInt();
		o1.check(o1.num);

	}
}
