package kunsan.��â��1501023;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputNumAndSum {
	Scanner input = new Scanner(System.in);
	int numx, numy, sum = 0;
	
	public void InputNumSum() {// 4) ���� x�� y�� �Է¹޾�, x���� y���� ���ϴ� ������ ��� ���̱�
		
		try {
		System.out.println("���� x�� y�� �Է����ּ���.");
		numx = input.nextInt();
		numy = input.nextInt();

		if (numx < numy) {
			inputNumSum1();
		} 
		else {
			InputNumSum2();
		}
		}catch(InputMismatchException e) {
			System.out.println("������ �Է����ּ���");
		}
	}
	
	public void inputNumSum1() {// 4)
		for (int i = numx; i <= numy; i++) {
			// System.out.println("+");

			System.out.println(sum + "+" + i);
			sum += i;
			System.out.println("=" + sum);
		}
		System.out.println("�հ� : " + sum);
	}

	public void InputNumSum2() {// 4)
		for (int i = numx; i >= numy; i--) {
			System.out.println(sum + "+" + i);
			sum += i;
			System.out.println("=" + sum);
		}
		System.out.println("�հ� : " + sum);
	}
}
