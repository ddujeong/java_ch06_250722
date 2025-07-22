package exam;

public class Score {
	
	int kor;
	int eng;
	int math;
	
//	
//	public Score(int kor, int eng, int math) {
//		this.kor = kor;
//		this.eng = eng;
//		this.math = math;
//	}
//	
	
	
	public int sum() {
		return (kor + eng + math);
//		System.out.println("총 점 : "+ sum);
	}
	
	public double avg() {
		return (kor + eng + math)/3;
		
	}
	
//	public String grade(int avg) {
//		if (avg >= 90) {
//			
//		}
		
	}
	

