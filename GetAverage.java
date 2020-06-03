package kunsan.안창완1501023;

import java.util.Scanner;
import java.util.InputMismatchException;

public class GetAverage {
	Scanner input = new Scanner(System.in);

	public void getAverage() {// 2) 입력된 수의 평균과 갯수 구하기해서 화면에 프린트하기

		System.out.println("2) 입력된 수의 평균과 갯수 구하기해서 화면에 프린트하기");
		System.out.println("-1을 누르면 종료됩니다.");
		NumResult();
	}

	public void NumResult() { // 2)
		int writeNum = 0, sum = 0;
		double average = 0;
		int count = 0;

		while (writeNum != -1) {

			try {
				writeNum = input.nextInt();
				if (writeNum != -1) {
					sum += writeNum;
					count++;
				}
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다.");
				input.nextLine();
			}
		}
		try {
			average = sum / count;
			System.out.println("입력된 수 : " + count);
			System.out.println("평균 : " + average);
		} catch (ArithmeticException e) {
			System.out.println("0을 나눌 수 없습니다.");
		}
	}
}
