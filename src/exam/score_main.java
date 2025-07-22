package exam;

public class score_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score sco1 = new Score();
		sco1.kor = 90;
		sco1.eng = 90;
		sco1.math = 90;
		
		int sco1Sum = sco1.sum();
		System.out.println("총 점 : " + sco1Sum);
		double sco1Avg = sco1.avg();
		System.out.println("평균 : "+ sco1Avg);
		if (sco1Avg >= 90) {
			System.out.println("우수");
		} else if(sco1Avg < 60){
			System.out.println("재시험");
		} else {
			System.out.println("보통");
		}
		
	}

}
