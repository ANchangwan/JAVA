package kunsan.��â��1501023;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class StudentGrade {

	Scanner input = new Scanner(System.in);
	
	
	void scoreSort(int[] student) {
		int[] temp = new int[student.length];
		for(int i=0;i<student.length;i++) {
			temp[i] = student[i];
		}
		Arrays.sort(temp);
		for(int i=0;i<temp.length;i++) {
			System.out.println((i+1)+"��° ���� ���� : "+temp[i]);
		}
		
		
	}
	
	
	void showAverageScoreAndMiddleScore(int[] student) {//5. ���� ��ռ���, ���� ������ ����
		
		int sum=0;
		for(int i=0;i<student.length;i++) {
			sum+=student[i];
		}
		System.out.println("��� ���� : "+(sum/student.length));
		System.out.println("���� ������ : "+student[(int)(student.length/2)]);
		
	}
	
	
	
	

	void showMaxScoreAndMinScore(int[] student) {//4.������ �ְ���, �������� ����

		int max = 0;
		int min = 100;
		for (int i = 0; i < student.length; i++) {
			if (student[i] > max)
				max = student[i];

			if (student[i] < min)
				min = student[i];

		}
		System.out.println("�ְ��� : " + max);
		System.out.println("�������� : " + min);

	}

	void showWantStudentScore(int[] student) {//3.�л��� ��ȣ�� ��������
		System.out.println("������� �л��� ������ �Է� : ");
		while (true) {
			try {
				int num = input.nextInt();
				System.out.println(num + "�� �л�����" + student[num - 1]);
				break;
			} catch (InputMismatchException e) {
				System.out.println("�ٽ� �Է����ּ���");
				input.nextLine();
			}
		}

	}

	void AllofScore(int[] student) {// 2.�л���ü��������Ʈ ����

		System.out.println("��ü �л��� ����");
		for (int i = 0; i < student.length; i++) {
			System.out.println((i + 1) + "��° �л� ���� " + student[i]);
		}

	}

	int[] inputStudent() {
		System.out.print("�Է��� �л��� ���� �Է����ּ���. : ");
		int numStudent = input.nextInt();
		int[] student = new int[numStudent];

		for (int i = 0; i < student.length; i++) {
			while (true) {
				try {
					
					System.out.print((i + 1) + "��°  �л��� ���� : ");
					student[i] = input.nextInt();
					if(100>student[i] && student[i]>0) {
						break;	
					}else {
						System.out.println("0�� 100���̸� �Է�");
						input.nextLine();
					}
					
				} catch (InputMismatchException e) {
					System.out.println("������ �Է����ּ���");
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
			System.out.println("1) �л����� �Է�");
			System.out.println("2) �л���ü��������Ʈ ����");
			System.out.println("3) �л��� ��ȣ�� ��������");
			System.out.println("4) ������ �ְ���, �������� ����");
			System.out.println("5) ���� ��ռ���, ���� ������ ����");
			System.out.println("6) ���� �����ؼ� ����");
			System.out.println("0) ���θ޴��� ���ư�");

			System.out.println("�Է� : ");
			selectNum = input.nextInt();

			if (selectNum == 1) {
				student = inputStudent();
			}
			if (selectNum == 2) {
				AllofScore(student);
			}
			if (selectNum == 3) {
				showWantStudentScore(student);
			}
			if(selectNum == 4) {
				showMaxScoreAndMinScore(student);
			}
			if(selectNum == 5) {
				showAverageScoreAndMiddleScore(student);
			}
			if(selectNum == 6) {
				scoreSort(student);
			}
			if(selectNum == 0) {
				MenuController student1 = new MenuController();
				student1.selectMenu();
			}
		}
	}
}