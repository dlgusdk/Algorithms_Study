/*
 
 */
import java.util.Scanner;

public class Ex_115 {
	public static void main(String[] args) {
		System.out.println("���� n�� ���� �Է����ּ���");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();	

		if ((n % 2 != 0 && n % 3 == 0) || (n % 2 == 0 && n % 5 == 0)) { //�������ڸ� ���� �� ������ ()�� ��������Ѵ�. &&�� ||���� �켱������ �� ���� ������ �Ұ�ȣ�� �켱������ �����ش�.
			System.out.println("true");
	    } else {
			System.out.println("false");
		}
	}
}