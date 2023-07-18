/*점수를 입력받아 통과인지, 통과를 못 했다면 몇 점이 더 필요한지 출력하는 프로그램을 작성해주세요.
첫 번째 줄에는 정수 n이 주어집니다.
0 ≤ n ≤ 100
입력받은 정수가 80 이상이면 pass라고 출력하고, 그렇지 않다면 몇 점이 더 있어야 통과되는지를 "○ more score"라는 메시지로 출력합니다.  */

import java.util.Scanner;

public class Ex_073 {
	public static void main(String[] args) {		        
		System.out.println("점수를 입력해 주세요.");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if (score >= 80) {
			System.out.println("pass");
		} else {
			System.out.printf("%d more score", 80 - score);
		}
	}
}