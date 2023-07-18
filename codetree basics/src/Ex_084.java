/*영문 대문자를 입력받아'S'이면 Superior, 'A'이면 Excellent, 'B'이면 Good, 'C'이면 Usually,
'D'이면 Effort, 그 외 문자이면 Failure 라고 출력하는 프로그램을 작성해주세요.*/

import java.util.Scanner;

public class Ex_084 {
	public static void main(String[] args) {
		System.out.println("영문 대문자를 입력해 주세요.");
		Scanner scanner = new Scanner(System.in);
		char capital = scanner.next().charAt(0);//char 변환 기억해두기 
		
		if (capital == 'S') {
			System.out.println("Superior");
		} else if (capital == 'A') {
			System.out.println("Excellent");
		} else if (capital == 'B') {
			System.out.println("Good");
		} else if (capital =='C') {
			System.out.println("Usually");
		} else if (capital =='D') {
			System.out.println("Effort");
		} else {
			System.out.println("Failure");
		}
	}
}
     