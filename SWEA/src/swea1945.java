import java.util.*;

public class swea1945 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //�׽�Ʈ ���̽� T 
        for(int i=1; i<=T; i++) { // �Է��� �׽�Ʈ ���̽��� ���� T�� ���� 1�� �ø��� �ݺ�
        	int N = sc.nextInt(); //���� N 
        	int a=0, b=0, c=0, d=0, e=0; //�ʱ�ȭ
       
	        while(N!=1) { 	//N�� 1�� �� ������ �ݺ� 
	        	if(N%2 == 0) {  //N�� 2�� ����� �� N�� 2�� ������ a�� 1�� �����ش�
	        		a++;
	        		N = N/2;
	        	} else if(N%3 == 0) {
	        		b++;
	        		N = N/3;
	        	} else if(N%5 == 0) {
	        		c++;
	        		N = N/5;
	        	} else if(N%7 == 0) {
	        		d++;
	        		N = N/7;
	        	} else if(N%11 == 0) {
	        		e++;
	        		N = N/11; 
	        	} //N�� 1�� �ƴ϶�� Ż������ ���ϰ� �ٽ� �ݺ�
	        } System.out.printf("#%d %d %d %d %d %d\n", i, a, b, c, d, e);
		} 
	}
}