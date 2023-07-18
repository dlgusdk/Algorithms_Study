/*정수 a가 3의 배수라면 YES를, 아니라면 NO를 출력하고, 또 5의 배수라면 YES를, 아니라면 NO 출력하는 프로그램을 작성해보세요.
첫 번째 줄에 정수 a가 주어집니다.
1 ≤ a ≤ 100
첫 번째 줄에 정수 a가 3의 배수라면 YES를, 아니라면 NO를 출력합니다.
두 번째 줄에 정수 a가 5의 배수라면 YES를, 아니라면 NO 출력합니다.*/

import java.util.Scanner;

public class Ex_091 {
	public static void main(String[] args) {
		System.out.println("정수 a, b를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();	
		
		if(a % 3 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		if(a % 5 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}