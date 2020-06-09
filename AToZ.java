

import java.util.InputMismatchException;

class AToZ {

	void print() {
		try {
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	
	}catch(InputMismatchException e) {
		System.out.println("다시 입력해주세요.");
	}
}

}
