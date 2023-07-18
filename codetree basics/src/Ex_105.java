/*몇 월인지를 입력받아, 어떤 계절인지를 출력하는 프로그램을 작성해보세요.
3~5월이 봄, 6~8월이 여름, 9~11월이 가을, 12~2월이 겨울이라 가정합니다.
첫 번째 줄에 월을 나타내는 m이 주어집니다.
1 ≤ m ≤ 12 
첫 번째 줄에 어떤 계절인지를 출력합니다.
단, 봄의 경우에는 Spring을,
여름의 경우에는 Summer를,
가을의 경우에는 Fall을,
겨울의 경우에는 Winter를 출력합니다.*/

import java.util.Scanner;

public class Ex_105 {
	public static void main(String[] args) {
		System.out.println("몇 월인지 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();	

		if (m == 3 || m == 4 || m == 5 ) {	
			System.out.println("Spring");
	    } else if (m >= 6 && m <= 8) {
			System.out.println("Summer");
		} else if (m == 9 ||m == 10 || m == 11) {
			System.out.println("Fall");
		} else if (m == 12 || m == 1 || m == 2) {
			System.out.println("Winter");
	    }
	  /*if (m >= 12 || m <= 2 ) {	
			System.out.println("Winter");
	    } else if (m >= 9) {
			System.out.println("Fall");
		} else if (m >= 6) {
			System.out.println("Summer");
		} else {
			System.out.println("Spring");
		}	 */ 
	}
}