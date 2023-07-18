/*직사각형의 가로와 세로의 길이를 정수형 값으로 입력받은 후 가로의 길이는 8 증가시키고 세로의 길이는 3배하여 저장한 후 가로의 길이, 세로의 길이, 넓이를 차례로 출력하는 프로그램을 작성해주세요.
첫 번째 줄에 가로와 세로의 길이가 공백을 사이에 두고 주어집니다.
1 ≤ 가로의 길이, 세로의 길이 ≤ 100 
한 줄에 하나씩 가로의 길이, 세로의 길이, 넓이를 출력합니다.*/

import java.util.Scanner;

public class Ex_060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("입력:");
        
        int w, h;
        w = scanner.nextInt();
        h = scanner.nextInt();
        w += 8;  //w = w + 8;
        h *= 3;  //h = h * 8;

        System.out.println("출력:");
        System.out.println(w);
        System.out.println(h);
        System.out.println(w*h);
    }
}