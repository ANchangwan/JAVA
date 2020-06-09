

import java.util.Scanner;

class CoffeePrice {
	Scanner input = new Scanner(System.in);
	int price = 0;

	void selectCoffeeMenu() {// 1) 커피 메뉴를 넣으면 가격을 출력해 주는 프로그램
		int addMenu = 0;
		
		for (;;) {
			System.out.println("메뉴를 선택해주세요 : ");
			String selectCoffee = input.next();
			selectCoffee(selectCoffee);
			if (price != 0) {
				break;
			}
		}
	}


	public void selectCoffee(String selectCoffee) {
		switch (selectCoffee) {
		case "아메리카노":
			coffeeMenu1();
			break;
		case "카라멜마끼아또":
			coffeeMenu3();
			break;
		default:
			System.out.println("없는 메뉴입니다. 다시 입력해주세요");
			selectCoffeeMenu();

		}
	}

	public void coffeeMenu1() {
		System.out.println("가격 : 2000원");
		price = 2000;

	}

	public void coffeeMenu2() {
		System.out.println("가격 : 2500원");
		price = 2500;
	}

	public void coffeeMenu3() {
		System.out.println("가격 : 3500원");
		price = 3500;
	}
}
