package excercise;

public class Phone implements MP3Interface, PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("������");
	}

	@Override
	public void receiverCall() {
		System.out.println("��ȭ ��");
	}

	@Override
	public void sendSMS() {
		System.out.println("���� ���ϴ���!");
	}

	@Override
	public void receiveSMS() {
		System.out.println("���� �Դ���!");
	}

}
