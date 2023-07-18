/*n만큼의 돈으로 살 수 있는 물건 중 가장 비싼 물건을 출력하는 프로그램을 작성해보세요.
 
 물건   가격

book  3000
mask  1000 

첫 번째 줄에 가지고 있는 돈 n이 주어집니다.
0 ≤ n ≤ 10,000
첫 번째 줄에 살 수 있는 가장 비싼 물건의 이름을 출력합니다. 만약, 아무것도 살 수 없다면 no 를 출력합니다.*/
 
import java.util.Scanner;

public class Ex_081 {
	public static void main(String[] args) {		        
		System.out.println("가지고 있는 돈은 총 얼마입니까?");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		
		if (money >= 3000) {
			System.out.println("book");
		} else if (money >= 1000) {
			System.out.println("mask");
		} else {
			System.out.println("no");
		}		        
	}
}