import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Queue<Integer> qu = new LinkedList<>();
		
		int size = s.nextInt();
		for(int i = 1; i<= size; i++) {
			qu.add(i);
		}
		while(qu.size()> 1) {
		
			qu.poll(); // 1 2 3 4 5 6 > 2 3 4 5 6
			qu.add(qu.poll());
			
		}
		System.out.println(qu.poll());
	}

}
