package excercise3;

public class Connect implements DBAccess {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("DB 연결");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("DB 연결 해제");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("실행");
	}

}
