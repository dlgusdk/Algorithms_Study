/*3개의 정수를 입력 받아 첫 번째 수가 세 정수의 최솟값과 일치한다면 1 아니면 0을 출력하고, 세 개의 수가 모두 같으면 1 아니면 0 을 출력하는 프로그램을 작성해주세요.
첫 번째 줄에 정수 a, b, c가 공백을 사이에 두고 주어집니다.
1 ≤ a, b, c ≤ 100
결과값 숫자 두 개를 공백을 사이에 두고 출력합니다.*/

import java.util.Scanner;

public class Ex_098 {
	public static void main(String[] args) {
		System.out.println("정수 a, b, c의 값을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		a = scanner.nextInt();	
		b = scanner.nextInt();	
		c = scanner.nextInt();	
		
		if (a <= b && a <= c) { // 값이 1 1 1 이어도 최소값이기 때문 <=
			System.out.println("1 "); // 공백을 사이에 끼고 두 수를 출력하는 법 " "을 +해주거나 "1 1"처럼 중간에 공백을 둔다
		} else {
			System.out.println("0 ");
		}			
		
		if (a == b && b == c){
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}