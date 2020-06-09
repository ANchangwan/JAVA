
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class StudentGrade {

	Scanner input = new Scanner(System.in);

	void scoreSort(int[] student) {
		int[] temp = new int[student.length];
		for (int i = 0; i < student.length; i++) {
			temp[i] = student[i];
		}
		Arrays.sort(temp);
		for (int i = 0; i < temp.length; i++) {
			System.out.println((i + 1) + "번째 성적 정렬 : " + temp[i]);
		}

	}

	void showAverageScoreAndMiddleScore(int[] student) {// 5. 성적 평균성적, 성적 중위값 성적

		int sum = 0;
		int size = student.length;
		for (int i = 0; i < student.length; i++) {
			sum += student[i];
		}
		System.out.println("평균 성적 : " + (sum / student.length));
		if (size % 2 == 0) {
			int m = size / 2;
			int n = (size / 2) - 1;
			System.out.println("성적 중위값 : " + (int) (student[m] + student[n]) / 2);
		} else {
			int m = size / 2;
			System.out.println("성적 중위값 : " + student[m]);
		}
	}

	void showMaxScoreAndMinScore(int[] student) {// 4.성적의 최고성적, 최저성적 보기

		int max = 0;
		int min = 100;
		for (int i = 0; i < student.length; i++) {
			if (student[i] > max)
				max = student[i];

			if (student[i] < min)
				min = student[i];

		}
		System.out.println("최고성적 : " + max);
		System.out.println("최저성적 : " + min);

	}

	void showWantStudentScore(int[] student) {// 3.학생의 번호로 성적보기
		System.out.println("보고싶은 학생의 성적을 입력 : ");
		while (true) {
			try {
				int num = input.nextInt();
				System.out.println(num + "번 학생성적 :" + student[num - 1]);
				break;
			} catch (InputMismatchException e) {
				System.out.println("다시 입력해주세요");
				input.nextLine();
			}
		}

	}

	void AllofScore(int[] student) {// 2.학생전체성적리스트 보기

		System.out.println("전체 학생의 성적");
		for (int i = 0; i < student.length; i++) {
			System.out.println((i + 1) + "번째 학생 성적 " + student[i]);
		}

	}
	
	int[] addStudent(int[] student, int numStudent, int index) {
	      int[] temp = student;      
	      student = new int[numStudent + index];
	      
	      for (int i = 0; i < index; i++) {
	         student[i] = temp[i];
	      }
	      return student;
	   }
	
	
	int[] inputStudent(int[] student) {
		System.out.print("입력할 학생의 수를 입력해주세요. : ");
		int numStudent = input.nextInt();
		
		int index=student.length;
		
		
		
		student=addStudent(student,numStudent,index);
	
		
		for (int i = index; i < index+numStudent; i++) {
			while (true) {
	
				try {

					System.out.print((i + 1) + "번째  학생의 성적 : ");
					student[i] = input.nextInt();
					if (100 > student[i] && student[i] > 0) {
						
						break;
					} else {
						System.out.println("0과 100사이를 입력");
						input.nextLine();
					}

				} catch (InputMismatchException e) {
					System.out.println("정수를 입려해주세요");
					input.nextLine();
				}
			}
		}

		return student;
	}

	void menuContlloer() {
		int[] student = new int[0];
		int selectNum = 0;

		while (true) {
			System.out.println("1) 학생성적 입력");
			System.out.println("2) 학생전체성적리스트 보기");
			System.out.println("3) 학생의 번호로 성적보기");
			System.out.println("4) 성적의 최고성적, 최저성적 보기");
			System.out.println("5) 성적 평균성적, 성적 중위값 성적");
			System.out.println("6) 성적 정렬해서 보기");
			System.out.println("0) 메인메뉴로 돌아감");

			System.out.println("입력 : ");
			selectNum = input.nextInt();

			if (selectNum == 1) {
				student = inputStudent(student);
			}
			if (selectNum == 2) {
				AllofScore(student);
			}
			if (selectNum == 3) {
				showWantStudentScore(student);
			}
			if (selectNum == 4) {
				showMaxScoreAndMinScore(student);
			}
			if (selectNum == 5) {
				showAverageScoreAndMiddleScore(student);
			}
			if (selectNum == 6) {
				scoreSort(student);
			}
			if (selectNum == 0) {
				MenuController student1 = new MenuController();
				student1.selectMenu();
			}
		}
	}
}
