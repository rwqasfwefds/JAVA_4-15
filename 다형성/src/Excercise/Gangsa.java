package Excercise;

public class Gangsa extends AcademyPerson {
	
	private String subject; // ���Ǹ�

	public Gangsa() {
		
	}

	public Gangsa(int num, String name, String subject) {
		super(num, name);
		this.subject = subject;
	}

	@Override
	public void display() {
		System.out.println("���� ��ȣ = " + getNum());
		System.out.println("���� �̸� = " + getName());
		System.out.println("���Ǹ� = " + subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
