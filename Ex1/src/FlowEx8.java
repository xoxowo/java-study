import java.util.Scanner;

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

        // 중첩 for 문 연습

        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        int num = 0;

        System.out.print("*을 출력할 라인 수를 입력해주세요. >");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);
        
        for (int i=0; i <num; i++) {
            for (int j=0; j<=i; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
