/*두 실수 a, b 를 입력받아 합을 구하여 소수점 아래 둘째자리까지 출력하는 프로그램을 작성해보세요.
 첫 번째 줄에 실수 a와 실수 b의 합을 소수점 아래 둘째자리까지 출력합니다.
 첫 번째 줄에 실수 a가 주어집니다. 두 번째 줄에 실수 b가 주어집니다.
 첫 번째 줄에 실수 a와 실수 b의 합을 소수점 아래 둘째자리까지 출력합니다.
 1 ≤ a, b ≤ 100 */

import java.util.Scanner;

public class Ex_047 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("a값과 b값 입력:");
		
		float a, b;                 //double a, b;
		a = scanner.nextFloat();	// a = scanner.nextDouble(); 
		b = scanner.nextFloat();    // b = scanner.nextDouble();
       
		
		System.out.print("출력:" );
		System.out.printf("%.2f", a+b);
      
	}
}