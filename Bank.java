package kunsan.��â��1501023;

import java.util.InputMismatchException;
import java.util.Scanner;

class Bank {
	Scanner input = new Scanner(System.in);
	int bankBlance = 0;
	int myMoney = 0;
	int selectNum = 0;
	String stringNumber;

	public void blance() {
		System.out.println("�ܾ� : " + bankBlance);
	}

	public void withdraw() {
		int withdraw = 0;

		while (true) {
			try {
				System.out.println("��ݾ� : ");
				withdraw = input.nextInt();

				if (bankBlance - withdraw >= 0) {
					bankBlance -= withdraw;
					System.out.println("�ܰ�: " + bankBlance);
				} else {
					System.out.println("�ܾ��� �����մϴ�.");
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("�ٽ� �Է����ּ���");
				input.nextLine();

			}
		}
	}

	public void saveingMoney() {
		while (true) {
			try {
				System.out.println("���ݾ� : ");
				myMoney = input.nextInt();
				Math.addExact(bankBlance, myMoney);
				bankBlance += myMoney;
				System.out.println("���� : " + bankBlance);
				break;

			} catch (InputMismatchException e) {
				System.out.println("���ڸ� �Է����ּ���");
				input = new Scanner(System.in);
				continue;
			}
		}
	}

	public void MenuController() {
		while (true) {
			System.out.println("-----------------------");
			System.out.println("1.����|2.���|3.�ܱ�|4.����");
			System.out.println("-----------------------");

			try {
				System.out.print("���� : ");
				stringNumber = input.next();
				selectNum = Integer.parseInt(stringNumber);

				if (selectNum == 1)
					saveingMoney();
				else if (selectNum == 2)
					withdraw();
				else if (selectNum == 3)
					blance();
				else if (selectNum == 4)
					break;
				else {
					System.out.println("�ٽ� �����ּ���");
					MenuController();
				}
			} catch (NumberFormatException e) {
				System.out.println("������ �Է����ּ���");
				input.nextLine();
			}
		}
	}
}
