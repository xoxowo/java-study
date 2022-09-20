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
        System.out.println("-------------------------");

        for (int i=1, j=10; i <=10; i++, j--) {
            System.out.printf("%d \t %d%n", i, j);
        }
        System.out.println("-----------------------------------------------------");

        System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3");
        System.out.println("-----------------------------------------------------");

        for (int i=1; i<=10; i++){
            System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n", i,2*i, 2*i-1,i*i ,11-i, i%3, i/3 );
        }
    }
}
