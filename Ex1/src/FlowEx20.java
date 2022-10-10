public class FlowEx20 {
    
}
/*
 기본형 매개변수와 참조형 매개변수에 따른 
 메모리 구조에 따른 메서드 호출 순서와 메서드 실행 결과 값
 */
class Data {int x;}

class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x " +d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }
    static void change(Data d) {
        d.x=1000;
        System.out.println("change() : x = " +d.x);
    }
}

/*  실행 결과값 

main() : x 10
change() : x = 1000
After change(d)
main() : x = 1000

 */

 /* FlowEx18.java 실행 결과값

main() : x = 10
change() : x = 1000
After change(d.x)
main() : x = 10

 */