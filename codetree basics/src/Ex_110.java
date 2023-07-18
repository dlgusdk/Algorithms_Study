/*자연수 y를 입력받아 y년이 윤년인지를 판단하는 프로그램을 작성해보세요. 윤년일 조건은 다음과 같습니다.
4의 배수라면 윤년입니다.
4의 배수이면서 100의 배수라면 윤년이 아닙니다.
4의 배수이면서 100의 배수지만 또한 400의 배수라면 윤년입니다.
나머지 경우에는 윤년이 아닙니다.
첫 번째 줄에는 y이 주어집니다.
입력받은 연도가 윤년이라면 true를 아니라면 false를 출력합니다.
1 ≤ y ≤ 2222 */

import java.util.Scanner;

public class Ex_110 {
	public static void main(String[] args) {
		System.out.println("몇 년도 입니까?");
		Scanner sc = new Scanner(System.in); //sc == scanner
       	int year = sc.nextInt();
         
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) { //if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
          System.out.println("true");
        } else {
          System.out.println("false");  
        }
    }
}