/*문자c와 실수 a,b를 입력받아 출력하되 실수는 반올림하여 소수 둘째자리까지 출력하는 프로그램을 작성해주세요.
(C++, Java 의 경우 실수는 "double"로 선언하세요.)
첫 번째 줄에는 입력받은 문자 c
두 번째 줄에는 반올림한 실수 a의 값
세 번째 줄에는 반올림한 실수 b의 값을 출력합니다.*/

import java.util.Scanner;

public class Ex_052 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       /*char a;
        double b, c;*/
        String s = scanner.next();
        char x = s.charAt(0);
       // char x = scanner.next().charAt(0);
        
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
       
        System.out.println(x);
        System.out.printf("%.2f%n", y);
        System.out.printf("%.2f%n", z); 
        
	}

}
