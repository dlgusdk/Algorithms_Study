/*양쪽 눈 시력의 평균값을 실수(real number)로 입력받아 1.0 이상이면 High, 0.5 이상이면 Middle, 아니면 Low라고 출력하는 프로그램을 작성해주세요.
첫 번째 줄에 실수 a가 주어집니다.
0 ≤ a ≤ 5  
출력값에 해당하는 문자열을 출력합니다.*/
 
import java.util.Scanner;

public class Ex_080 {
	public static void main(String[] args) {		        
		System.out.println("양쪽 눈 시력의 평균값을 적어주세요.");
		Scanner scanner = new Scanner(System.in);
		double sight = scanner.nextDouble();
		
		if (sight >= 1.0) {
			System.out.println("High");
		} else if (sight >= 0.5) {
			System.out.println("Middle");
		} else {
			System.out.println("Low");
		}		        
	}
}