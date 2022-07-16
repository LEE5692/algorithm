
public class Stack {
	
	static int top;
	int size;
	static int [] stack;
	public Stack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Stack s = new Stack(5);
			s.Push(1);
			s.Push(3);
			s.Push(2);
			s.Push(4);
			s.Push(5);
			System.out.println(stack[top]);
			
			s.Pop();
		
			
			System.out.println(stack[top]);
		
			
	}
	public void Push(int item) {
		stack[++top] = item;
		
	}
	public void Pop() {
		int pop = stack[top];
		stack[top--] = 0;
	}
	public void peek() {
		System.out.println(stack[top] + "peek");
	}
	
}
