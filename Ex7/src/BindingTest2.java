public class BindingTest2 {
    public static void main(String[] args) {
        Parent p = new Childd();
        Childd c = new Childd();

        System.out.println("p.x = " +p.x);
        p.method();
        System.out.println("c.x = "+c.x);
        c.method();
    }    
}

class Parent {
    int x = 100;
    void method () {
        System.out.println("Parent Method");
    }
}

class Childd extends Parent {}

/* 실행 결과
p.x = 100
Parent Method
c.x = 100    
Parent Method
 */