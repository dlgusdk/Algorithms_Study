/*������ �Է¹޾� �������, ����� �� �ߴٸ� �� ���� �� �ʿ����� ����ϴ� ���α׷��� �ۼ����ּ���.
ù ��° �ٿ��� ���� n�� �־����ϴ�.
0 �� n �� 100
�Է¹��� ������ 80 �̻��̸� pass��� ����ϰ�, �׷��� �ʴٸ� �� ���� �� �־�� ����Ǵ����� "�� more score"��� �޽����� ����մϴ�.  */

import java.util.Scanner;

public class Ex_073 {
	public static void main(String[] args) {		        
		System.out.println("������ �Է��� �ּ���.");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if (score >= 80) {
			System.out.println("pass");
		} else {
			System.out.printf("%d more score", 80 - score);
		}
	}
}