class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1(); // 1번 방법 상속 
        
        Runnable r = new ThreadEx1_2(); // 2번 방법 runnable 인터페이스 구현
        Thread t2 = new Thread(r); // 생성자 Thread(Runnable target)
        //  Thread t2 = new Thread(ThreadEx1_2()); 위 두 문장을 한줄로 

        t1.start(); // 스레드는 start()로 실행할 수 있다.
        t2.start();
    }
}

class ThreadEx1_1 extends Thread {
    public void run() {
        for (int i = 0; i <5; i++) {
            System.out.println(getName()); // 조상인 Thread의 getName()을 호출
        }
    }
}

class ThreadEx1_2 implements Runnable {
    public void run() {
        for (int i = 0; i <5; i++) {
            //Thread.currentThread() 현재 실행중인 Thread를 반환
            System.out.println(Thread.currentThread().getName());
        }	
    }
}

/* 실행 결과
Thread-0
Thread-0
Thread-0
Thread-0
Thread-0
Thread-1
Thread-1
Thread-1
Thread-1
Thread-1
 */