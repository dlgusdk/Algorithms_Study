/*������ �Է¹޾� ����ϰ� ������ �����ϴ� ���α׷��� �ۼ��غ�����.
 ù ��° �ٿ��� ���� n�� �־����ϴ�.
-100 �� n �� 100
ù°�ٿ��� �Է¹��� ������ ����մϴ�.
�� ������ ������ ��쿡�� �ι�°�ٿ� minus�� ����մϴ�.*/

import java.util.Scanner;

public class Ex_069 {
	public static void main(String[] args) {
		System.out.println("���ڸ� �ϳ� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);		
		int x = scanner.nextInt();
		//String input = scanner.nextLine();
		//int x = Integer.parseInt(input);
		System.out.println(x);
		
		if(x < 0) {
			System.out.printf("%s", "minus");
		}
	}
}  
