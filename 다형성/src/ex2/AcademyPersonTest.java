package ex2;

public class AcademyPersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcademyPerson[] personArray = new AcademyPerson[5];
		
		personArray[0] = new Student(1000, "홍길동", "Java반");
		personArray[1] = new Gangsa(2000, "임꺽정", "Java반");
		personArray[2] = new Staff(3000, "전우치", "관리부");
		personArray[3] = new Student(4000, "일지매", "Oracle반");
		personArray[4] = new Staff(5000, "장길산", "영업부");
		
		for(AcademyPerson arr : personArray) {
			if(arr instanceof Gangsa) {
//				자식 객체의 메소드를 호출하기 위해서는 형변환이 필요하다
				Gangsa gangsa = (Gangsa)arr;
				System.out.println(gangsa.getSubject() + "의 강사정보 >>");
			} else if(arr instanceof Student) {
				Student student = (Student)arr;
				System.out.println(student.getCourse() + "의 학생정보 >>");
			} else {
				Staff staff = (Staff)arr;
				System.out.println(staff.getDepartment() + "의 직원정보 >>");
			}
//			오버라이딩 된 메소드 : 형변환이 필요 없음
			arr.display();
			System.out.println("------------------------------------");
		}
	}

}
