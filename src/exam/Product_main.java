package exam;

public class Product_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product pro1 = new Product(2000, 100); 
		pro1.name = "아메리카노";
		
		int price = pro1.getTotalPrice();
		System.out.println(price);
		
	// 객체 1개만 만들시에는 클래스 이름으로 객체 선언하는게 관례	
	}

}
