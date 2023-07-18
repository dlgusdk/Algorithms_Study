/*정수 a를 입력받아 다음 2개의 과정을 순서대로 거친 이후의 결과를 출력하는 프로그램을 작성해주세요.
만약 a가 짝수라면 2로 나눠줍니다.
만약 a가 홀수라면 1을 더한 뒤 2로 나눠줍니다.
예를 들어 a가 10이었다면 1번 과정을 거쳐 5가 되고, 연달아 2번 과정을 거쳐 3이 됩니다. 하지만 a가 8이었다면 1번 과정을 거쳐 4가 되지만, 연달아 2번 과정을 거쳤을 때에는 조건을 만족하지 않으므로 변화없이 최종 결과는 4가 됩니다.
첫 번째 줄에 정수 a가 주어집니다.
1 ≤ a ≤ 100  
최종 결과를 출력합니다. 단, 최종 결과를 소수점이 없는 정수 형태로 출력합니다.  */
 
import java.util.Scanner;

public class Ex_086 {
	public static void main(String[] args) {
		System.out.println("정수 a를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		if (a % 2 == 0) { //if if조건문은 둘 다 참일 때 둘 다 실행. 하나만 참이면 참인 if문 실행 후 거짓인 if문은 실행 x
			a /= 2;  //다음 if문까지 실행해줘야하므로 출력하지않도록 주의.
		}
		
		if (a % 2 == 1) {
			a = (a + 1) / 2;
		}
		System.out.println(a);  
	}
}