package ex3;

public class UpcastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		�� ĳ����
		Person p;
		Student s = new Student("���繮");
		
		
		p = s; // ��ĳ����(���� ����ȯ) ������
		
		System.out.println(p.name);
		
		
		
//		�ٿ� ĳ����
//		Person p = new Student("���繮"); // ������
//		Student s;
//		
////		�� �� �˸��̴� ������ Ŭ���� Ÿ���� �ٸ��ϱ� ��Ȯ�ϰ� ����ȯ�� ����� ��
//		s = (Student)p; // �ٿ� ĳ����
//		
//		System.out.println(s.name);
//		s.grade = "A";
	}

}
