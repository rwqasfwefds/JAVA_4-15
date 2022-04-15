package ex2;

public class Student extends AcademyPerson {
	
	private String course; // 수강 과정

	public Student() {
		
	}

//	num, name : 부모쪽에서 초기화
//	course : 자식쪽에서 초기화
	public Student(int num, String name, String course) {
		super(num, name);
		this.course = course;
	}

	@Override
	public void display() {
		System.out.println("학생 번호 = " + getNum());
		System.out.println("학생 이름 = " + getName());
		System.out.println("수강 과정 = " + course);
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
