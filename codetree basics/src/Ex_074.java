/*���� a�� �Է¹޾��� ��, a�� 113 �̻��� ��쿣 1�� ����ϰ�, �� ���� ��쿣 0�� ����ϴ� ���α׷��� �ۼ��غ�����.
ù ��° �ٿ� ���� a�� �־����ϴ�.
-1,000 �� a �� 1,000  
ù ��° �ٿ��� a�� ���� ����� ���� ����մϴ� */

import java.util.Scanner;

public class Ex_074 {
	public static void main(String[] args) {		        
		System.out.println("���ڸ� �Է��� �ּ���.");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		if (a >= 113) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}