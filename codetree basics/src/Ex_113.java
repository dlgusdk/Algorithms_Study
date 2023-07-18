/*감기 증상이 있으면 Y, 감기 증상이 없으면 N으로 나타내기로 하고, 체온을 쟀을 때 수치에 따라 진료소를 다르게 구분하려고 합니다.
증상도 있고 37℃ 이상일 때 A
증상은 없지만 37℃ 이상일 때 B
증상은 있지만 체온은 정상일 때 C
둘 다 괜찮은 경우엔 D
한 번에 3명씩 검사하는데 A로 가는 사람이 2명 이상 나올때는 위급상황으로 분류합니다. 위급상황인지를 판단하는 프로그램을 작성해보세요. 
첫 번째 줄부터 3개의 줄에 걸쳐, 1줄에 1명씩 총 3명의 감기 증상과 체온이 공백을 사이에 두고 주어집니다. 감기 증상은 항상 Y 또는 N으로 주어진다 가정해도 좋습니다.
위급상황이라면 E를, 그렇지 않다면 N을 출력합니다.
0 ≤ 주어지는 체온 ≤ 40 */

import java.util.Scanner;

public class Ex_113 {
	public static void main(String[] args) {
		System.out.println("감기증상과 체온을 적어주세요.");
		Scanner sc = new Scanner(System.in); 

		char sym1 = sc.next().charAt(0);
		int tem1 = sc.nextInt();
		char sym2 = sc.next().charAt(0);
		int tem2 = sc.nextInt();
		char sym3 = sc.next().charAt(0);
		int tem3 = sc.nextInt();


		if(sym1 == 'Y' && tem1 >= 37) { //3명 중 sym1이 확정이라고 가정
			if(sym2 == 'Y' && tem2 >= 37 || sym3 == 'Y' && tem3 >= 37 ) {
				System.out.println("E");
			} else {
				System.out.println("N");
			}
		} else { //sym1은 온도와 증상 모두 없으므로 남은 사람 둘 다 코로나여야만 E.
			if((sym2 == 'Y' && tem2 >= 37) && (sym3 == 'Y' && tem3 >= 37)) {
				System.out.println("E");
			}else {
				System.out.println("N");
			}
		}
	}
}