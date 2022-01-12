package 실습문제1회;

import java.util.Scanner;

/*
 * Scanner 클래스를 이용하여 키보드에서 영문자 한 자를 입력받아 소문자이면 대문자로
 * 대문자이면 소문자로 변환하여 출력하는 프로그램을 작성하세요.
 * 단, 입력된 문자가 영문자가 아니면 "영문자가 아닙니다."를 출력한다.
 * 즉, 한글 자음이 입력되면 "영문자가 아닙니다."를 출력
 * 
 * [실행결과]
 * 문자 한 자를 입력하세요: a => A
 * 문자 한 자를 입력하세요: A => a
 * 문자 한 자를 입력하세요: ㅈ => 영문자가 아닙니다.
 * 
 * [아스키코드값]
 * a는 97, A는 65 => 97 - 65 = 32
 */
public class CaseChanger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("입력 >> ");
		char alpha = scan.next().charAt(0);  //입력값의 첫문자를 읽어온다.
		
		if (alpha >= 'a' && alpha <= 'z') {  //소문자이면 >> 대문자 출력
			System.out.println("출력 >> " + (char)(alpha - 32));
		}
		else if(alpha >= 'A' && alpha <= 'Z') {
				System.out.println("출력 >> " + (char)(alpha + 32));
		}
		else
			System.out.println("영문자가 아닙니다.");
		scan.close();
	}
}
