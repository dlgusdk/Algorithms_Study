/*���� a�� 3�� ������ YES��, �ƴ϶�� NO�� ����ϰ�, �� 5�� ������ YES��, �ƴ϶�� NO ����ϴ� ���α׷��� �ۼ��غ�����.
ù ��° �ٿ� ���� a�� �־����ϴ�.
1 �� a �� 100
ù ��° �ٿ� ���� a�� 3�� ������ YES��, �ƴ϶�� NO�� ����մϴ�.
�� ��° �ٿ� ���� a�� 5�� ������ YES��, �ƴ϶�� NO ����մϴ�.*/

import java.util.Scanner;

public class Ex_091 {
	public static void main(String[] args) {
		System.out.println("���� a, b�� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();	
		
		if(a % 3 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		if(a % 5 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}