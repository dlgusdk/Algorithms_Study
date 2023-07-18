/*정수 a, b, c에 각각 값 1, 2, 3을 넣고 c의 값을 a, b에 복사한 뒤, a, b, c 의 값을 차례로 출력하는 프로그램을 작성해보세요.
 결과값 a, b, c를 공백을 사이에 두고 출력합니다.*/

public class Ex_031 {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 3;
	    a = c;
	    b = c;
	    
	    System.out.printf("%d %d %d", a, b, c);

	}

}
