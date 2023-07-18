/*시험점수에 따라 등급을90점 이상을 A, 80점 이상을 B, 70점 이상을 C, 60점 이상을 D,
60점 미만을 F라고 합니다. 점수를 입력받아 등급을 출력하는 프로그램을 작성해주세요.
첫 번째 줄에는 정수 n이 주어집니다.
0 ≤ n ≤ 100 */

import java.util.Scanner;

public class Ex_083 {
	public static void main(String[] args) {
		System.out.println("시험점수를 입력해 주세요.");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}