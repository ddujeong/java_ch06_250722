package chapter06_01;


public class Triangle {
	
	// 삼각형의 추상화 -> 속성, 필드, 멤버변수
	int height;
	int width;
	String color;
	
	// 삼각형의 면적 -> 메소드
	public double triangleArea() {
	//double area	= height * width* 0.5;
	//return area; // 값을 반환할 변수 -> return 변수;
		return height*width*0.5;
		
	}
	// 삼각형의 컬러 -> 메소드
	public String triangleColor() {
		System.out.println("삼각형의 색 : "+ color);
		return color; 
	
		//Triangle tri2; // 객체 선언 -> 메모리에 객체가 만들어지지 않은 상태
		//tri2 = new Triangle(); // 인스턴스화 -? 메모리에 객체(인스턴스)가 만들어짐
	
	}
}
