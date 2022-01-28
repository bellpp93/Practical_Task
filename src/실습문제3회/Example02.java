package 실습문제3회;

class Person {
//	public String name;  //private은 아무나 접근 못하기 때문에 모두 접근할 수 있는 public으로 바꾸어준다. 객체 지향 프로그래밍에 알맞지 않음.
//	public int age;
	
	//멤버변수는 가능한 private으로 설정
	//객체지향 프로그래밍에 적합한 방법은 getter setter 이용
	private String name;
	private int age;
	
	//멤버변수 하나당 getter, setter 메소드를 한쌍씩 구현한다.
	/*
	 * setter 메소드 구현 규칙 => 반드시 매개변수를 받아야하고, return 타입이 void이다.
	 * getter 메소드 구현 규칙 => 매개변수를 받지 않고, { } 블록 안에 반드시 return이 있어야 한다.
	 */
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
}
public class Example02 {
	public static void main(String[] args) {
		Person aPerson = new Person();
//		aPerson.name = "홍길동";  // public 이용할때 풀이
//		aPerson.age = 26;
		
		aPerson.setName("홍길동");
		aPerson.setAge(26);
		
		System.out.println("이름: " + aPerson.getName());
		System.out.println("나이: " + aPerson.getAge());
	}
}
