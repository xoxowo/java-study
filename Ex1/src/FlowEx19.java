public class FlowEx19 {
}
/*
main()이 firstMethod()를 호출하고 firstMethod()는 secondMethod()를 호출한다.
 ** 객체를 생성하지 않고 메소드를 호출하려면 static 을 붙이면 된다.
 */

class CallStackTest {
    public static void main(String[] args) {
        firstMethod();
    }
    static void firstMethod() {
        secondMethod();
    }
    static void secondMethod() {
        System.out.println("secondMethod()");
    }
}