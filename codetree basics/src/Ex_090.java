/*2개의 정수를 입력 받아 첫 번째 수가 더 작으면 1 아니면 0을 출력하고, 두 개의 수가 같으면 1 아니면 0 을 출력하는 프로그램을 작성해주세요.
첫 번째 줄에 정수 a, b가 공백을 사이에 두고 주어집니다.
1 ≤ a, b ≤ 100 
결과값 숫자 두 개를 공백을 사이에 두고 출력합니다. */

import java.util.Scanner;

public class Ex_090 {
	public static void main(String[] args) {
		System.out.println("정수 a, b를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();	
		b = scanner.nextInt();	
		
		if(a < b) {
            System.out.print("1 ");
		} else {
            System.out.print("0 ");
		}
		
        if(a == b) {
            System.out.println("1");
        } else  {
            System.out.println("0");
		}
	}
}