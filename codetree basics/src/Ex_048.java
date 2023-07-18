/*세 개의 실수를 입력 받아 반올림하여 소수 셋째 자리까지 출력하는 프로그램을 작성해주세요.
한 줄에 하나씩 세 실수 a, b, c가 주어집니다.
한 줄에 하나씩 세 실수를 반올림하여 소수 셋째 자리까지 출력합니다.
1 ≤ a, b, c ≤ 1,000 */

import java.util.Scanner;

public class Ex_048 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("a값, b값, c값 입력:");
		
		float a, b, c;                 //double a, b, c;
		a = scanner.nextFloat();	   // a = scanner.nextDouble(); 
		b = scanner.nextFloat();       // b = scanner.nextDouble();
		c = scanner.nextFloat();       // c = scanner.nextDouble();
		
		System.out.print("출력:" );
		System.out.printf("%.3f%n", a);
		System.out.printf("%.3f%n", b);
		System.out.printf("%.3f%n", c);  
		//System.out.printf("%.3f%n%.3f%n%.3f%n", a, b, c);  
      
	}
}