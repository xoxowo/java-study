class ThreadEx3 {
    public static void main(String[] args) throws Exception {
        ThreadEx3_1 t1 = new ThreadEx3_1(); // Thread class 상속
        t1.run(); // ThreadEx3_1 클레스의 run() 메서드 실행
    }   // 쓰레드가 실행된게 아님
}
class ThreadEx3_1 extends Thread {
    public void run() {
        throwException();
    }
    public void throwException() {
        try {
            throw new Exception();
        } catch (Exception e){
            e.printStackTrace(); //printStackTrace 예외가 발생한 호출 스택 출력 
        }
    } 
}

/* 실행 결과
java.lang.Exception
        at ThreadEx3_1.throwException(ThreadEx3.java:13)
        at ThreadEx3_1.run(ThreadEx3.java:9)
        at ThreadEx3.main(ThreadEx3.java:4) 
 */