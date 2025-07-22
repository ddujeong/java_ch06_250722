package chapter06_03;

public class Rectangle {

	int width; // 사각형 가로길이
	int height; // 사각형 세로길이
//	
	public Rectangle() {
	}
	// 기본 생성자(=method 의 일종 (생략 되어있음))
	// -> 반환타입이 아예 없고 이름이 해당 클래스의 이름으로 고정
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		// () -> 매개 변수(parameter)	
		// 전역변수와 로컬변수의 이름이 같아서 error
		// this.변수 -> 객체 내의 전역변수를 지칭하게 됨
		// -> 가독성 좋게 변수값 초기화함
	}
	
	
	public int rectArea() { // 사각형 면적 반환 메소드
		return width*height;
	}
}
