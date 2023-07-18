/*정수 2개를 입력받아 두 값중 최댓값을 출력하는 프로그램을 작성해보세요.
첫 번째 줄에 정수 a, b가 공백을 사이에 두고 주어집니다.
1 ≤ a, b ≤ 100 
첫 번째 줄에 최댓값을 출력합니다.*/

import java.util.Scanner;

public class Ex_076 {
	public static void main(String[] args) {		        
		System.out.println("두 정수를 입력해 주세요.");
		Scanner scanner = new Scanner(System.in);
		
		int a, b, result;
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		result = (a > b) ? a : b ;
		
		System.out.println(result);
	}
}   