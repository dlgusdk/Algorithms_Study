/*정수 a가 주어졌을 때, a가 1이라면 t 를 출력하고, 1이 아니라면 f 를 출력하는 프로그램 삼항연산자를 사용하여 작성해보세요.
첫 번째 줄에 정수 a가 주어집니다.
0 ≤ a ≤ 100
첫 번째 줄에 a가 1이라면 t 를 출력하고, 1이 아니라면 f 를 출력합니다*/

import java.util.Scanner;

public class Ex_078 {
	public static void main(String[] args) {		        
		System.out.println("숫자를 입력해 주세요.");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
        String result;
		
		result = (a == 1) ? "t" : "f" ;

		System.out.println(result);	
	}
}   