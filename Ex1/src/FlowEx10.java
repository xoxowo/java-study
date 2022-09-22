import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args){
        /*
         while 문은 조건식을 생략할 수 없다.
         while 문 (조건식) {
            조건식의 연산결과가 (true)인 동안, 반복될 문장
         }
         */
        int i = 0;

        while (i<10) {
            i++;
            System.out.printf("i는 %d다.\n", i);
        }
        // j를 1씩 증가시켜 sum에 계속 더함
        int j = 0;
        int sum = 0;
        while ((sum += ++j) <=100) {
            System.out.printf("%d - %d%n",j, sum);
        }
        /*
        do while 기존 while 문과 비슷
        do {
            //조건식의 연산 결과가 참일 때 수행될 문장
        } while (조건식);
         */

        int input = 0 , answer =0;

        answer = (int)(Math.random()*100) +1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1과 100사이의 정수를 입력하세요. >");
            input = scanner.nextInt();
            
            if (input > answer) {
                System.out.println("조건을 만족하지 않습니다. 다시 입력해주세요.");
            } else if (input <answer) {
                System.out.println("조건을 만족하지 않습니다. 다시 입력해주세요.");
            }
        } while (input!=answer);
        System.out.println("정답입니다.");
    }
}