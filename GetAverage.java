package kunsan.��â��1501023;

import java.util.Scanner;
import java.util.InputMismatchException;

public class GetAverage {
	Scanner input = new Scanner(System.in);

	public void getAverage() {// 2) �Էµ� ���� ��հ� ���� ���ϱ��ؼ� ȭ�鿡 ����Ʈ�ϱ�

		System.out.println("2) �Էµ� ���� ��հ� ���� ���ϱ��ؼ� ȭ�鿡 ����Ʈ�ϱ�");
		System.out.println("-1�� ������ ����˴ϴ�.");
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
				System.out.println("�߸��� �Է��Դϴ�.");
				input.nextLine();
			}
		}
		try {
			average = sum / count;
			System.out.println("�Էµ� �� : " + count);
			System.out.println("��� : " + average);
		} catch (ArithmeticException e) {
			System.out.println("0�� ���� �� �����ϴ�.");
		}
	}
}
