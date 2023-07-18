/*정수 a, b, c를 입력받고, a와 b와 c를 차례대로 출력하는 프로그램을 작성하세요.
첫 번째 줄에 정수 a와 b가 공백을 사이에 두고 주어집니다.
두 번째 줄에 정수 c가 주어집니다.
1 ≤ a, b, c ≤ 100 
첫 번째 줄에 a와 b와 c를 공백을 두고 순서대로 출력합니다.*/

import java.util.Scanner;

public class Ex_049 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("a값, b값 입력:");
		System.out.println("c값 입력:"); 

		int a, b, c;                 
		a = scanner.nextInt();	  
		b = scanner.nextInt();      
		c = scanner.nextInt();     
		
		System.out.print("출력:" );
		System.out.printf("%d %d %d", a, b, c);
      
	}
}