package ex;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
//		<Integer>�� �迭�ȿ� ������ �� �� �ִٰ� �����Ͽ� ǥ���ϴ� ����
		ArrayList<Integer> arraylist = new ArrayList<>();
		
//		�߰�
		arraylist.add(1);
		arraylist.add(2);
//		���
		arrayInfo(arraylist);
		
//		�ε��� ��ȣ�� �߰�
		arraylist.add(1, 10); // �ε��� 1�� �� 10�߰�
//		���
		arrayInfo(arraylist);
		
		arraylist.remove(1);
//		���
		arrayInfo(arraylist);
		
		
	}
	
	public static void arrayInfo(ArrayList arr) {
		System.out.println("��ü �� : " + arr);
		
		System.out.println("1�� �� : " + arr.get(1));
		System.out.println("ArrayList ũ�� : " + arr.size());
		System.out.println("-------------------");
	}

}
