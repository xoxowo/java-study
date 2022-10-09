
public class FlowEx18 {
}
/*
기본형 매개변수와 참조형 매개변수

기본형 매개변수 변수의 값을 읽기만 할 수 있다. 
참조형 매개변수 변수의 값을 읽고 변경 할 수 있다.
 */

class Data {int x;}

class PrimitiveParamEx {
    public static void main(String[] args) { // 메인 메서드 
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x); // 1번

        change(d.x); // -> 매서드 호출
        System.out.println("After change(d.x)"); // 3번
        System.out.println("main() : x = " + d.x); // 4번
    }

    static void change(int x) { // 기본형 매개변수 (only read)
        x = 1000; //  x 변수는 지역변수 
        System.out.println("change() : x = " + x); // 2번
    }
}

/* 실행 결과값

main() : x = 10
change() : x = 1000
After change(d.x)
main() : x = 10

 */
