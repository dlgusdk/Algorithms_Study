/*�� ���� ���̰� n�� ���簢���� ���̸� ���ϴ� ���α׷��� �ۼ��غ�����.
��, n�� 5���� �۴ٸ� tiny �� ����մϴ�.
ù ��° �ٿ� �ڿ��� n�� �־����ϴ�.
1 �� n �� 100  
ù ��° �ٿ�, ���簢���� ���̸� ����մϴ�.
n�� 5���� �۴ٸ� �� ��° �ٿ� tiny �� ����մϴ�.*/

import java.util.Scanner;

public class Ex_072 {
	public static void main(String[] args) {		
		System.out.println("�� ���� ���̸� �����ּ���.");
		Scanner scanner = new Scanner(System.in);

		int n;
		n = scanner.nextInt();
		
		System.out.printf("%d%n", n * n);
		
		if (n < 5) {
			System.out.println("tiny");
		}
	}
}
