class ThreadEx2 {
    public static void main(String[] args) throws Exception {
        ThreadEx2_1 t1 = new ThreadEx2_1(); // Thread class 상속
        t1.start(); // 쓰레드 실행
    }
}
class ThreadEx2_1 extends Thread {
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
        at ThreadEx2_1.throwException(ThreadEx2.java:13)
        at ThreadEx2_1.run(ThreadEx2.java:9)
 */