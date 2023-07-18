/*실수 a 를 입력받아 a에 1.5를 더한 값을 소수점 아래 둘째자리까지 출력하는 프로그램을 작성해보세요.
 1 ≤ a ≤ 100
 첫 번째 줄에 실수 a에 1.5을 더한 값을 소수점 아래 둘째자리까지 출력합니다.*/

import java.util.Scanner;

public class Ex_040 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	   System.out.println("입력:");
	   //double a = scanner.nextDouble();
	   //String input = scanner.nextLine();
	   //Double a = Double.parseDouble(input);
	   String input = scanner.nextLine();
	   float a = Float.parseFloat(input);
	   
	   System.out.println("출력:");
       System.out.printf("%.2f", a+1.5);
	}

}
