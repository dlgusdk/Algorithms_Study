/*ü���������� �ڽ��� ������(kg)�� Ű�� ����(m)���� ���� ���Դϴ�.
Ű�� �����Ը� �ڿ����� �Է¹޾� ù ��° �ٿ� ü���������� ����ϰ�, ü���������� 25�̻��̸� ��(Obesity)�̶�� �޽����� ����ϴ� ���α׷��� �ۼ����ּ���.
Ű(cm)�� ������(kg) ������ ������ ���̿� �ΰ� �־����ϴ�. 
1 �� Ű, ������ �� 1,000 
ù° �ٿ��� ü���������� �ڿ����� ����մϴ�. �������� �����ϴ�.
�� ü���������� 25�̻��� ��� Obesity�� ����մϴ�.*/

import java.util.Scanner;

public class Ex_071 {
	public static void main(String[] args) {		
		System.out.println("Ű(cm)�� ������(kg)�� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		
		int cm, kg, bmi;
		cm = scanner.nextInt();
		kg = scanner.nextInt();
		bmi = (int)(kg / Math.pow(cm * 0.01, 2)); //Math.pow(a, b) - a���� b��ŭ ����.
		//int bmi = kg * 100 * 100 / (cm * cm);
		
		System.out.printf("%d%n", bmi);
		
		if (bmi >= 25) {
			System.out.println("Obesity");
		}

	}
}   