/*�� ���� ���� a, b�� �Է¹޾� a�� b���� ũ�ٸ� �� ���� ���� ����ϰ�, �׷��� �ʴٸ� b�� a�� ���� ���� ����ϴ� ���α׷��� �ۼ��غ�����.
ù ��° �ٿ� �� ���� a, b�� ������ �ΰ� �־����ϴ�.
1 �� a, b �� 100
ù ��° �ٿ� ũ�� �� ����� ����, a�� b���� ũ�ٸ� �� ���� ����, �׷��� �ʴٸ� b�� a�� ���� ���� ����մϴ�.*/

import java.util.Scanner;

public class Ex_075 {
	public static void main(String[] args) {		        
		System.out.println("�� ������ �Է��� �ּ���.");
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if (a > b) {
			System.out.printf("%d", a * b);
		} else {
			System.out.printf("%d", b / a);
		}
	}
}