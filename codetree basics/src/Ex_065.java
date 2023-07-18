/*두 정수 a, b 를 입력받고, a + b 를 a - b 으로 나눈 값을 반올림하여 소수점 둘째 자리까지 출력하는 프로그램을 작성해보세요.
첫 번째 줄에 두 정수 a, b이 공백을 두고 주어집니다.
1 ≤ b < a ≤ 1,000
첫 번째 줄에 a + b 를 a - b로 나눈 값을 반올림하여 소수점 둘째 자리까지 출력합니다.*/

import java.util.Scanner;

public class Ex_065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("입력:");
        
        int a, b, z;
        a = scanner.nextInt();
        b = scanner.nextInt();
        z = a + b; 
        
        System.out.println("출력:");
        System.out.printf("%.2f", (float)z/(a-b));
    }
}