import java.util.*;

public class swea1986 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) { //�׽�Ʈ ���̽� ����
			int N = sc.nextInt(); 
			int sum = 0; //�� ����Ʈ ���̽��� sum�� �ʱ�ȭ
			
			for(int j=1; j<=N; j++) { //���� N ���� 1 ~ N���� 1�� ����ϸ� �ݺ�
				if(j%2 == 0) {
					sum = -(N/2); //¦���� �� �����
			    } else if(j%2 == 1) {
					sum = (N/2) + 1; //Ȧ���� �� �����
			    }	
			} System.out.printf("#%d %d\n", i, sum);	
		}					
	} 		
}
