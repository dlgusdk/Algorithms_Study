/*윤년이 아닌 해에 n월에는 몇 일이 있는지를 출력하는 프로그램을 작성하세요. 윤년이 아닌 해의 2월은 28일까지 있습니다.
첫 번째 줄에 n이 주어집니다.
1 ≤ n ≤ 12 */

import java.util.Scanner;

public class Ex_111 {
	public static void main(String[] args) {
		System.out.println("몇 월 입니까?");
		Scanner sc = new Scanner(System.in); 
       	int n = sc.nextInt();
         
        if (n % 2 == 1 && n <= 7 || n % 2 == 0 && n >= 8) { 
           System.out.println("31");
        } else if (n == 2) {
           System.out.println("28");
        } else {
           System.out.println("30");
        }
     /* if(n == 2)
            System.out.println("28");
        else if(n <= 7) {  //7월을 기점으로 7월보다 작으면 홀수 달은 31일 이상이면 30일이 된다.
            if(n % 2 == 1)
                System.out.println("31");
            else
                System.out.println("30");
        }
        else {
            if(n % 2 == 0)
                System.out.println("31");
            else
                System.out.println("30");
        }     */
    }
}