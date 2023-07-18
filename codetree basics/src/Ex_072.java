/*한 변의 길이가 n인 정사각형의 넓이를 구하는 프로그램을 작성해보세요.
단, n이 5보다 작다면 tiny 를 출력합니다.
첫 번째 줄에 자연수 n이 주어집니다.
1 ≤ n ≤ 100  
첫 번째 줄에, 정사각형의 넓이를 출력합니다.
n이 5보다 작다면 두 번째 줄에 tiny 를 출력합니다.*/

import java.util.Scanner;

public class Ex_072 {
	public static void main(String[] args) {		
		System.out.println("한 변의 길이를 적어주세요.");
		Scanner scanner = new Scanner(System.in);

		int n;
		n = scanner.nextInt();
		
		System.out.printf("%d%n", n * n);
		
		if (n < 5) {
			System.out.println("tiny");
		}
	}
}
