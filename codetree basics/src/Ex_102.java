/*정수 a를 입력받았을 때 13의 배수이거나 19의 배수인 경우는 True, 그 외의 경우는 False를 출력하는 프로그램을 작성해주세요.
첫 번째 줄에 정수 a가 주어집니다.
1 ≤ a ≤ 1,000  첫 번째 줄에는 a에 따른 경우의 값을 출력합니다.*/

import java.util.Scanner;

public class Ex_102 {
	public static void main(String[] args) {
		System.out.println("정수 a의 값을 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();	

		if (a % 13 == 0 || a % 19 == 0) {
			System.out.println("True");
	    } else {
			System.out.println("False");
		}
	}
}