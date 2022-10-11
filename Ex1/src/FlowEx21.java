public class FlowEx21 {   
}

/*
main 메서드가 실행되면 위에서 아래로 차례대로 코드가 수행된다.
코드 내부의 메서드가 실행되면 내부 코드를 실행하고 다시 원래 코드로 돌아가 실행된다.
순서대로~ 
 */

class CallStackTest2{
    public static void main(String[] args) {
        System.out.println("main(String[] args)이 시작되었음."); // 1번
        firstMethod(); // 이동~
        System.out.println("main(String[] args)이 끝났음."); // 6번
    }

    static void firstMethod() { // 메소드 선언 시 stacit을 선언하면 객체를 생성하지 않고도 메서드를 호출할 수 있다.
        System.out.println("firstMethod()이 시작되었음"); // 2번
        secondMethod(); // 이동 ~
        System.out.println("firstMethod()가 끝났음."); // 5번 firstMethod가 끝나서 다시 main 메서드로 이동
    }
    static void secondMethod() {
        System.out.println("secondMethod()이 시작되었음"); // 3번
        System.out.println("secondMethod()가 끝났음."); // 4번이 끝났기 때문에 다시 firstMethod로 이동
    }
}

/* 실행 결과값

main(String[] args)이 시작되었음.
firstMethod()이 시작되었음
secondMethod()이 시작되었음
secondMethod()가 끝났음.
firstMethod()가 끝났음.
main(String[] args)이 끝났음.

 */