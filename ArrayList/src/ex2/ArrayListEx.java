package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���");
//		arraylist �Է� ���� ��� ����
		for(int i = 0; i < 4; i++) {
			String s = scanner.next();
			a.add(s);
		}
		
//		arraylist ��� ���
		for(int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.println(name + " ");
		}
	}

}
