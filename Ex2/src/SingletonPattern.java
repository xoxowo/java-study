/*
면접을 위한 cs 전공 지식 노트 예제
1. singleton pattern 
    하나의 클래스의 하나의 인스턴스를 가지는 패턴
    사용하기 쉽고 굉장히 실용적이지만, 결합이 강하기 때문에 의존성 주입을 통해 연결을 느슨하게 만들 수 있다.
    하나의 인스턴스만 가지기 떄문에 TDD (test)가 어렵다.
    대표적인 싱글톤 패턴의 예시는 데이터베이스 연결 모듈이 있다.
*/

class Singleton {
    private static class singleInstanceHolder {
        private static final Singleton INSTANCE = new Singleton(); // 인스턴스 선언 및 생성
    }
    public static synchronized Singleton getInstance() {
        return singleInstanceHolder.INSTANCE;
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        if (a==b) {
            System.out.println(true);
        }
    }
}

/* 실행 결과값

2124308362
2124308362
true

*/