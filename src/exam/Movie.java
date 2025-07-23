package exam;

public class Movie {

		String title;
		String genre;
		int runtime;
		
		public boolean isLongMovie(){
//			if (runtime>=120) {
//				return true;
//			}else {
//				return false;
//			}		
			return runtime >= 120;
		}
	
}
