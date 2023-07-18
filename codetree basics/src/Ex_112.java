/*3개의 정수 a, b, c를 입력받았을 때, 최댓값을 출력하는 프로그램을 작성해보세요.
첫 번째 줄에 정수 a, b, c가 공백을 사이에 두고 주어집니다.
-100 ≤ a, b, c ≤ 100 a, b, c 의 값들 중 가장 큰 값 하나를 출력합니다.*/

import java.util.Scanner;

public class Ex_112 {
	public static void main(String[] args) {
		System.out.println("세 정수 a, b, c를 입력해 주세요.");
		Scanner sc = new Scanner(System.in); 
		int a ,b ,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a >= b) { 
         if (a >= c) {
			System.out.println(a);
         } else {
            System.out.println(c);
         }
       	 
		} else {
		   if (b >= c) {
			   System.out.println(b);
		   } else {
			   System.out.println(c);
		   }
		}
	}
}
		
	   	
