package �ǽ�����2ȸ;

import java.util.Scanner;

public class ThreeSixNineGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("1~99 ���� ���� �ϳ��� �Է�");
		num = scan.nextInt();
		if (num == 3 || num == 6 || num == 9) {
			System.out.println("�ڼ�¦");
		} else if (num >= 10) {
			if ((num % 10) == 3 || (num % 10) == 6 || (num % 10) == 9) {
				if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9)
					System.out.println("�ڼ�¦¦");
				else
					System.out.println("�ڼ�¦¦¦");
			} else if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9)
				System.out.println("�ڼ�¦");
		}

		/*
        for (int i = 1; i <= 9999; i++) {
			if ((i % 10) == 3 || (i % 10) == 6 || (i % 10) == 9) {
				if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9)
					System.out.println(i + " �ڼ�¦¦");// �ڸ��� ���
				else
					System.out.println(i + " �ڼ�¦");// 1�� �ڸ�����
			} else if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9)
				System.out.println(i + " �ڼ�¦");// 10�� �ڸ�����
		}
		 */
	}
}
