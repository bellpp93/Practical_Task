package �ǽ�����1ȸ;

import java.util.Scanner;

/*
 * Ű����κ��� Ư�� �⵵�� �Է¹޾� �������� �ƴ����� �Ǻ��ϴ� ���α׷��� �ۼ��ϼ���.
 * ������ 4�� ������ �������� �ش� �켱 �������� �ϵ�, �� �߿��� 100���� ������ �������� �ش� ������� �ϰ�,
 * �ٸ� 400���� �������� �ش� �ٽ� �������� �����Ѵ�.
 * ��, if��, ��������(&&,||)�� Ȱ���Ͽ� ���α׷��� �ۼ��Ѵ�.
 * 
 * [������]
 * ������ �Է��ϼ���.
 * 2018 >> ����Դϴ�.
 * 2019 >> ����Դϴ�.
 * 2020 >> �����Դϴ�.
 */
public class LeapyearCommonyear {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "���� �����Դϴ�.");
		}else {
			System.out.println(year + "���� ����Դϴ�.");
		}
		scan.close();
	}
}
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("Ư�� ������ �Է��ϼ��� >> ");
		int year = scan.nextInt();
		
	if (year % 4 == 0) 
			if (year % 400 == 0) 
				System.out.println(year + "���� �����Դϴ�.");
			else if (year % 100 == 0)
				System.out.println(year + "���� ����Դϴ�.");
			else
				System.out.println(year + "���� �����Դϴ�.");
	else
			System.out.println(year + "���� ������ �ƴմϴ�.");
			
		scan.close();
		*/

