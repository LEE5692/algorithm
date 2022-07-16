
public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] Array = new int[5];
			Array[0] = 3;
			Array[1] = 1;
			Array[2] = 2;
			Array[3] = 4;
			Array[4] = 8;
			
		for(int i = 0; i<Array.length;i++) {
			System.out.println("정렬전 " + Array[i]);
		}
		for(int i = 0; i < Array.length ;i++) {
			for(int j = 0; j < Array.length-1-i;j++) {
				if(Array[j] > Array[j+1]) {
					int temp = Array[j];	
					Array[j] = Array[j+1];
					Array[j+1] = temp;
					
					
					
							
					
				}
			}
		}
		for(int i = 0; i<Array.length;i++) {
			System.out.println("정렬 " + Array[i]);
		}
			
	}

}

