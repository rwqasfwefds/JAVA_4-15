package ex;

public class Driver {

	public static void main(String[] args) {
//		interface�� ���� ����� �ҷ��� �� ����
		System.out.println(Speakable.zeroPoint);
		System.out.println(Speakable.PI);
		
//		�������̽��� ������ �޼ҵ带 ȣ��
		Specker reporter = new Specker();
		reporter.sayYes();
	}

}
