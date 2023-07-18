/*체질량지수는 자신의 몸무게(kg)를 키의 제곱(m)으로 나눈 값입니다.
키와 몸무게를 자연수로 입력받아 첫 번째 줄에 체질량지수를 출력하고, 체질량지수가 25이상이면 비만(Obesity)이라는 메시지를 출력하는 프로그램을 작성해주세요.
키(cm)와 몸무게(kg) 정보가 공백을 사이에 두고 주어집니다. 
1 ≤ 키, 몸무게 ≤ 1,000 
첫째 줄에는 체질량지수를 자연수로 출력합니다. 나머지는 버립니다.
그 체질량지수가 25이상일 경우 Obesity를 출력합니다.*/

import java.util.Scanner;

public class Ex_071 {
	public static void main(String[] args) {		
		System.out.println("키(cm)와 몸무게(kg)을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		int cm, kg, bmi;
		cm = scanner.nextInt();
		kg = scanner.nextInt();
		bmi = (int)(kg / Math.pow(cm * 0.01, 2)); //Math.pow(a, b) - a값을 b만큼 제곱.
		//int bmi = kg * 100 * 100 / (cm * cm);
		
		System.out.printf("%d%n", bmi);
		
		if (bmi >= 25) {
			System.out.println("Obesity");
		}

	}
}   