package �ǽ�����3ȸ;

class Person {
//	public String name;  //private�� �ƹ��� ���� ���ϱ� ������ ��� ������ �� �ִ� public���� �ٲپ��ش�. ��ü ���� ���α׷��ֿ� �˸��� ����.
//	public int age;
	
	//��������� ������ private���� ����
	//��ü���� ���α׷��ֿ� ������ ����� getter setter �̿�
	private String name;
	private int age;
	
	//������� �ϳ��� getter, setter �޼ҵ带 �ѽ־� �����Ѵ�.
	/*
	 * setter �޼ҵ� ���� ��Ģ => �ݵ�� �Ű������� �޾ƾ��ϰ�, return Ÿ���� void�̴�.
	 * getter �޼ҵ� ���� ��Ģ => �Ű������� ���� �ʰ�, { } ��� �ȿ� �ݵ�� return�� �־�� �Ѵ�.
	 */
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
}
public class Example02 {
	public static void main(String[] args) {
		Person aPerson = new Person();
//		aPerson.name = "ȫ�浿";  // public �̿��Ҷ� Ǯ��
//		aPerson.age = 26;
		
		aPerson.setName("ȫ�浿");
		aPerson.setAge(26);
		
		System.out.println("�̸�: " + aPerson.getName());
		System.out.println("����: " + aPerson.getAge());
	}
}
