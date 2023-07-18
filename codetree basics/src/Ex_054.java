/*h:m 모양의 시간과 분으로 이루어져 있는 시간을 입력받아 1시간 뒤의 시간을 출력하는 프로그램을 작성해보세요.
 입력받은 시간으로부터 1시간 뒤의 시간을 입력과 동일한 형태 h:m에 맞춰 출력합니다.
 첫 번째 줄에 현재 시간이 h:m 형태로 주어집니다. h는 시간을, m은 분을 나타냅니다.
 1 ≤ h ≤ 22, 0 ≤ m < 60*/

import java.util.Scanner;

public class Ex_054 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("입력:");
		
		scanner.useDelimiter(":");// : 기준으로 잘라서 입력 받겠다는 뜻
		int h = scanner.nextInt(); // : 기호가 나오기 전까지 입력 진행
		int m = scanner.nextInt(); // : 기호가 나오기 전 or 입력의 마지막 부분까지 진행
		
		System.out.println("출력:");
		System.out.printf("%d:%d", h+1, m);
       // System.out.println((h + 1) + ":" + m);
	}

}
