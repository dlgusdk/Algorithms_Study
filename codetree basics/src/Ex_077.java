/*시험 결과가 100점일 경우에만 0등급을, 그 외엔 점수에 따른 등급 1~9를 부여하기로 했다. 오로지 등급 0 만 pass고, 나머지 등급을 받은 사람들의 점수를 failure라고 출력하는 프로그램을 삼항연산자를 사용하여 작성해보세요.
첫 번째 줄에 시험점수를 입력받습니다.
0 ≤ 시험 점수 ≤ 100
점수에 맞는 등급을 통해 pass인지 failure인지 출력한다.*/

import java.util.Scanner;

public class Ex_077 {
	public static void main(String[] args) {		        
		System.out.println("점수를 입력해 주세요.");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		String result;
		
		result = (score == 100) ? "pass" : "failure" ;

		System.out.println(result);
	}
}