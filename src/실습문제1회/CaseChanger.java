package �ǽ�����1ȸ;

import java.util.Scanner;

/*
 * Scanner Ŭ������ �̿��Ͽ� Ű���忡�� ������ �� �ڸ� �Է¹޾� �ҹ����̸� �빮�ڷ�
 * �빮���̸� �ҹ��ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * ��, �Էµ� ���ڰ� �����ڰ� �ƴϸ� "�����ڰ� �ƴմϴ�."�� ����Ѵ�.
 * ��, �ѱ� ������ �ԷµǸ� "�����ڰ� �ƴմϴ�."�� ���
 * 
 * [������]
 * ���� �� �ڸ� �Է��ϼ���: a => A
 * ���� �� �ڸ� �Է��ϼ���: A => a
 * ���� �� �ڸ� �Է��ϼ���: �� => �����ڰ� �ƴմϴ�.
 * 
 * [�ƽ�Ű�ڵ尪]
 * a�� 97, A�� 65 => 97 - 65 = 32
 */
public class CaseChanger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�Է� >> ");
		char alpha = scan.next().charAt(0);  //�Է°��� ù���ڸ� �о�´�.
		
		if (alpha >= 'a' && alpha <= 'z') {  //�ҹ����̸� >> �빮�� ���
			System.out.println("��� >> " + (char)(alpha - 32));
		}
		else if(alpha >= 'A' && alpha <= 'Z') {
				System.out.println("��� >> " + (char)(alpha + 32));
		}
		else
			System.out.println("�����ڰ� �ƴմϴ�.");
		scan.close();
	}
}
