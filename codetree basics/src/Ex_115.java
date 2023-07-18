/*
 
 */
import java.util.Scanner;

public class Ex_115 {
	public static void main(String[] args) {
		System.out.println("정수 n의 값을 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();	

		if ((n % 2 != 0 && n % 3 == 0) || (n % 2 == 0 && n % 5 == 0)) { //논리연산자를 같이 쓸 때에는 ()로 묶어줘야한다. &&가 ||보다 우선순위가 더 높기 때문에 소괄호로 우선순위를 정해준다.
			System.out.println("true");
	    } else {
			System.out.println("false");
		}
	}
}