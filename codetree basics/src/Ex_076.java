/*���� 2���� �Է¹޾� �� ���� �ִ��� ����ϴ� ���α׷��� �ۼ��غ�����.
ù ��° �ٿ� ���� a, b�� ������ ���̿� �ΰ� �־����ϴ�.
1 �� a, b �� 100 
ù ��° �ٿ� �ִ��� ����մϴ�.*/

import java.util.Scanner;

public class Ex_076 {
	public static void main(String[] args) {		        
		System.out.println("�� ������ �Է��� �ּ���.");
		Scanner scanner = new Scanner(System.in);
		
		int a, b, result;
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		result = (a > b) ? a : b ;
		
		System.out.println(result);
	}
}   