import java.util.Scanner;

public class ������_2869 {
	public static void main(String[] args) {
		System.out.println("V, A, B");
		Scanner sc = new Scanner(System.in);
		int A= sc.nextInt();
		int B= sc.nextInt();
		int V= sc.nextInt();
		
		System.out.printf("%d", V - (A - B));

		
	}

}