package Excercise;

public class AcademyPersonTest {

	public static void porcess(AcademyPerson arr) {
		if (arr instanceof Gangsa) {
//			�ڽ� ��ü�� �޼ҵ带 ȣ���ϱ� ���ؼ��� ����ȯ�� �ʿ��ϴ�
			Gangsa gangsa = (Gangsa) arr;
			System.out.println(gangsa.getSubject() + "�� �������� >>");
		} else if (arr instanceof Student) {
			Student student = (Student) arr;
			System.out.println(student.getCourse() + "�� �л����� >>");
		} else {
			Staff staff = (Staff) arr;
			System.out.println(staff.getDepartment() + "�� �������� >>");
		}
//		�������̵� �� �޼ҵ� : ����ȯ�� �ʿ� ����
		arr.display();
		System.out.println("------------------------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcademyPerson[] personArray = new AcademyPerson[5];

		personArray[0] = new Student(1000, "ȫ�浿", "Java��");
		personArray[1] = new Gangsa(2000, "�Ӳ���", "Java��");
		personArray[2] = new Staff(3000, "����ġ", "������");
		personArray[3] = new Student(4000, "������", "Oracle��");
		personArray[4] = new Staff(5000, "����", "������");

		for (AcademyPerson arr : personArray) {
			porcess(arr);
		}
	}
}
