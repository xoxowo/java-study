class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white", "auto", 4);
    } 

    Car(String color) {
        this(color, "auto", 4);
    }
    
    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");

        System.out.println("c1의 차량 color는 "+c1.color+"이며, gearTpye은"+c1.gearType+"고 차량 문은"+c1.door+"개다.");

        System.out.println("c2의 차량 color는 "+c2.color+"이며, gearTpye은"+c2.gearType+"고 차량 문은"+c2.door+"개다.");

    }
}