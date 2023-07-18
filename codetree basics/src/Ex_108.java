/*두 사람에 대한 정보로 나이와 성별이 주어집니다. 두 사람 중 한 사람이라도 19세이상이면서 남자라면 1을 출력하는 프로그램을 작성해보세요.
첫 번째 줄에 첫 번째 사람의 정보로 나이와 성별이 공백을 두고 주어집니다.
두 번째 줄에 두 번째 사람의 정보로 나이와 성별이 공백을 두고 주어집니다.
각 정보는, 나이는 정수로 주어지고 성별은 남자라면 M 여자라면 W 가 주어집니다.
1 ≤ 나이 ≤ 100 
첫 번째 줄에 두 사람 중 한 사람이라도 19세이상이면서 남자라면 1을 출력합니다.
문제의 조건에 해당하지 않는다면 0을 출력합니다.*/

import java.util.Scanner;

public class Ex_108 {
	public static void main(String[] args) {
		System.out.println("A와 B의 나이와 성별(W, M)을 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		
		int A_age = scanner.nextInt();	
		String A_gender = scanner.next().toString(); //String 변환  - String 변수명 = scanner.next().toString();
		int B_age = scanner.nextInt();	
		String B_gender = scanner.next().toString();
     
	/*	int a_age, b_age;
        char a_gen, b_gen;
        a_age = sc.nextInt();
        a_gen = sc.next().charAt(0);
        b_age = sc.nextInt();
        b_gen = sc.next().charAt(0);   //char 변환으로 할 때는 equals 사용 x*/
		
		if ((A_age >= 19 && A_gender.equals("M")) || (B_age >= 19 && B_gender.equalsIgnoreCase("M"))) { //문자열을 비교할 때는 변수명.equals("내용") 사용. equalsIgnoreCase()는 대소문자 구분안하고 비교할 때 사용. 
			System.out.println("1");
	    } else {
			System.out.println("0");
		}
	}
}  