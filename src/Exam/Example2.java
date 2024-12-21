package Exam;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		int n = 30;
		int firstTerm = 0, secondTerm = 1;

		System.out.println("Fibonacci Series up to " + n + " terms:");

		for (int i = 1; i <= n; ++i) {
			System.out.print(firstTerm + ", ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;

			int k = nextTerm % 10;
//            if (k == 2) {
			System.out.println(k);
		}
	}

}
