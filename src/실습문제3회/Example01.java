package 실습문제3회;

class MyClass {
	int i;
}
public class Example01 {
	public static void main(String[] args) {
		try {  // 레퍼런스 변수가 null인 상태에서 객체를 참조할 경우 예외처리를 해준다.
			MyClass a = null;  // 지역변수는 기본값으로 초기화해야 하기 때문에 null값을 준다.
			a.i = 10;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
