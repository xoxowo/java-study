import org.w3c.dom.ranges.Range;

public class FlowEx8 {
    public static void main(String[] args) {
        /* for 문 연습 
        for (초기화; 조건식; 증감식) {
            수행될 문장
        }
         */
        for (int i=1; i<=5; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------------");
        int sum = 0;

        for (int i=1; i <=10; i++) {
            sum += i ;                          // %n은 줄바꿈..
            System.out.printf("1부터 %2d 까지의 합은 :%2d%n", i,sum);
        }
    }
}
