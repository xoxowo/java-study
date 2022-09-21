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

    }
}