/*3개의 정수 a, b, c를 입력받았을 때, 중앙값을 구하는 프로그램을 작성해보세요.
중앙값이란, 오름차순으로 나열했을 때 중앙에 오는 값입니다.
첫 번째 줄에 정수 a, b, c가 공백을 두고 주어집니다.
-100 ≤ a, b, c ≤ 100 첫 번째 줄에 a, b, c 의 값들 중 중앙값을 출력합니다.
단, 주어지는 세 정수 a, b, c는 서로 다르다고 가정해도 좋습니다.*/

import java.util.Scanner;

public class Ex_114 {
	public static void main(String[] args) {
		System.out.println("세 정수 a, b, c를 입력하세요.");
		Scanner sc = new Scanner(System.in); 
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a > b) {
			if (b > c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}			
		} else if (a < c) {
			if (b > c) {
				System.out.println(c);
			} else {
				System.out.println(b);
			}
		} else {
			if (b > c) {
				System.out.println(a);
			}
		}
	}
}

