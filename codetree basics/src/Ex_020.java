/*변수 a, b 에 각각 5.26, 8.27 을 넣어주고, 두 수의 곱을 소수점 셋째 자리까지만 출력하는 프로그램을 작성하세요.
첫 번째 줄에 결괏값을 소수점 셋째 자리까지만 출력합니다. */

public class Ex_020 {

	public static void main(String[] args) {
		double a = 5.26, b = 8.27;

		System.out.printf("%.3f", a*b);  

	}

}
