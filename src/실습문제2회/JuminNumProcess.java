package �ǽ�����2ȸ;

import java.util.Scanner;

public class JuminNumProcess {

	public static void main(String[] args) {
		String juminNum;
		int sum = 0;
		int temp, result;
		int[] weight = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		
		System.out.print("�ֹι�ȣ �Է�: ");
		Scanner scan = new Scanner(System.in);
		juminNum = scan.nextLine();
		
		for (int i = 0; i < 13; i++) {  
			if(juminNum.charAt(i) == '-') continue;
				sum = sum + (juminNum.charAt(i)-48) * weight[i];  			
		}
		temp = 11 - (sum%11);  
		result = temp%10;
		System.out.println();
		
//		substring() �޼ҵ� ���
		String frontString = juminNum.substring(0, 6);
		System.out.println("�ֹι�ȣ���ڸ�: " + frontString);
		
		String backString = juminNum.substring(7, 14);
		System.out.println("�ֹι�ȣ���ڸ�: " + backString);
		
		System.out.println();
		
//		split() �޼ҵ� ���
		String[] sp = juminNum.split("-");
		
		for (int i = 0; i < sp.length; i++) {
			System.out.println(sp[i]);
		}	
	}
}
