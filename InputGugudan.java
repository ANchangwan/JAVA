

import java.util.Scanner;

public class InputGugudan {
	int start = 0, end = 0;
	int to = 0, from = 0;

	Scanner input = new Scanner(System.in);

	public void inputGuGudan2() {
		System.out.println("몇 단 부 터 몇 단 까지 구구단을 출력할까요?(int, int) : ");
		start = input.nextInt();
		end = input.nextInt();
		System.out.println("어느 수 부터 어느 수 까지 곱할까요(int, int)");
		to = input.nextInt();
		from = input.nextInt();

		RepeateGuGudan2();
	}

	public void RepeateGuGudan2() {
		
		for (int i = start; i <= end; i++, System.out.println()) {
			for (int j = to; j <= from; j++, System.out.print("\t")) {

				System.out.print(i + "*" + j + "=" + i * j);

			}
		}
	}
}
