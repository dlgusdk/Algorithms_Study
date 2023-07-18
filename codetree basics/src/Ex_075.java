/*두 개의 정수 a, b를 입력받아 a가 b보다 크다면 두 수의 곱을 출력하고, 그렇지 않다면 b를 a로 나눈 몫을 출력하는 프로그램을 작성해보세요.
첫 번째 줄에 두 정수 a, b가 공백을 두고 주어집니다.
1 ≤ a, b ≤ 100
첫 번째 줄에 크기 비교 결과에 따라, a가 b보다 크다면 두 수의 곱을, 그렇지 않다면 b를 a로 나눈 몫을 출력합니다.*/

import java.util.Scanner;

public class Ex_075 {
	public static void main(String[] args) {		        
		System.out.println("두 정수를 입력해 주세요.");
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if (a > b) {
			System.out.printf("%d", a * b);
		} else {
			System.out.printf("%d", b / a);
		}
	}
}