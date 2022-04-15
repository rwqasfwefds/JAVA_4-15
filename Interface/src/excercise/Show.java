package excercise;

public class Show {

	public static void main(String[] args) {
//		객체 생성
		Phone phone = new Phone();
		
//		메소드 호출
		phone.sendCall();
		phone.receiverCall();
		phone.sendSMS();
		phone.receiveSMS();
	}

}
