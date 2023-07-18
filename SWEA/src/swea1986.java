import java.util.*;

public class swea1986 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) { //테스트 케이스 설정
			int N = sc.nextInt(); 
			int sum = 0; //각 테이트 케이스의 sum값 초기화
			
			for(int j=1; j<=N; j++) { //숫자 N 설정 1 ~ N까지 1씩 상승하며 반복
				if(j%2 == 0) {
					sum = -(N/2); //짝수일 때 결과값
			    } else if(j%2 == 1) {
					sum = (N/2) + 1; //홀수일 때 결과값
			    }	
			} System.out.printf("#%d %d\n", i, sum);	
		}					
	} 		
}
