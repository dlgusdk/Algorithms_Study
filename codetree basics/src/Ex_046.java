/*정수 a, b를 입력받고, a와 b를 출력해주는 프로그램을 작성하세요.
첫 번째 줄에 정수 a,두 번째 줄에 정수 b가 주어집니다.
1 ≤ a, b ≤ 100 
첫 번째 줄에 a와 b를 공백을 사이에 두고 출력합니다.*/

import java.util.Scanner;

public class Ex_046 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("a값과 b값 입력:");
		
		int a, b;
		a = scanner.nextInt();	    
		b = scanner.nextInt();
        //a = sc.nextInt();
        //b = sc.nextInt();
		
		System.out.print("출력:" );
		System.out.printf("%d %d", a, b);
        //System.out.println(a + " " + b);
	}
}