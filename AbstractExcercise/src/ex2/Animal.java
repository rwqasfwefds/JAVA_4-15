package ex2;

public abstract class Animal {
//	추상 메소드
//	1번 클래스 : 출력 = "야옹~ 야옹~"
//	2번 클래스 : 출력 = "댕!~ 댕!"
	abstract void play();
	
//	1. 오버라이딩 할 메소드 : 출력 = "야옹~ 야옹~ 꼬리 살랑 살랑"
//	2. 오버라이딩 할 메소드 : 출력 = "댕! 댕!~ 꼬리 살랑 살랑"
	void runSomething() {
		System.out.println("꼬리 살랑 살랑~");
	}
	
//	템플릿 메소드 패턴(전체 행동 순서 정의)
//	디자인 패턴 : 템플릿 메소드(TemplatMethod)패턴
//
//	1. GoF디자인 패턴 중 하나 : Spring 에서도 씀
//	2. 부모 클래스에서 전체 행동순서를 정의하고(템플릿 메소드),
//	자식 클래스에 따라 출력하는 내용이 달라져야 할 때 사용
//	3. 전체적으로는 동일하면서 부분적으로 다른 구문으로 구성된 메소드의 코드 중복을 최소화
	public void playWithOwner() {
		System.out.println("커염둥이 이리온~"); // 첫 번째 행동
		play(); // 두 번째 행동(자식들에 따라 변경된 후 출력)
		runSomething(); // 세 번째 행동(자식들에 따라 변경된 후 출력)
		System.out.println("굿 좌압~"); // 네 번째 행동
	}
}
