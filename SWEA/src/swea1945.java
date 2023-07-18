import java.util.*;

public class swea1945 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //테스트 케이스 T 
        for(int i=1; i<=T; i++) { // 입력한 테스트 케이스에 맞춰 T의 값을 1씩 올리며 반복
        	int N = sc.nextInt(); //숫자 N 
        	int a=0, b=0, c=0, d=0, e=0; //초기화
       
	        while(N!=1) { 	//N이 1이 될 때까지 반복 
	        	if(N%2 == 0) {  //N이 2의 배수일 때 N을 2로 나누고 a에 1을 더해준다
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
	        	} //N이 1이 아니라면 탈출하지 못하고 다시 반복
	        } System.out.printf("#%d %d %d %d %d %d\n", i, a, b, c, d, e);
		} 
	}
}