package kunsan.��â��1501023;

import java.util.Scanner;

class CoffeePrice {
	Scanner input = new Scanner(System.in);
	int price = 0;

	void selectCoffeeMenu() {// 1) Ŀ�� �޴��� ������ ������ ����� �ִ� ���α׷�
		int addMenu = 0;
		
		for (;;) {
			System.out.println("�޴��� �������ּ��� : ");
			String selectCoffee = input.next();
			selectCoffee(selectCoffee);
			if (price != 0) {
				break;
			}
		}
	}


	public void selectCoffee(String selectCoffee) {
		switch (selectCoffee) {
		case "�Ƹ޸�ī��":
			coffeeMenu1();
			break;
		case "ī��Ḷ���ƶ�":
			coffeeMenu3();
			break;
		default:
			System.out.println("���� �޴��Դϴ�. �ٽ� �Է����ּ���");
			selectCoffeeMenu();

		}
	}

	public void coffeeMenu1() {
		System.out.println("���� : 2000��");
		price = 2000;

	}

	public void coffeeMenu2() {
		System.out.println("���� : 2500��");
		price = 2500;
	}

	public void coffeeMenu3() {
		System.out.println("���� : 3500��");
		price = 3500;
	}
}
