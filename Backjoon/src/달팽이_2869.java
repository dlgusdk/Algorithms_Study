/*import java.util.Scanner;

public class 달팽이_2869 {
	public static void main(String[] args) {
		System.out.println("A, B, V");
		Scanner sc = new Scanner(System.in);
		int A= sc.nextInt();
		int B= sc.nextInt(); 
		int V= sc.nextInt();
		
		int day = (V - B) / (A - B);  //전체높이에 올라가면 떨어지지않으니 B를 뺀 값이 올라가야할 전체 높이가 됨./ 하루에 올라갈 수 있는 높이
        		
		if((V - B) % (A - B) != 0) day++;  // 올라가야할 높이가 남았을 때 하루를 더 추가해 처리.
		   
		System.out.println(day);
		
	}

} -메모리 조건에 걸려서 아웃 */


/*import java.util.Scanner;

public class 달팽이_2869 {
	public static void main(String[] args) {
		System.out.println("A, B, V");
		Scanner sc = new Scanner(System.in);
		int A= sc.nextInt();
		int B= sc.nextInt(); 
		int V= sc.nextInt();
		
		V -= B;
		int day = V / (A - B);  
		
		if(V % (A - B) != 0) {
			day++;  
	    }
		System.out.println(day);
		
	}
} 위와 똑같은 이유*/

import java.io.BufferedReader;   
import java.io.IOException;    
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 달팽이_2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //객체생성
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int day = (V - B) / (A - B);  
		
		if((V - B) % (A - B) != 0) day++;  
		   
		System.out.println(day);	
	}
}
  