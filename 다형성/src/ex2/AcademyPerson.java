package ex2;

public class AcademyPerson {
	private int num; // ��ȣ
	private String name; // �̸�
	
//	�⺻ ������
	public AcademyPerson() {
		
	}
	
//	�Ű������� 2���� ������
	public AcademyPerson(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
//	�п� ����� ������ ����ϴ� �޼ҵ�
	public void display() {
		System.out.println("��ȣ = " + num);
		System.out.println("�̸� = " + name);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
