/*정수 a, b를 입력받고, a와 b를 곱해준 값을 출력하는 프로그램을 작성해보세요.
첫 번째 줄에 정수 a, 두 번째 줄에 정수 b가 주어집니다.
1 ≤ a, b ≤ 100*/

import java.util.Scanner;

public class Ex_045 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("a값 입력:");
		System.out.println("b값 입력:");
		
		int a = scanner.nextInt();	    
		int b = scanner.nextInt();

		System.out.print("출력:" );
		System.out.printf("%d", a*b);

	}
}