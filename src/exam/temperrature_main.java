package exam;

public class temperrature_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature tem1 = new Temperature();
		tem1.celsius= 25;
	
		double fah = tem1.toFahrenheit();
		
		System.out.println("화씨 온도 : " + fah);
		
	}

}
