package excercise;

public class Phone implements MP3Interface, PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("µû¸£¸ª");
	}

	@Override
	public void receiverCall() {
		System.out.println("ÀüÈ­ ¿È");
	}

	@Override
	public void sendSMS() {
		System.out.println("¹®ÀÚ °©´Ï´ÙÀ×!");
	}

	@Override
	public void receiveSMS() {
		System.out.println("¹®ÀÚ ¿Ô´ÙÀ×!");
	}

}
