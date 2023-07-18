/*2개의 정수 a, b를 입력받아 b를 a에 더한 후, 다시 a를 b에 더한 뒤의 결과를 출력하는 프로그램을 작성해보세요.
예를 들어 a = 1, b = 3이었다면 b를 a에 더하게 되어 a = 4, b = 3 이 되고
그 이후 a를 b에 더하게 되어 a = 4, b = 7이 됩니다.
첫 번째 줄에 정수 a, b가 공백을 사이에 두고 주어집니다.
첫 번째 줄에 더하는 것을 진행한 이후 a, b에 들어있는 값을 각각 공백을 사이에 두고 출력합니다.
1 ≤ a, b ≤ 1,000*/

import java.util.Scanner;

public class Ex_064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력:");
        
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        a += b;
        b += a;

        System.out.println("출력:");
        System.out.printf("%d %d", a, b);
        
    }
}