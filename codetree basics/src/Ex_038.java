/*실수값 n을 하나 입력받아 소수점 둘째자리까지 반올림하여 출력하는 프로그램을 작성해주세요.
0 ≤ n ≤ 50
입력받은 실수값을 소수점 둘째자리까지 반올림하여 출력합니다.*/

import java.util.Scanner;

public class Ex_038 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		System.out.println("입력:");
		double n = scanner.nextDouble();
		//float n = scanner.nextFloat();
		
		System.out.println("출력:");
		System.out.printf("%.2f", n);
	}

}
