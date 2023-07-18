/*정수 a에 값 2을 넣고, 정수 b에 값 5를 넣은 뒤, 두 값을 교환하여 a, b를 순서대로 출력하는 프로그램을 작성해보세요.
첫 번째 줄에는 정수 a를 출력합니다. 두 번째 줄에는 정수 b를 출력합니다. */

public class Ex_029 {

	public static void main(String[] args) {
		int a = 2, b = 5;

        int tmp;
        tmp = a;
        a = b;
        b = tmp; 

        System.out.println(a);
        System.out.println(b);

	}

}
