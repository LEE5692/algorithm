import java.io.IOException;
import java.util.Scanner;

public class HapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("데이터개수와 질의개수 입력 ");
		int suNo = s.nextInt();
		int quizNo = s.nextInt();
		
		
		int HapArray[] = new int[suNo+1]; // 맨처음자리를 0으로 만들어서 오류를 방지하고, 합배열의 0번째 인덱스를 0으로 지정함.
		
		HapArray[0] = 0;
		
		System.out.println(" 대상배열입력 ");
		for(int i = 1; i<=suNo;i++) { 
			HapArray[i] = HapArray[i-1] + s.nextInt();
			
			
			}
		
		System.out.println("질의 입력 ");
		for(int i = 0; i<quizNo;i++) {
			
			int a = s.nextInt();
			int b = s.nextInt();
			
			System.out.println(HapArray[b] - HapArray[a-1]);
			
			
			
		}
		
		
	}

}
