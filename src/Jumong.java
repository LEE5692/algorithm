import java.util.Arrays;
import java.util.Scanner;

public class Jumong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			
			
			System.out.println(" 재료의 개수 입력 ");
			int mat = s.nextInt();
			int[] value = new int[mat];
			
			System.out.println(" 값옷이 만들어지는 번호의합 입력 "); 
			int num = s.nextInt();
			
			System.out.println(" 재료들 입력 ");
			
			for(int i = 0; i <mat; i++ ) {
				
				value[i] = s.nextInt();
				
				Arrays.sort(value);
			}
			int count = 0;
			int i = 0;
			int j = mat - 1;
			while(i < j) {
				if(value[i] + value[j] < num) {
					i++;
				}
				else if (value[i] + value[j] > num) {
					j--;
				}
				else {
					count++;
					i++;
					j--;
				}
			}
				System.out.println(count);
			
			
			
	}

}

