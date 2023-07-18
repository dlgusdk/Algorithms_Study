/*세 개의 정수가 주어졌을 때, 세 정수의 합과 평균을 구하고, 합에서 평균을 뺀 값을 구하는 프로그램을 작성해보세요.
첫 번째 줄에 세 정수 a, b, c가 공백을 두고 주어집니다.
단, a, b, c의 합은 3의 배수임을 가정하여도 좋습니다.
1 ≤ a, b, c ≤ 100 
첫 번째 줄에는 합을 출력합니다.
두 번째 줄에는 평균을 출력합니다.
세 번째 줄에는 합에서 평균을 뺀 값을 출력합니다.*/

import java.util.Scanner;

public class Ex_068 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("입력:");
		
		int a ,b, c, z;
	    a = scanner.nextInt();
	    b = scanner.nextInt();
	    c = scanner.nextInt();
	    z = a+b+c;
	    
	    System.out.println("출력:");
	    System.out.println(z);
	    System.out.printf("%d%n", (z)/3);
	    System.out.printf("%d%n", z-z/3);
	    //System.out.printf("%d%n", (a+b+c)-(a+b+c)/3);
	}

}
