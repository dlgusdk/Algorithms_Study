/*문자열 s를 하나 입력받아 그대로 출력하는 프로그램을 작성해주세요.
첫 번째 줄에는 s가 주어집니다. 문자열 s는 알파벳으로만 이루어져 있다고 가정해도 좋습니다.
1 ≤ 문자열 s의 길이 ≤ 100*/

import java.util.Scanner;

public class Ex_051 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력:");
		
		String a =scanner.next();
		
		System.out.println("출력:");
		System.out.println(a);
	}

}
