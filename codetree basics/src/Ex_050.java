/*문자 c를 하나 입력받아 그대로 출력하는 프로그램을 작성해주세요.
 * 첫 번째 줄에는 c가 주어집니다. 항상 알파벳만 주어진다고 가정해도 좋습니다.*/

import java.util.Scanner;

public class Ex_050 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("출력:");

		//String s = scanner.next(); // 문자열 입력 Java에서 문자 1개만 입력받을 수는 없음. 항상 문자열 단위로 입력
		//char c = s.charAt(0); // 입력받은 문자열의 첫 번째 문자 추출
		char c = scanner.next().charAt(0);

		System.out.println("출력:");
		System.out.println(c);
		
	}

}
