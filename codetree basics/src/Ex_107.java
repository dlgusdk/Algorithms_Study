/*이번 중간고사에는 영어보다 수학이 특별히 더 어려웠습니다. 학생 A와 B가 서로의 점수를 가지고 우선순위를 나누려고 합니다. 영어 점수와 상관없이 수학 점수가 높다면 더 높은 학생의 이름을 출력하고, 만약 수학 점수가 같다면 영어 점수가 더 높은 학생의 이름을 출력하려고 합니다. 두 학생의 수학 점수와 영어 점수가 주어질 때, 위의 조건을 만족하는 학생의 이름을 출력하는 프로그램을 작성해보세요. (단, 수학 점수와 영어 점수가 둘 다 동일하게 주어지는 경우는 없다고 생각해도 좋습니다.)
첫 번째 줄에 A 학생의 수학 점수와 영어 점수가 공백을 사이에 두고 주어집니다.
두 번째 줄에 B 학생의 수학 점수와 영어 점수가 공백을 사이에 두고 주어집니다.
0 ≤ 수학, 영어 점수 ≤ 100  첫 번째 줄에 우선순위가 더 높은 학생의 이름을 출력합니다.*/

import java.util.Scanner;

public class Ex_107 {
	public static void main(String[] args) {
		System.out.println("A와 B의 수학 점수와 영어 점수를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		int Am, Ae, Bm, Be;   //int a_math, a_eng; int b_math, b_eng;
		Am = scanner.nextInt();	
		Ae = scanner.nextInt();	
		Bm = scanner.nextInt();	
		Be = scanner.nextInt();	

		if (Am > Bm) { 
			System.out.println("A");
	    } else if (Am < Bm) {
			System.out.println("B");
		} else if (Am == Bm && Ae > Be) {
			System.out.println("A");
		} else if (Am == Bm && Ae < Be) {
			System.out.println("B");
		} 
     /* if(a_math > b_math || (a_math == b_math && a_eng > b_eng)) {
        System.out.println("A");
        } else {
        System.out.println("B");
        }                               */
	}
}