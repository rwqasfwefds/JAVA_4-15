package Excercise;

public class Staff extends AcademyPerson {
	
	private String department; // �μ�

	public Staff() {
		
	}

	public Staff(int num, String name, String department) {
		super(num, name);
		this.department = department;
	}

	@Override
	public void display() {
		System.out.println("���� ��ȣ = " + getNum());
		System.out.println("���� �̸� = " + getName());
		System.out.println("�μ� = " + department);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
