/*중간고사를 90점 이상 받은 자들로 한해서, 기말고사 점수에 따라 장학금을 지급하기로 했습니다. 기말고사 점수가 100점 만점에 95점 이상은 10만 원, 90점 이상은 5만 원, 그 미만 점수는 받지 못합니다. 중간, 기말고사 점수를 입력했을 때 받을 수 있는 장학금을 출력하는 프로그램을 작성해주세요.
첫 번째 줄에 중간, 기말고사 점수가 공백을 사이에 두고 차례대로 주어집니다. 
조건을 충족시키는 장학금을 출력해줍니다.
0 ≤ 중간, 기말 점수 ≤ 100 */

import java.util.Scanner;

public class Ex_106 {
	public static void main(String[] args) {
		System.out.println("중간, 기말고사 점수를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int mid = scanner.nextInt();
		int fin = scanner.nextInt();	

	    if (mid >= 90 && fin >= 95) {
			System.out.println("100000");
		} else if (mid >= 90 && fin >= 90) {
			System.out.println("50000");
		} else {
			System.out.println("0");
		}	 
	}
}