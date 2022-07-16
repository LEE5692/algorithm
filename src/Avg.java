import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("과목수 입력하세요 ");
		int n = s.nextInt(); // n에 과목수입
		int score[] = new int[n];
		
		
		
		System.out.println("점수 입력하세요 ");
		for(int i = 0; i<n; i++) { // 과목수만큼 입력을 받고 배열에 값들저
			score[i] = s.nextInt();
		}
			
			long max = 0;
			long sum = 0;
			
		for(int i = 0; i<n; i++) {
			
			
			if(score[i] > max) { // 30 40 50 입력, 
				max = score[i];
				sum += score[i];
			}
			
			
		}
		System.out.println("최대값은 :"  +  max);
		System.out.println("합은 " + sum);
		System.out.println("평균 " + sum * 100.0 / max / n);
		
	}

}
