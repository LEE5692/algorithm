import java.util.Scanner;

public class Pointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int startidx = 1;
		int endidx = 1;
		int count = 1 ;
		int sum = 1;
		
		int N = s.nextInt();
		while(endidx != N) {
			if(sum == N) {
			endidx++;
			sum = sum + endidx;
			count++;
		}	
		else if(N < sum){
				sum = sum - startidx;
				startidx++;
			}
		else if(N > sum) {
			endidx++;
			sum = sum +endidx;
		}
			
		}
		System.out.println(count);
	}

}
