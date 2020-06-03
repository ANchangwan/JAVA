package kunsan.안창완1501023;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputNumAndSum {
	Scanner input = new Scanner(System.in);
	int numx, numy, sum = 0;
	
	public void InputNumSum() {// 4) 정수 x와 y를 입력받아, x부터 y까지 더하는 과정과 결과 보이기
		
		try {
		System.out.println("정수 x와 y를 입력해주세요.");
		numx = input.nextInt();
		numy = input.nextInt();

		if (numx < numy) {
			inputNumSum1();
		} 
		else {
			InputNumSum2();
		}
		}catch(InputMismatchException e) {
			System.out.println("정수를 입력해주세요");
		}
	}
	
	public void inputNumSum1() {// 4)
		for (int i = numx; i <= numy; i++) {
			// System.out.println("+");

			System.out.println(sum + "+" + i);
			sum += i;
			System.out.println("=" + sum);
		}
		System.out.println("합계 : " + sum);
	}

	public void InputNumSum2() {// 4)
		for (int i = numx; i >= numy; i--) {
			System.out.println(sum + "+" + i);
			sum += i;
			System.out.println("=" + sum);
		}
		System.out.println("합계 : " + sum);
	}
}
