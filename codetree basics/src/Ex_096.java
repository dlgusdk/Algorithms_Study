/*정수 a를 입력 받아 a가 10이상 20 이하인 수인지를 판단하는 프로그램을 작성해보세요
첫 번째 줄에 a가 주어집니다.
1 ≤ a ≤ 100
첫 번째 줄에 정수 a에 대한 정보를 출력합니다. a가 10 이상 20 이하인 수라면 yes를, 아니라면 no를 출력합니다. */

import java.util.Scanner;

public class Ex_096 {
	public static void main(String[] args) {
		System.out.println("정수 a를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();	
		
		if (a >= 10 && a <= 20) {   //&&와 ||로 2개 이상의 조건을 만들 수 있음. 10 <= a <= 20라고 쓸 수 x
			System.out.println("yes");
		} else {
			System.out.println("no");
		}		
	}
}