class Car {
    String color;
    String gearType;
    int door;

    Car() {} // 매개변수가 없는 생성자
             // 생성자도 메소드이기 때문에 한 클래스안에 오버로딩이 가능하다.
             // 오버로딩은 메소드 이름은 같으나 매개변수 타입과 개수가 다른 메소드를 의미한다?

    Car(String c, String g, int d) { // 매개변수가 있는 생성자
        color = c;
        gearType = g;
        door = d;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(); // 연산자 new에 의해 인스터스가 생성되는 것을 기억하자.
        c1.color = "black";
        c1.gearType = "auto";
        c1.door = 2;

        Car c2 = new Car("white", "auto", 2);
        System.out.println("c1의 차량 color는 "+c1.color+"이며, gearTpye은"+c1.gearType+"고 차량 문은"+c1.door+"개다.");

        System.out.println("c2의 차량 color는 "+c2.color+"이며, gearTpye은"+c2.gearType+"고 차량 문은"+c2.door+"개다.");
    }
}


//didhd
