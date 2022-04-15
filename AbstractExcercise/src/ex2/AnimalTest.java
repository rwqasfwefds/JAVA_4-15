package ex2;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();

//		개새끼 템플릿 메소드 호출
		dog.playWithOwner();
		
		System.out.println("-----------------");
		
//		털바퀴 템플릿 메소드 호출
		cat.playWithOwner();
	}

}
