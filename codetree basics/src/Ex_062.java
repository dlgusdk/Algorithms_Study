/*두 정수를 입력받아서 나눈 몫과 나머지를 출력하는 프로그램을 작성해주세요.
첫 번째 줄에 정수 a, b가 공백을 사이에 두고 주어집니다.
1 ≤ a, b ≤ 100 
두 정수의 몫과 나머지를 순서대로 출력하되 사이에 "..."를 포함합니다.*/

import java.util.Scanner;

public class Ex_062 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력:");
		
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();

		System.out.println("출력:");
		System.out.printf("%d...%d%n", a/b, a%b);
		// System.out.println(a / b + "..." + a % b);
	}
}