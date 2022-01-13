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
		//준비 단계 => 변수 선언, 배열 선언 => 데이터를 저장할 그릇(메모리의 저장공간)을 마련
		int[] arrMoney = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		String[] str = {"오만원권","만원권","오천원권","천원권","오백원","백원","오십원","십원","일원"};
		
		//입력 단계
		System.out.print("금액을 입력해 주세요 >>> ");
		Scanner scan = new Scanner(System.in);
		int Money = scan.nextInt();  //'nextInt'는 문자열을 정수로 변환해주는 역할
		
		//처리 단계 => 인간의 논리적인 사고(logic) => 제어문을 잘 조합시키는 것 => 경험치
		//[예] 입력한 금액이 => 65750
		for (int i = 0; i < arrMoney.length; i++) {  //일반 for문
			int num = Money / arrMoney[i];  //5만원권은 몫이 1개
			//나머지 금액 => 15750
			int remainder = Money % arrMoney[i];  //나머지값 구하기
			Money = remainder;
			
			if (num > 0 && i < 4) {  //index 0,1,2,3은 지폐니깐 '~매'가 된다.
				System.out.println(str[i] + " " + num + "매");
			}else if (num > 0 && i >= 4) {  //index 4,5,6,7,8은 동전이니깐 '~개'가 된다.
				System.out.println(str[i] + " " + num + "개");
			} 
			
		}
		scan.close();
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("입력 >> ");
//		int money = scan.nextInt();
//		
//		int div = 50000;
//		int[] count = new int[11];
//		System.out.print("출력 >> ");
//		
//		for (int i = 0; i < 10; i++) {
//			if(!(i == 2) || (i == 4) || (i == 8)) {
//				count[i] = money / div;
//				money %= div;
//			}
//			if (count[i] != 0) {
//				System.out.printf("%d원 %d개 ", div, count[i]);
//			}
//			if(i % 2 == 0) div /= 5;
//			else div /= 2;
//		}
//		scan.close();
	}
}
