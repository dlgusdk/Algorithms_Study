/*정수 a를 입력받았을 때 a의 값이 5인 경우엔 A를, 2의 배수인 경우엔 B를 출력하는 프로그램을 작성해보세요. 둘 다 해당하지 않는 경우에는 아무 값도 출력하지 않습니다.
첫 번째 줄에 정수 a가 주어집니다.
1 ≤ a ≤ 1,000 */

import java.util.Scanner;

public class Ex_087 {
	public static void main(String[] args) {
		System.out.println("정수 a를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		if (a == 5) {
			System.out.print("A");
		} 
		
		if (a % 2 == 0) {
			System.out.print("B");
		}
	}
}