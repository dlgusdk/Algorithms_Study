/*정수 a가 주어졌을 때, a가 홀수라면 3을 더해줍니다.
이후, 최종적으로 a가 3의 배수라면 3으로 나누어줍니다.
위의 연산을 한 결과값을 출력하는 프로그램을 작성해보세요.
첫 번째 줄에 정수 a가 주어집니다.
1 ≤ a ≤ 100 */

import java.util.Scanner;

public class Ex_088 {
	public static void main(String[] args) {
		System.out.println("정수 a를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		if (a % 2 == 1) {
			a += 3;
		}
		
		if (a % 3 ==0 ) {
			a /= 3;
		}
		System.out.println(a);
	}
}