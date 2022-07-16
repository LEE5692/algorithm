import java.util.Scanner;

public class Okensu {

	public static void main(String[] args) {
		
			// [1,3,2,4] 이라면 1보다큰수중에 가장왼쪽에있는것을 고른다 >> [3]이 된다. 두번째 인덱스는 [4]가된다. 세번째는[4] , 네번째는 없으므로 [-1]
		
			Scanner s = new Scanner(System.in);
			System.out.println("수열 크기 입력 ");
			int size = s.nextInt();
			int max = 0;
			for(int i = 0 ; i < size; i++) 
				
				{
				int[] ar = new int[size]; // 수열 정의 
				ar[i] = s.nextInt();
				
				int[] newar = new int[size];
 				
				
 					for(int j = 0; j <ar.length; j++)   // [1,3,2,4]
 					{	
 						int va = ar[j]; //수열 인덱스 값 저장 
 						for(int k =j+1; k<ar.length; j++) 
 						{
 															
 							if(ar[k] > va) 
 							{
 								
 								va =max;
 								newar[j] =  va;
 								break;
 							}
 							
 								
 							
 						}
 						
 					}
 					System.out.println(newar[i]);
			}
			
			
	}
}

