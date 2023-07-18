/*정수 a를 입력받아 a가 10보다 작거나 20보다 큰 수인지를 판단하는 프로그램을 작성해보세요. 
첫 번째 줄에 a가 주어집니다.
1 ≤ a ≤ 100
첫 번째 줄에 a에 대한 정보를 출력합니다. a가 10보다 작거나 20 보다 크다면 yes를, 아니라면 no를 출력합니다. */

import java.util.Scanner;

public class Ex_101 {
	public static void main(String[] args) {
		System.out.println("정수 a의 값을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();	
  
		if (a < 10 || a > 20) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
