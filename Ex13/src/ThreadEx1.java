class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1(); // 1번 방법
        
        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    
    }
}

class ThreadEx1_1 extends Thread {
    public void run() {
        for (int i = 0; i <5; i++) {
            System.out.println(getName());
        }
    }
}

class ThreadEx1_2 implements Runnable {
    public void run() {
        for (int i = 0; i <5; i++) {
            //Thread.currentThread()
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