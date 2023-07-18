/*정수 a, b, c에 차례대로 값 1, 2, 3 을 넣고, 세 정수의 합을 각 정수에 복사한 뒤, a, b, c의 값을 차례로 출력하는 프로그램을 작성해보세요.
결과값 a, b, c를 공백을 사이에 두고 출력합니다. */

public class Ex_033 {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 3;
		int z = a + b + c;
		a = z;
		b = z;
        c = z;
        
		System.out.printf("%d %d %d", a, b, c);

	}

}
