/*2개의 정수 a, b를 입력받아 첫 번째 수의 짝홀 여부와, 두 번째 수의 짝홀 여부를 출력하는 프로그램을 작성해주세요.
첫 번째 줄에 정수 a, b가 공백을 사이에 두고 주어집니다.
1 ≤ a, b ≤ 100 
첫 번째 줄에는 정수 a에 대한 정보를 출력합니다. a가 짝수라면 even을, 홀수라면 odd를 출력합니다.
두 번째 줄에는 정수 b에 대한 정보를 출력합니다. b가 짝수라면 even을, 홀수라면 odd를 출력합니다. */

import java.util.Scanner;

public class Ex_089 {
	public static void main(String[] args) {
		System.out.println("정수 a, b를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();	
		b = scanner.nextInt();	
		
		if (a % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		if (b % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}