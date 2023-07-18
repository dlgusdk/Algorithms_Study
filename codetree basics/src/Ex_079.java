/*물의 온도를 정수로 입력받아 0℃ 미만일경우엔 ice, 100℃ 이상일때는vapor, 그 사이일때는 water 라고 출력하는 프로그램을 작성해주세요.
첫 번째 줄에는 물의 온도인 정수 n이 주어집니다.
-200 ≤ n ≤ 200  
물의 온도에 따른 현재 상태를 문자열로 출력해주세요. */
 
import java.util.Scanner;

public class Ex_079 {
	public static void main(String[] args) {		        
		System.out.println("물의 온도를 입력해 주세요.");
		Scanner scanner = new Scanner(System.in);
		int temp = scanner.nextInt();
		
		if (temp < 0) {
			System.out.println("ice");
		} else if (temp >= 100) {
			System.out.println("vapor");
		} else {
			System.out.println("water");
		}		        
	}
}