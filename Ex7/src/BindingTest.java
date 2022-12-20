// class BindingTest {
//     public static void main(String[] args) {
//         Parent p = new Child(); // 인스턴스화  
//         Child c = new Child(); // 인스턴스화 

//         System.out.println("p.x = "+ p.x);
//         System.out.print("p.method() = ");
//         p.method(); // 메서드는 오버라이딩 되기 때문에 child의 메서드가 호출된다.?

//         System.out.println("c.x = "+ c.x);
//         System.out.print("c.method() = ");
//         c.method();
//     }
// }

// class Parent {
//     int x = 100;
//     void method() {
//         System.out.println("Parent method");
//     }
// }

// class Child extends Parent {
//     int x = 200;
//     void method() {
//         System.out.println("Child method");
//     }
// }


/* 실행 결과

p.x = 100
p.method() = Child method
c.x = 200
c.method() = Child method

 */