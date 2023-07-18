import java.util.Scanner;

/*A반의 출석번호 1번은 John, 2번은 Tom, 3번은 Paul입니다. 번호를 입력하면 해당하는 학생의 이름을 출력하는 프로그램을 작성하세요.
첫 번째 줄에 출석번호가 주어집니다.
1 ≤ 출석번호 ≤ 100  
입력받은 출석번호의 해당하는 학생의 이름을 출력하고, 만약 해당 출석번호에 해당하는 학생이 없다면 Vacancy 라고 출력합니다.  */
 
import java.util.Scanner;

public class Ex_082 {
	public static void main(String[] args) {		        
		System.out.println("출석번호를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if (number == 1) {
			System.out.println("John");
		} else if (number == 2) {
			System.out.println("Tom");
		} else if (number == 3) {
			System.out.println("Paul");
		} else {
			System.out.println("Vacancy");
		}		        
	}
}
