/*3���� ���� a, b, c�� �Է¹޾��� ��, �߾Ӱ��� ���ϴ� ���α׷��� �ۼ��غ�����.
�߾Ӱ��̶�, ������������ �������� �� �߾ӿ� ���� ���Դϴ�.
ù ��° �ٿ� ���� a, b, c�� ������ �ΰ� �־����ϴ�.
-100 �� a, b, c �� 100 ù ��° �ٿ� a, b, c �� ���� �� �߾Ӱ��� ����մϴ�.
��, �־����� �� ���� a, b, c�� ���� �ٸ��ٰ� �����ص� �����ϴ�.*/

import java.util.Scanner;

public class Ex_114 {
	public static void main(String[] args) {
		System.out.println("�� ���� a, b, c�� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in); 
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a > b) {
			if (b > c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}			
		} else if (a < c) {
			if (b > c) {
				System.out.println(c);
			} else {
				System.out.println(b);
			}
		} else {
			if (b > c) {
				System.out.println(a);
			}
		}
	}
}

