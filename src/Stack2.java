import java.util.Scanner;
import java.util.Stack;
public class Stack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner s = new Scanner(System.in);
		System.out.println("수열 개수 입력 ");
		int size = s.nextInt();
		int array[] = new int[size];
		
		System.out.println("자연수 입력 ");
		for(int i=0; i<size;i++) {
			array[i] = s.nextInt();
			
		}
		
		Stack<Integer> stack = new Stack<>();
		int num =1 ;
		boolean result = true;
		for(int i=0; i<size;i++) {
			int su = array[0];
			if(su >= num) {
				while(su >= num)
				{
					stack.push(num++);
				}
				stack.pop();
			}
			else {
				num = stack.pop();
				if(num >su) {
					System.out.println("NO");
					result = false;
					break;
				}
			}
			
		}
		
	}

}