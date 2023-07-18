/*정수 a를 입력받고, a에 2를 더해준 값을 출력하는 프로그램을 작성해보세요.
 1 ≤ a ≤ 100
(이 말은 입력으로 들어오는 a의 범위가 1이상 100이하임을 가정해도 좋다는 뜻입니다.
1에서부터 100까지 입력받는 범위를 강제해야 한다는 뜻이 아님에 유의합니다.)*/

import java.util.Scanner;

public class Ex_034 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("입력:");
        int a = scanner.nextInt();

        System.out.println("출력:");
        System.out.printf("%d", a+2);

	}

}
