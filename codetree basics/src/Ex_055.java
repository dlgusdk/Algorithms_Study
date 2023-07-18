/*mm-dd-yyyy 모양의 날짜 정보를 입력받아 yyyy.mm.dd 형식으로 출력하는 프로그램을 작성해보세요.
 첫 번째 줄에 날짜 정보가 mm-dd-yyyy 형태로 주어집니다. yyyy는 연도를, mm은 월을, dd는 일을 의미합니다.
1 ≤ yyyy ≤ 2021
1 ≤ mm ≤ 12
1 ≤ dd ≤ 28
입력받은 날짜를 yyyy.mm.dd 형식으로 바꾸어 출력합니다.*/

import java.util.Scanner;

public class Ex_055 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("입력:");
		
		scanner.useDelimiter("-");
		int m, d, y;
		m = scanner.nextInt();
		d = scanner.nextInt();
		y = scanner.nextInt();
		
		System.out.println("출력:");
		System.out.printf("%d.%d.%d", y, m, d);
	}

}
