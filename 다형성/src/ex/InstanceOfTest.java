package ex;

public class InstanceOfTest {

//	�Ű������� �θ� Ŭ������ ������ �޼ҵ带 �� ��� �� : �������� ��ǥ
	public static void testAllPhone(Phone p) {
		
		if(p instanceof Iphone) {
//			�θ� Ŭ������ �޼ҵ�� �ڽ� Ŭ������ �޼ҵ尡 ������
//			�ڽ� Ŭ������ �޼ҵ带 ����(�������̵�)
//			�������̵��� ��찡 �ƴϸ� ����ȯ �ʿ�
			
//			�̷��Ե� �� �� �ְ�
//			Iphone iphone = (Iphone)p;
//			iphone.sms();
			
//			�̷��Ե� ����
			((Iphone) p).sms();
		} else if(p instanceof Galaxy) {
			((Galaxy) p).dmb();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iphone p1 = new Iphone();
		Galaxy p2 = new Galaxy();
		
		testAllPhone(p2);
		testAllPhone(p1);
		
	}

}
