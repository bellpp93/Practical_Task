package �ǽ�����3ȸ;

class MyClass {
	int i;
}
public class Example01 {
	public static void main(String[] args) {
		try {  // ���۷��� ������ null�� ���¿��� ��ü�� ������ ��� ����ó���� ���ش�.
			MyClass a = null;  // ���������� �⺻������ �ʱ�ȭ�ؾ� �ϱ� ������ null���� �ش�.
			a.i = 10;
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
