package ex;

public interface Speakable {
//	상수
//	원래 public static final double PI = 이런식으로 해야되는데
//	생략 가능임 전역 상수
	double PI = 3.14159;
	double zeroPoint = -275.15;
	
//	빈 깡통 메소드
//	원래 public abstract void sayYes(); 이런식으로 해야되는데
//	생략 가능임 전역 메소드
	void sayYes();
}
