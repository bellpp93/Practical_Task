package �ǽ�����1ȸ;

import java.util.Scanner;

/*
 * Ű���忡�� ���� �׼��� �Է¹޾� ��������, ������, ��õ����, õ���� �� �� ��
 * �׸��� 500¥�� ����, 100�� ¥�� ����, 50�� ¥�� ����, 10�� ¥�� ����, 1�� ¥�� ���� �� ���� ��ȯ �Ǵ��� ����ϼ���.
 * ���� ��� 56790���� �ԷµǸ� ��������  1��, ��õ���� 1��, õ���� 1��, ����� 1��, ��� 2��, ���ʿ� 1��, �ʿ� 4���̴�.
 * ��, �迭 ����, ����� Ȱ���Ͽ� ���α׷��� �ۼ��Ѵ�. for�� �̿�
 * 
 * [������]
 * �ݾ��� �Է��� �ּ���:
 */
public class ChangeMoney {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�Է� >> ");
		int money = scan.nextInt();
		
		int div = 50000;
		int[] count = new int[11];
		System.out.print("��� >> ");
		
		for (int i = 0; i < 10; i++) {
			if(!(i == 2) || (i == 4) || (i == 8)) {
				count[i] = money / div;
				money %= div;
			}
			if (count[i] != 0) {
				System.out.printf("%d�� %d��", div, count[i]);
			}
			if(i % 2 == 0) div /= 5;
			else div /= 2;
		}
		scan.close();
	}
}
