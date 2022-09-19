public class FlowEx3 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int x = 0; 
        char ch = ' ';
        // 선언한 변수에 값 넣기 
        x = 15; // || = or 결합 && = and 결합 
        System.out.printf("x=%d, 10 < x && x < 20 = %b%n", x, 10 < x && x <20);

        x = 6;
        System.out.printf("x=%d, x%%2==0 || x%%3==0 && x%%6!=0 = %b%n", x, x%2==0 || x%3==0 && x%6!=0);

        System.out.printf("x=%d, (x%%2==0 || x%%3==0) && x%%6!=0 = %b%n", x, (x%2==0 || x%3==0) && x%6!=0);

        ch = '1';
        System.out.printf("ch ='%c', '0' <= ch && ch <='9' = %b%n", ch, '0' <=ch && ch <='9');
        System.out.println("ch=1이면 ch는 0보다 크거나 같고 9보다 작거나 같다");

        ch = 'a';
        System.out.printf("ch ='%c', 'a' <= ch && ch <='z' = %b%n", ch, 'a' <=ch && ch <='z');

        ch = 'A';
        System.out.printf("ch ='%c', 'A' <= ch && ch <='Z' = %b%n", ch, 'A' <=ch && ch <='Z');

        ch = 'q';
        System.out.printf("ch ='%c', ch=='q' || ch =='Q' = %b%n", ch, ch=='q' || ch =='Q');
        System.out.println("ch='q'는 소문자 'q' 또는 대문자 'Q'와 같다");
    }
}
