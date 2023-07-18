/*1피트(ft)는 30.48cm이고 1마일(mi)은 160934cm입니다.
9.2피트와 1.3마일을 각각 cm로 변환하여 다음 형식에 맞추어 소수 첫째자리까지 반올림하여 출력하는 프로그램을 작성해주세요. */

public class Ex_019 {

	public static void main(String[] args) {
		double a = 280.4, b = 209214.2;

        System.out.printf("9.2ft = %.1fcm%n", a);
        System.out.printf("1.3mi = %.1fcm", b);
      //System.out.printf("%.1fft = %.1fcm\n%.1fmi = %.1fcm", a, a*30.48, b, b*160934);
	}

}
