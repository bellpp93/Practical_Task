package 실습문제3회;

class Person {
	public String name;  //private은 아무나 접근 못하기 때문에 모두 접근할 수 있는 public으로 바꾸어준다. 
	public int age;
}
public class Example02 {
	public static void main(String[] args) {
		Person aPerson = new Person();
		aPerson.name = "홍길동";
		aPerson.age = 26;
		System.out.println("이름은 " + aPerson.name + " " + "나이는 " + aPerson.age + "입니다.");
	}
}
