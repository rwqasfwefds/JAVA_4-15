package ex;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
//		<Integer>은 배열안에 정수만 들어갈 수 있다고 강조하여 표현하는 거임
		ArrayList<Integer> arraylist = new ArrayList<>();
		
//		추가
		arraylist.add(1);
		arraylist.add(2);
//		출력
		arrayInfo(arraylist);
		
//		인덱스 번호에 추가
		arraylist.add(1, 10); // 인덱스 1에 값 10추가
//		출력
		arrayInfo(arraylist);
		
		arraylist.remove(1);
//		출력
		arrayInfo(arraylist);
		
		
	}
	
	public static void arrayInfo(ArrayList arr) {
		System.out.println("전체 값 : " + arr);
		
		System.out.println("1번 값 : " + arr.get(1));
		System.out.println("ArrayList 크기 : " + arr.size());
		System.out.println("-------------------");
	}

}
