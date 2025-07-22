package chapter06_03;

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec1 = new Rectangle();
		// 객체 선언 -> 생성자 호출 
		rec1.height = 20;
		rec1.width = 10;
		
		int area = rec1.rectArea();
		System.out.println(area);
		
		Rectangle rec2 = new Rectangle(100,200);
		// class 파일에 매개 변수 기입해야 error 없음
		
		int area2 = rec2.rectArea();
		System.out.println(area2);
		
		
		Rectangle rec3 = new Rectangle(10,30);
		
		int area3 = rec3.rectArea();
		System.out.println(area3);
	}
		
}
