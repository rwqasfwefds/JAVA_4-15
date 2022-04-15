package ex;

public class InstanceOfTest {

//	매개변수에 부모 클래스가 들어오는 메소드를 만 드는 것 : 다형성의 목표
	public static void testAllPhone(Phone p) {
		
		if(p instanceof Iphone) {
//			부모 클래스의 메소드와 자식 클래스의 메소드가 같으면
//			자식 클래스의 메소드를 선택(오버라이딩)
//			오버라이딩의 경우가 아니면 형변환 필요
			
//			이렇게도 할 수 있고
//			Iphone iphone = (Iphone)p;
//			iphone.sms();
			
//			이렇게도 가능
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
