/*점수를 입력받아 출력하는 프로그램을 작성해보세요. 1 ≤ n ≤ 1,000*/

import java.util.Scanner;

public class Ex_035 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		String input = scanner.nextLine();
		int score = Integer.parseInt(input);
		//int score = scanner.nextInt();
		
		System.out.printf("Your score is %d point.", score);
		

	}

}
