/*yyyy.mm.dd 모양의 날짜 정보를 입력받아 mm-dd-yyyy 형식으로 출력하는 프로그램을 작성해보세요.
첫 번째 줄에 날짜 정보가 yyyy.mm.dd 형태로 주어집니다. yyyy는 연도를, mm은 월을, dd는 일을 의미합니다.
1 ≤ yyyy ≤ 2021
1 ≤ mm ≤ 12
1 ≤ dd ≤ 28
입력받은 날짜를 mm-dd-yyyy 형식으로 바꾸어 출력합니다. */

import java.util.Scanner;

public class Ex_057 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력:");
		
		scanner.useDelimiter("\\."); 
		//useDelimiter 안의 값은 정규 표현식을 쓰는데, 정규 표현식에서 "."은 '모든 단어' 와 같은 의미를 가지고 있어 오류가 발생
		//정규 표현식에서는 ".", "^", "$", "*" 와 같은 문자는 다른 뜻을 가지고 있다. 이런 문자로 나눌 때에는 "." 대신 "\\."으로, "^" 대신 "\\^" 으로 적어야 제대로 나눠짐
		int m, d, y;
		y = scanner.nextInt();
		m = scanner.nextInt();
		d = scanner.nextInt();
		
		System.out.println("출력:");
		System.out.printf("%d-%d-%d", m, d, y);
		//System.out.println(m + "-" + d + "-" + y);
	}

}
