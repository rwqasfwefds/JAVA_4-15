package ex3;

public class UpcastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		업 캐스팅
		Person p;
		Student s = new Student("이재문");
		
		
		p = s; // 업캐스팅(위로 형변환) 다형성
		
		System.out.println(p.name);
		
		
		
//		다운 캐스팅
//		Person p = new Student("이재문"); // 다형성
//		Student s;
//		
////		둘 다 알맹이는 같은데 클래스 타입은 다르니깐 정확하게 형변환을 해줘야 함
//		s = (Student)p; // 다운 캐스팅
//		
//		System.out.println(s.name);
//		s.grade = "A";
	}

}
