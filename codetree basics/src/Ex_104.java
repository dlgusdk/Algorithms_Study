/*자연수 n을 입력받아 n이 굉장한 숫자인지 판단하는 프로그램을 작성해보세요.
굉장한 숫자이기 위해서는 다음 두 조건 중 하나를 만족해야 합니다.
홀수이면서 3의 배수인 수
짝수이면서 5의 배수인 수
첫 번째 줄에는 n이 주어집니다.
1 ≤ n ≤ 100
입력받은 숫자가 굉장한 숫자라면 true를 아니라면 false를 출력합니다.*/

import java.util.Scanner;

public class Ex_104 {
	public static void main(String[] args) {
		System.out.println("정수 n의 값을 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();	

		if ((n % 2 == 1 && n % 3 == 0) || (n % 2 == 0 && n % 5 == 0)) { //논리연산자를 같이 쓸 때에는 ()로 묶어줘야한다. &&가 ||보다 우선순위가 더 높기 때문에 소괄호로 우선순위를 정해준다.
			System.out.println("true");
	    } else {
			System.out.println("false");
		}
	}
}