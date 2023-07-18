/*정수 a를 입력받았을 때, a가 113 이상일 경우엔 1을 출력하고, 그 외의 경우엔 0을 출력하는 프로그램을 작성해보세요.
첫 번째 줄에 정수 a가 주어집니다.
-1,000 ≤ a ≤ 1,000  
첫 번째 줄에는 a에 따른 경우의 값을 출력합니다 */

import java.util.Scanner;

public class Ex_074 {
	public static void main(String[] args) {		        
		System.out.println("숫자를 입력해 주세요.");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		if (a >= 113) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}