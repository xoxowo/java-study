public class FlowEx20 {
}
/*
 기본형 매개변수와 참조형 매개변수에 따른 
 메모리 구조에 따른 메서드 호출 순서와 메서드 실행 결과 값
 */
class Data {int x;}

class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data(); // 인스턴스 선언 및 생성
        d.x = 10; //인스턴스 값 변경 
        System.out.println("main() : x = " +d.x); //1번 실행 -> main() : x = 10

        change(d); // change 매서드에 d값 넣어 사용 
        System.out.println("After change(d)"); // 3번 실행
        System.out.println("main() : x = " + d.x); // 4번 실행 -> main() : x = 1000
    }
    static void change(Data d) {
        d.x=1000; // 참조형 매개변수
        System.out.println("change() : x = " +d.x); // 2번 실행 -> change() : x = 1000
    }
}

/*  실행 결과값 
 
1번 main() : x = 10
2번 change() : x = 1000
3번 After change(d)
4번 main() : x = 1000

 */

 /* FlowEx18.java 실행 결과값

main() : x = 10
change() : x = 1000
After change(d.x)
main() : x = 10

 */