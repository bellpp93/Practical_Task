package �ǽ�����3ȸ;

class Person {
	public String name;  //private�� �ƹ��� ���� ���ϱ� ������ ��� ������ �� �ִ� public���� �ٲپ��ش�. 
	public int age;
}
public class Example02 {
	public static void main(String[] args) {
		Person aPerson = new Person();
		aPerson.name = "ȫ�浿";
		aPerson.age = 26;
		System.out.println("�̸��� " + aPerson.name + " " + "���̴� " + aPerson.age + "�Դϴ�.");
	}
}
