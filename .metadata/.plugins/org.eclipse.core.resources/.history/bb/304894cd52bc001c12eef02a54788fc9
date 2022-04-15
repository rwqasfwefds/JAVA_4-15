package ex2;

public class InstanceOfTest {

	public static void testAllPhone(Phone p) {
		
		if(p instanceof Iphone) {
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
