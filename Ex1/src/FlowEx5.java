import java.util.*;

public class FlowEx5 {
    public static void main(String[] args){
       // 중첩 if 문 연습   
       int score= 0;
       char c = ' ', opt = '0';

       System.out.printf("점수를 입력해 주세요. >");

       Scanner scanner = new Scanner(System.in);
       score = scanner.nextInt();
       System.out.printf("당신의 점수는 %d 입니다. %n", score);

       if (score >= 90) {
            c = 'A';
            if (score >= 98){
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
       } else if (score >= 80) {
            c = 'B';
            if (score >= 89) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
       } else {
            c= 'C';
       }
       System.out.printf("당신의 점수는 %c%c입니당. %n", c, opt);
    }
}
