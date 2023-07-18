/*정수 2개를 입력받아서 첫 번째 수에는 87을 증가시켜 저장하고 두 번째 수는 10으로 나눈 나머지를 저장한 후 두 수를 차례로 출력하는 프로그램을 작성해보세요.
한 줄에 하나씩 두 정수 a, b가 주어집니다.
첫 번째 줄에는 정수 a를 87증가시킨 값을,
두 번째 줄에는 정수 b를 10으로 나눈 나머지의 값을 출력합니다.
1 ≤ a, b ≤ 500 */

import java.util.Scanner;

public class Ex_063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력:");
        
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        a += 87;
        b %= 10;   

        System.out.println("출력:");
        System.out.println(a);
        System.out.println(b);
    }
}