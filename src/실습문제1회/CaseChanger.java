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
		//�غ� �ܰ�
		char alpha;
		
		//�Է� �ܰ�
		System.out.print("���� �� �ڸ� �Է��ϼ��� >>> ");  //System.out(ǥ�� ���)
		Scanner scan = new Scanner(System.in);  //System.in(ǥ�� �Է�)
		/*
		 * 'A' (����)		=> 65 (�ƽ�Ű�ڵ尪)
		 * "a" (���ڿ�)	=> "A\0"
		 */
		alpha = scan.next().charAt(0);  //���ڿ��� ù�ڸ��� ������ �´�
		
		if (alpha >= 'a' && alpha <= 'z') {  //&& => 'AND������', || => 'OR������'
			//�º� = �캯; �캯���� �º����� '�����Ѵ�' ��� ��.
			alpha = (char) (alpha - 32);  //"'����' = ����" => (char) ��� 'ĳ��Ʈ ������'�� ���� "'����' = '����'"�� �ٲ��� ��.
		}else if (alpha >= 'A' && alpha <= 'Z') {
			alpha = (char) (alpha + 32);
		}else {  //�ѱ��� �ԷµǾ��� ��
			System.out.println("�����ڰ� �ƴմϴ�.");
			System.exit(0);  //���α׷� ���� ����
		}
		System.out.println(alpha);
		scan.close();
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�Է� >> ");
//		char alpha = scan.next().charAt(0);  //�Է°��� ù���ڸ� �о�´�.
//		
//		if (alpha >= 'a' && alpha <= 'z') {  //�ҹ����̸� >> �빮�� ���
//			System.out.println("��� >> " + (char)(alpha - 32));
//		}
//		else if(alpha >= 'A' && alpha <= 'Z') {
//				System.out.println("��� >> " + (char)(alpha + 32));
//		}
//		else
//			System.out.println("�����ڰ� �ƴմϴ�.");
//		scan.close();
	}
}
