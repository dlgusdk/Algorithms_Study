/*OOOOOO-OOOOOOO 형식으로 이루어져 있는 주민번호를 입력받아, -를 제외하여 출력하는 프로그램을 작성해보세요.
 첫 번째 줄에 주민번호가 OOOOOO-OOOOOOO 형태로 주어집니다. 앞은 6자리, 뒤는 7자리로 숫자로 이루어져 있습니다. 앞, 뒤 모두 맨 앞 숫자가 0으로 주어지는 경우는 없다고 가정해도 좋습니다.
 입력받은 주민번호에서 -를 제외한 결과를 출력합니다.*/

import java.util.Scanner;

public class Ex_056 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("입력:");

		scanner.useDelimiter("-");
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();

		System.out.println("출력:");
		System.out.printf("%d%d", a, b);
		//System.out.println(a + "" + b);

	}
}