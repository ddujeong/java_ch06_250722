package exam;

public class Movie_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie mov1 = new Movie();
		mov1.runtime = 120;
		
		System.out.println("긴 영화인가요?" + mov1.isLongMovie());
	}

}
