/*�� ���� ������ �Է¹޾� ū ������ ���� ���� �� ���� ����ϴ� ���α׷��� �ۼ����ּ���.
ù ��° �ٿ� ���� a, b�� ������ ���̿� �ΰ� �־����ϴ�.
1 �� a, b �� 100
ū ������ ���� ���� �� ���� ����մϴ�.*/

import java.util.Scanner;

public class Ex_070 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� ���� ������ �Է��ϼ���.");
		
		int x, y;
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		if (x > y) {
			System.out.printf("%d", x-y);			
		}// if�� ���� ���๮�� �� ���̹Ƿ� ���� ����.
		
		if (x < y)
			System.out.printf("%d", y-x);		

		if (x == y) {
			System.out.printf("%d", x-y);			
		}
	}
}