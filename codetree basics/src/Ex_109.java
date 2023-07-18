/*성별에 대해 남자는 숫자 0, 여자는 숫자 1로 나타내기로 하고, 19세 이상을 성인이라고 합시다.
성별(숫자 0 또는 1)과 나이를 입력받아 MAN(성인남자), WOMAN(성인여자), BOY(미성년남자), GIRL(미성년여자)을 구분하여 출력하는 프로그램을 작성해주세요.
첫 번째 줄에 성별에 해당하는 숫자가 주어지고,
두 번째 줄에는 나이가 자연수로 주어집니다.
1 ≤ 나이 ≤ 100 
나이와 성별에 해당하는 문자를 출력합니다.*/

import java.util.Scanner;

public class Ex_109 {
	public static void main(String[] args) {
		System.out.println("나이와 성별을 입력해주세요");
		Scanner sc = new Scanner(System.in); //sc == scanner
        
		int gender, age;
		gender = sc.nextInt();
        age = sc.nextInt();
        
        if (gender == 1) {
           if (age < 19) {
        	   System.out.println("GIRL");
           } else {
        	   System.out.println("WOMAN");
           }           
        } else {
           	if (age < 19) {
           		System.out.println("BOY");
            } else {
         	   System.out.println("MAN");           
           	}
        }
    }
}