package ex;

public class ShapeTest {
	
//	매개변수로 부모 클래스를 받음
//	그 뒤에 p는 자식 클래스를 받을 매개변수이고
//	단지 지금 이 메서드에서 실행하고 있는건 부모에 있는 draw함수를 실행 하는거임
//	paint메소드에 매개변수에 자식 클래스를 넣고 호출만 하면 자식 클래스에 있는 draw함수가 호출 됨
//	이게 오버라이딩임
//	부모와 자식에 똑같은 이름을 가지고 똑같은 형태인 메서드가 있으면 자식을 우선 실행 하니깐
	static void paint(Shape p) {
		p.draw(); // 만약 매개변수로 line를 넣으면 line.draw(); 가 될거고 이게 overriding임
	}
	
	public static void main(String[] args) {
		Shape shape = new Shape(); // 모양 (부모)
		Line line = new Line(); // 선, Shape 상속
		Rect rect = new Rect(); // 사각형, Shape 상속
		Circle circle = new Circle(); // 원, Shape 상속
		
		paint(shape);
		paint(line);
		paint(rect);
		paint(circle);
	}
}
