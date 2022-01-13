package 실습문제1회;

import java.util.Scanner;

/*
 * 키보드로부터 특정 년도를 입력받아 윤년인지 아닌지를 판별하는 프로그램을 작성하세요.
 * 연수가 4로 나누어 떨어지는 해는 우선 윤년으로 하되, 그 중에서 100으로 나누어 떨어지는 해는 평년으로 하고,
 * 다만 400으로 떨어지는 해는 다시 윤년으로 판정한다.
 * 단, if문, 논리연산자(&&,||)를 활용하여 프로그램을 작성한다.
 * 
 * [실행결과]
 * 연도를 입력하세요.
 * 2018 >> 평년입니다.
 * 2019 >> 평년입니다.
 * 2020 >> 윤년입니다.
 */
public class LeapyearCommonyear {

	public static void main(String[] args) {
		//준비
		int year;
		
		//입력
		System.out.println("년도를 입력하세요 >>> ");
		Scanner scan = new Scanner(System.in);
		year = scan.nextInt();
		
		/*
		 * 윤년 조건
		 * 4로 나누어 떨어지고 100으로 나누어 떨어지지 않거나
		 * 400으로 나누어 떨어지는 경우
		 */
		
		//처리
		if ((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			System.out.println("입력한 년도는 윤년입니다.");
		}else {
			System.out.println("입력한 년도는 평년입니다.");
		}
		scan.close();
		
//		System.out.println("연도를 입력하세요.");
//		Scanner scan = new Scanner(System.in);
//		int year = scan.nextInt();
//		
//		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//			System.out.println(year + "년은 윤년입니다.");
//		}else {
//			System.out.println(year + "년은 평년입니다.");
//		}
//		scan.close();
	}
}
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("특정 연도를 입력하세요 >> ");
		int year = scan.nextInt();
		
	if (year % 4 == 0) 
			if (year % 400 == 0) 
				System.out.println(year + "년은 윤년입니다.");
			else if (year % 100 == 0)
				System.out.println(year + "년은 평년입니다.");
			else
				System.out.println(year + "년은 윤년입니다.");
	else
			System.out.println(year + "년은 윤년이 아닙니다.");
			
		scan.close();
		*/

