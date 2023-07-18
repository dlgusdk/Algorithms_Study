/*정수 a, b를 입력받고, a와 b를 곱해준 값을 출력하는 프로그램을 작성해보세요.
1 ≤ a, b ≤ 100 */

import java.util.Scanner;

public class Ex_041 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("a, b값 입력:" );

		int a = scanner.nextInt();	    
		int b = scanner.nextInt();

		System.out.print("출력:" );
		System.out.printf("%d", a*b);

	}
}