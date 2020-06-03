package kunsan.안창완1501023;

import java.util.InputMismatchException;
import java.util.Scanner;

class MenuController {
	Scanner input = new Scanner(System.in);

	void selectsView() {
		System.out.println("1) 커피 메뉴를 넣으면 가격을 출력해 주는 프로그램");
		System.out.println("2) 입력된 수의 평균과 갯수 구하기해서 화면에 프린트하기");
		System.out.println("3) 알파벳 A부터 Z까지 프린트하기");
		System.out.println("4) 정수 x와 y를 입력받아, x부터 y까지 더하는 과정과 결과 보이기");
		System.out.println("5) 99단 단순 찍기");
		System.out.println("6) 99단 출력단수와 수의 범위 설정해서 프린트하기");
		System.out.println("7) 은행 프로그램");
		System.out.println("8) 학생성적입력");
		System.out.println("0) 종료");
		System.out.print("선택 : ");
	}

	void selectMenu() {
		int selectNum = 0;

		while (true) {
			selectsView();
			try {
				selectNum = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못된 입력입니다 다시 입력하세요.");
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
