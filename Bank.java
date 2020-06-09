

import java.util.InputMismatchException;
import java.util.Scanner;

class Bank {
	Scanner input = new Scanner(System.in);
	int bankBlance = 0;
	int myMoney = 0;
	int selectNum = 0;
	String stringNumber;

	public void blance() {
		System.out.println("잔액 : " + bankBlance);
	}

	public void withdraw() {
		int withdraw = 0;

		while (true) {
			try {
				System.out.println("출금액 : ");
				withdraw = input.nextInt();

				if (bankBlance - withdraw >= 0) {
					bankBlance -= withdraw;
					System.out.println("잔고: " + bankBlance);
				} else {
					System.out.println("잔액이 부족합니다.");
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("다시 입력해주세요");
				input.nextLine();

			}
		}
	}

	public void saveingMoney() {
		while (true) {
			try {
				System.out.println("예금액 : ");
				myMoney = input.nextInt();
				Math.addExact(bankBlance, myMoney);
				bankBlance += myMoney;
				System.out.println("총합 : " + bankBlance);
				break;

			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력해주세요");
				input = new Scanner(System.in);
				continue;
			}
		}
	}

	public void MenuController() {
		while (true) {
			System.out.println("-----------------------");
			System.out.println("1.예금|2.출금|3.잔금|4.종료");
			System.out.println("-----------------------");

			try {
				System.out.print("선택 : ");
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
					System.out.println("다시 눌러주세요");
					MenuController();
				}
			} catch (NumberFormatException e) {
				System.out.println("정수를 입력해주세요");
				input.nextLine();
			}
		}
	}
}
