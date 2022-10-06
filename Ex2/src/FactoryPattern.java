abstract class Coffee {
    public abstract int getPrice();

    @Override
    public String toString(){
        return "Hi this coffee is " + this.getPrice();
    }
}

class CoffeeFactory {
    public static Coffee getCoffee(String type, int price) {
        if ("Latte".equalsIgnoreCase(type)) return new Latte(price);
        else if ("Americano".equalsIgnoreCase(type)) return new Americano(price);
        else {
            return new DefaultCoffee();
        }
    }
}

class DefaultCoffee extends Coffee {
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