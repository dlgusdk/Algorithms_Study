/*양쪽눈의 시력을 실수(real number)로 입력받아 모두 1.0 이상이면 High, 모두 0.5 이상이면 Middle, 아니면 Low라고 출력하는 프로그램을 작성해주세요.
한 줄에 하나씩 두 실수 a, b가 주어집니다.
0 ≤ a, b ≤ 5
출력값에 해당하는 문자열을 출력합니다.*/

import java.util.Scanner;

public class Ex_097 {
	public static void main(String[] args) {
		System.out.println("양쪽 눈의 시력 a, b의 값을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
	    double a, b;
		a = scanner.nextDouble();	
		b = scanner.nextDouble();	
		
		if (a >= 1.0 && b >= 1.0) {
			System.out.println("High");
		} else if (a >= 0.5 && b >= 0.5) {
			System.out.println("Middle");
		} else {
			System.out.println("Low");
		}
	}
}