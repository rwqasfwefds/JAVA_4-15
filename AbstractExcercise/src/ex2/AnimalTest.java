package ex2;

public class AnimalTest {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();

//		������ ���ø� �޼ҵ� ȣ��
		dog.playWithOwner();
		
		System.out.println("-----------------");
		
//		�й��� ���ø� �޼ҵ� ȣ��
		cat.playWithOwner();
	}

}
