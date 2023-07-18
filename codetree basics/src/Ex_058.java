/*010-xxxx-yyyy 형태의 전화번호를 입력받아 앞 4자리와 뒤 4자리를 바꾸어 출력하는 프로그램을 작성해보세요.
첫 번째 줄에 전화번호가 010-xxxx-yyyy의 형태로 주어집니다. xxxx와 yyyy는 0으로 시작되지 않음을 가정해도 좋습니다.
1 ≤ x, y ≤ 9 
입력받은 전화번호를 010-yyyy-xxxx의 형태로 출력합니다.*/

import java.util.Scanner;

public class Ex_058 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("입력:");

		scanner.useDelimiter("-");
		int z, x, y, tmp;
		z = scanner.nextInt();  //변수 z에는 010이 저장되는데 010은 정수 체계에서 정의될 수 없느 값이므로 10이 출력된다.
		x = scanner.nextInt();
		y = scanner.nextInt();

		tmp = x;
		x = y;
		y = tmp;

		System.out.println("출력:");
		System.out.printf("010-%d-%d", x, y);
        // System.out.print(a + "-" + c + "-" + b);
	}

}



