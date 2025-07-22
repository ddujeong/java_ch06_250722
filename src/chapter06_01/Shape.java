package chapter06_01;

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tri1 = new Triangle(); // 객체 선언 -> 인스턴스 생성
		tri1.height = 20;
		tri1.width = 10;
		tri1.color = "red";
		
		double tri1area = tri1.triangleArea(); // method call -> 메소드 호출
		System.out.println(tri1area);
		
		tri1.triangleColor(); // method call -> 메소드 호출
		// Triangle class 에 이미 syso 찍혀있음
	}

}
