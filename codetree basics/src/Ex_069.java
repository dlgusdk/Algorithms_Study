/*정수를 입력받아 출력하고 음수를 구별하는 프로그램을 작성해보세요.
 첫 번째 줄에는 정수 n이 주어집니다.
-100 ≤ n ≤ 100
첫째줄에는 입력받은 정수를 출력합니다.
그 정수가 음수일 경우에는 두번째줄에 minus를 출력합니다.*/

import java.util.Scanner;

public class Ex_069 {
	public static void main(String[] args) {
		System.out.println("숫자를 하나 입력하세요.");
		Scanner scanner = new Scanner(System.in);		
		int x = scanner.nextInt();
		//String input = scanner.nextLine();
		//int x = Integer.parseInt(input);
		System.out.println(x);
		
		if(x < 0) {
			System.out.printf("%s", "minus");
		}
	}
}  
