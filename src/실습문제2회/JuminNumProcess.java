package �ǽ�����2ȸ;

import java.util.Scanner;
import java.util.Spliterator;

public class JuminNumProcess {

	public static void main(String[] args) {
//		�غ� �ܰ� => ���� ����, �迭 ���� => �޸��� �Ϻ�(�׸�)
		//(�������� �ּҰ�)
		String juminNum;  //Ű����κ��� �Է��� �ֹι�ȣ ���ڿ� ��ü�� �ּҰ��� ����� ��ü ��������
		
//		�Է� �ܰ�
		System.out.print("�ֹι�ȣ �Է� >>> ");
		Scanner scan = new Scanner(System.in);
		juminNum = scan.next();
		
//		ó�� �ܰ� => ������� ����(if��, switch��, for��, while��, continue, break ��) => logic
		//logic => �ΰ��� ������ ��� => �־��� ������ ��� �ذ��Ұ����� ���?
		String frontJumin = juminNum.substring(0, 6);
		String backJumin = juminNum.substring(7, 14);
		
//		��� �ܰ�
		System.out.println("�ֹι�ȣ �� 6�ڸ�: " + frontJumin);
		System.out.println("�ֹι�ȣ �� 7�ڸ�: " + backJumin);
		
		System.out.println();  //�ٹٲ�
		//[�ذ� ���2]
		String[] token = juminNum.split("-");
		String frontString = token[0];
		String backString = token[1];
		
		System.out.println("�ֹι�ȣ �� 6�ڸ�: " + frontString);
		System.out.println("�ֹι�ȣ �� 7�ڸ�: " + backString);
		
		System.out.println();  //�ٹٲ�
		//[�߿�] �ǹ� ���
		//"971025-1054171" => "971025-1******" => ����ŷ(masking) ó��
		String juminNumMasking = backString.replace(backString.substring(1), "******");
		
		System.out.println("<< �ֹι�ȣ ���ڸ� ����ŷ ó���ϱ� >>");
		System.out.println(frontString + "-" + juminNumMasking);
	}
}
