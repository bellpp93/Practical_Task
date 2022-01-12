package 실습문제1회;

import java.util.Scanner;

/*
 * 키보드에서 돈의 액수를 입력받아 오만원권, 만원권, 오천원권, 천원권 각 몇 매
 * 그리고 500짜리 동전, 100원 짜리 동전, 50원 짜리 동전, 10원 짜리 동전, 1원 짜리 동전 몇 개로 변환 되는지 출력하세요.
 * 예를 들어 56790원이 입력되면 오만원권  1매, 오천원권 1매, 천원권 1매, 오백원 1개, 백원 2개, 오십원 1개, 십원 4개이다.
 * 단, 배열 적용, 제어문을 활용하여 프로그램을 작성한다. for문 이용
 * 
 * [실행결과]
 * 금액을 입력해 주세요:
 */
public class ChangeMoney {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력 >> ");
		int money = scan.nextInt();
		
		int div = 50000;
		int[] count = new int[11];
		System.out.print("출력 >> ");
		
		for (int i = 0; i < 10; i++) {
			if(!(i == 2) || (i == 4) || (i == 8)) {
				count[i] = money / div;
				money %= div;
			}
			if (count[i] != 0) {
				System.out.printf("%d원 %d개", div, count[i]);
			}
			if(i % 2 == 0) div /= 5;
			else div /= 2;
		}
		scan.close();
	}
}
