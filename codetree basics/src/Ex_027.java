/*변수 a에 3를 넣고, 변수 b에 4를 넣은 뒤, 다시 a의 값을 b에 넣어줍니다. 그 후, a와 b의 값을 곱한 결과값을 출력합니다.
첫 번째 줄에 계산이 끝난 뒤의 a값과 b값을 공백을 두고 출력합니다.
두 번째 줄에 a와 b를 곱한 값을 출력합니다.*/

public class Ex_027 {

	public static void main(String[] args) {
		int a = 3, b = 4;
        b = a;

        System.out.printf("%d %d%n", a, b); //System.out.println(a + " " + b);
        System.out.printf("%d", a*b);

	}

}
