/*두 정수 a, b를 입력받아 두 정수의 합과 평균을 구해 출력하는 프로그램을 작성해보세요
첫 번째 줄에 정수 a, b가 공백을 사이에 두고 주어집니다.
1 ≤ a, b ≤ 100
첫 번째 줄에 합과 평균을 공백을 사이에 두고 출력합니다. 평균값은 소수 첫째자리까지 출력합니다. */

import java.util.Scanner;

public class Ex_066 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("입력:");
		
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println("출력:");
		System.out.printf("%d %.1f%n", a+b, (double)a+b/2);
		// System.out.printf("%d %.1f", a + b, (double)(a + b) / 2);
	}

}  
  