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
		//준비 단계
		char alpha;
		
		//입력 단계
		System.out.print("문자 한 자를 입력하세요 >>> ");  //System.out(표준 출력)
		Scanner scan = new Scanner(System.in);  //System.in(표준 입력)
		/*
		 * 'A' (문자)		=> 65 (아스키코드값)
		 * "a" (문자열)	=> "A\0"
		 */
		alpha = scan.next().charAt(0);  //문자열의 첫자리를 가지고 온다
		
		if (alpha >= 'a' && alpha <= 'z') {  //&& => 'AND연산자', || => 'OR연산자'
			//좌변 = 우변; 우변에서 좌변으로 '대입한다' 라는 뜻.
			alpha = (char) (alpha - 32);  //"'문자' = 정수" => (char) 라는 '캐스트 연산자'를 통해 "'문자' = '문자'"로 바꿔준 것.
		}else if (alpha >= 'A' && alpha <= 'Z') {
			alpha = (char) (alpha + 32);
		}else {  //한글이 입력되었을 때
			System.out.println("영문자가 아닙니다.");
			System.exit(0);  //프로그램 정상 종료
		}
		System.out.println(alpha);
		scan.close();
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("입력 >> ");
//		char alpha = scan.next().charAt(0);  //입력값의 첫문자를 읽어온다.
//		
//		if (alpha >= 'a' && alpha <= 'z') {  //소문자이면 >> 대문자 출력
//			System.out.println("출력 >> " + (char)(alpha - 32));
//		}
//		else if(alpha >= 'A' && alpha <= 'Z') {
//				System.out.println("출력 >> " + (char)(alpha + 32));
//		}
//		else
//			System.out.println("영문자가 아닙니다.");
//		scan.close();
	}
}
