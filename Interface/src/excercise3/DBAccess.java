package excercise3;

public interface DBAccess {
	void connect(); // 출력 : "DB 연결" 
	void disconnect(); // 출력 : "DB 연결 해제"
	void work(); // 출력 : "실행"
}
