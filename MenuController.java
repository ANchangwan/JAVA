package kunsan.��â��1501023;

import java.util.InputMismatchException;
import java.util.Scanner;

class MenuController {
	Scanner input = new Scanner(System.in);

	void selectsView() {
		System.out.println("1) Ŀ�� �޴��� ������ ������ ����� �ִ� ���α׷�");
		System.out.println("2) �Էµ� ���� ��հ� ���� ���ϱ��ؼ� ȭ�鿡 ����Ʈ�ϱ�");
		System.out.println("3) ���ĺ� A���� Z���� ����Ʈ�ϱ�");
		System.out.println("4) ���� x�� y�� �Է¹޾�, x���� y���� ���ϴ� ������ ��� ���̱�");
		System.out.println("5) 99�� �ܼ� ���");
		System.out.println("6) 99�� ��´ܼ��� ���� ���� �����ؼ� ����Ʈ�ϱ�");
		System.out.println("7) ���� ���α׷�");
		System.out.println("8) �л������Է�");
		System.out.println("0) ����");
		System.out.print("���� : ");
	}

	void selectMenu() {
		int selectNum = 0;

		while (true) {
			selectsView();
			try {
				selectNum = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("�߸��� �Է��Դϴ� �ٽ� �Է��ϼ���.");
				input.nextLine();
				selectMenu();
			}

			if (selectNum == 1) {
				CoffeePrice coffee = new CoffeePrice();
				coffee.selectCoffeeMenu();
			} else if (selectNum == 2) {
				GetAverage average = new GetAverage();
				average.getAverage();

			} else if (selectNum == 3) {
				AToZ alphabet = new AToZ();
				alphabet.print();
			} else if (selectNum == 4) {

				InputNumAndSum numSum = new InputNumAndSum();
				numSum.InputNumSum();

			} else if (selectNum == 5) {

				NormalGugudan normal = new NormalGugudan();
				normal.InputGuGudan();

			} else if (selectNum == 6) {
				InputGugudan dan = new InputGugudan();
				dan.inputGuGudan2();
			} else if (selectNum == 7) {
				Bank blance = new Bank();
				blance.MenuController();
				
			}else if(selectNum ==8) {
				StudentGrade student = new StudentGrade();
				student.menuContlloer();
			}
			else if (selectNum == 0)
				break;
		}
	}
}
