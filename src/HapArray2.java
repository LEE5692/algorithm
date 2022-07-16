import java.util.Scanner;

public class HapArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("2차원 배열 크기와 구간합 질의 개수입력 ");
		int ArraySize = s.nextInt();
		int Quary = s.nextInt();
		
		System.out.println("배열 크기는 " + ArraySize + "입니다 ");
		System.out.println("배열 크기는 " + Quary + "입니다 ");
		
		int Array[][] = new int[ArraySize+1][ArraySize+1];
		int HapArray[][] =  new int[ArraySize+1][ArraySize+1];
			for(int i = 1 ; i < ArraySize; i++) {
				for(int j = 1; j<ArraySize; j++) {
					System.out.println("배열 값 입력하세요 ");
					Array[i][j] = s.nextInt();	
				}
				
			}
			for(int i = 1 ; i < ArraySize; i++) {
				for(int j = 1; j<ArraySize; j++) {
					
					HapArray[i][j] = HapArray[i][j-1] + HapArray[i-1][j] + HapArray[i-1][j-1] + Array[i][j];
				}
			}
			
	}
}