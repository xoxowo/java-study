/*
면접을 위한 cs 전공 지식 노트 예제
2. Factory pattern 
    상위 클래스인 객체 생성 부분을 추상화하고, 하위 클래스에서 객체 생성에 대한 구체적인 내용을 결정하는 패턴이다.
    상위 클래스와 하위 클래스가 분리되어 많은 유연성을 갖게되고, 유지 보수성이 좋다.
*/

abstract class Coffee {  // 추상화 클래스 (상위 클래스)
    public abstract int getPrice();

    @Override
    public String toString(){
        return "Hi this coffee is " + this.getPrice();
    }
}

class CoffeeFactory {  // 하위 클래스 
    public static Coffee getCoffee(String type, int price) {
        if ("Latte".equalsIgnoreCase(type)) return new Latte(price);
        else if ("Americano".equalsIgnoreCase(type)) return new Americano(price);
        else {
            return new DefaultCoffee();
        }
    }
}

class DefaultCoffee extends Coffee { // Coffee class 상속
    private int price;

    public DefaultCoffee(){
        this.price = -1;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

class Latte extends Coffee {
    private int price;

    public Latte(int price){
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

class Americano extends Coffee {
    private int price;

    public Americano(int price){
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        Coffee latte = CoffeeFactory.getCoffee("Latte", 5500);
        Coffee ame = CoffeeFactory.getCoffee("Americano", 4500);
        System.out.println("Factory latte :: " + latte);
        System.out.println("Factory ame :: " + ame);
    }
}

/* 실행 결과값

Factory latte :: Hi this coffee is 5500
Factory ame :: Hi this coffee is 4500

 */