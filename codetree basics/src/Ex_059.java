/*두 정수 a, b를 입력받아 다음 값들을 전부 계산해서 출력하는 프로그램을 작성해보세요.
두 정수를 더했을 때의 결과
a에서 b를 뺐을 때의 결과
a를 b로 나누었을 때의 몫
a를 b로 나누었을 때의 나머지
첫 번째 줄에 정수 a, b가 공백을 사이에 두고 주어집니다.
첫 번째 줄에는 두 정수를 더했을 때의 결과,
두 번째 줄에는 a에서 b를 뺐을 때의 결과,
세 번째 줄에는 a를 b로 나누었을 때의 몫,
네 번째 줄에는 a를 b로 나누었을 때의 나머지를 출력합니다.
1 ≤ a, b ≤ 100 */

import java.util.Scanner;

public class Ex_059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력:");
        
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        
        System.out.println("출력:");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}