/*1피트(ft)는 30.48cm입니다.
실수의 피트(ft)를 입력받아 cm로 환산하여 값을 반올림하여 첫째자리까지 출력하는 프로그램을 작성해주세요
0 ≤ n ≤ 100 입력받은 실수값을 환산하고 반올림하여 첫째자리까지 출력합니다.*/

import java.util.Scanner;

public class Ex_039 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	   System.out.println("입력:");
	   //double n = scanner.nextDouble();
	   String input = scanner.nextLine();
	   Double n = Double.parseDouble(input);
	   
	   System.out.println("출력:");
       System.out.printf("%.1f", n*30.48);
	}

}
