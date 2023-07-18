/*A와 B의 수학과 영어의 점수를 입력받아 누가 더 높은지 비교하는 프로그램을 작성해주세요.
첫번째 줄에 A의 수학과 영어점수가 공백을 사이에 두고 주어집니다.
두번째 줄에 B의 수학과 영어점수가 공백을 사이에 두고 주어집니다.
1 ≤ 입력으로 주어지는 점수 ≤ 100
A가 B보다 수학의 점수도 크고 영어의 점수도 크면 1, 그렇지 않으면 0을 출력합니다. */

import java.util.Scanner;

public class Ex_095 {
	public static void main(String[] args) {
		System.out.println("A와 B의 수학과 영어 점수를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int am, ae, bm, be;
		am = scanner.nextInt();	
		ae = scanner.nextInt();	
		bm = scanner.nextInt();	
		be = scanner.nextInt();		
		
		if (am > bm && ae > be) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}