public class FlowEx19 {
}
/*

메모리 구조에 따른 메서드 호출 순서

main()이 firstMethod()를 호출하고 firstMethod()는 secondMethod()를 호출한다.
 ** 객체를 생성하지 않고 메소드를 호출하려면 static 을 붙이면 된다.
 */

class CallStackTest {
    public static void main(String[] args) { // main메서드 호출 1번 실행
        firstMethod(); // 2번 실행
    }
    static void firstMethod() {
        secondMethod(); // 3번 실행
    }
    static void secondMethod() {
        System.out.println("secondMethod()"); // 4번 실행 
    }
}

/*

 */