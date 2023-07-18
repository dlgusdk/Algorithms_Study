/*문자열 s와 문자열 t를 입력받아 순서를 바꾸어 출력하는 프로그램을 작성해보세요.
첫 번째 줄에 문자열 s가, 두 번째 줄에 문자열 t가 차례대로 주어집니다. 단, 문자열 s와 t는 알파벳 소문자로만 이루어져있다고 가정해도 좋습니다
1 ≤ 문자열 s의 길이, 문자열 t의 길이 ≤ 10*/


import java.util.Scanner;

public class Ex_053 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력:");
		
		//String s, t;
		String s = scanner.next();
		String t = scanner.next();
		
		String tmp;
		tmp = s;
		s = t;
		t = tmp;

		System.out.println("출력:");
		System.out.println(s);
		System.out.println(t);
	}

}
