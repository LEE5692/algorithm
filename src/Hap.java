import java.util.Scanner;

public class Hap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 개수 입력하세요!");
		int N = s.nextInt();
		
		System.out.println("숫자 입력하세요!"); // 123 입력을하면 char[0]은 1, char[1]은 2, char[2]은 3이 되야함.
		
			String Value = s.next(); // value에 123 값이 들어옴.
			int len = Value.length();
			int sum = 0;
			
			for(int i = 0; i<len; i++) { //값의 길이만큼 반
				char[] a = new char[len]; // 123이라면 길이가 3이니까 배열길이는 3이 들어감.
				
				a[i] = Value.charAt(i); //
				
			
				sum += a[i] - '0'; // 아스키 코드값을 반환하기때문에 -'0' or -48해주어야함 
				
			}
			
			System.out.println(sum);
			
		}
	}


