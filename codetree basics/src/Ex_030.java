/*세 정수 a, b, c 에 차례대로 5, 6, 7을 넣고, b에는 a값을 , c에는 b값을, a에는 c값을 넣어 출력하는 프로그램을 작성해보세요.
첫 번째 줄에는 정수 a를 출력합니다.
두 번째 줄에는 정수 b를 출력합니다.
세 번째 줄에는 정수 c을 출력합니다.*/

public class Ex_030 {

	public static void main(String[] args) {
		int a = 5, b = 6, c= 7;

        int tmp;
        tmp = b;
        b = a;
        a = c;
        c = tmp; 
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

	}

}
