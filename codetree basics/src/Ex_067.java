/*세 개의 정수를 입력받아서 합계와 평균을 출력하는 프로그램을 작성해주세요.
(단, 평균은 소수 이하를 버립니다.)
첫 번째 줄에 정수 a, b, c가 공백을 사이에 두고 주어집니다.
1 ≤ a, b, c ≤ 100
첫 번째 줄에는 합을 출력합니다. 두 번째 줄에는 평균을 출력합니다.*/

import java.util.Scanner;

public class Ex_067 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("입력:");
		
	    int a ,b, c;
	    a = scanner.nextInt();
	    b = scanner.nextInt();
	    c = scanner.nextInt();
	    
	    System.out.println("출력:");
	    System.out.println(a+b+c);
	    System.out.printf("%d", (a+b+c)/3);
	}

}
