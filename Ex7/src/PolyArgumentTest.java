class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/5.0);
    }
}

class Tv extends Product {
    Tv () {super(1000);}
    public String toString() {return "Tv";}
}

class Computer extends Product {
    Computer () {super(15000);}
    public String toString() {return "Computer";}
}

class Audio extends Product {
    Audio () {super(3000); }
    public String toString() {return "Audio";}
}

class buyer {
    int money = 10000;
    int bonusPoint = 0;
    
    void buy (Product p) {
        if (money < p.price) {
            System.out.println("The amount is not enough.");
            return;
        };

        money -=p.price;
        bonusPoint +=p.bonusPoint;
        System.out.println(p + "을/를 구입하셨습니다.");
    } 
}

class PolyArgumentTest {
    public static void main(String[] args) {
        buyer b = new buyer();
        b.buy(new Tv());
        b.buy(new Audio());
        
        System.out.println("현재 남은 금액은 "+b.money+"입니다.");
        System.out.println("현재 보유하신 보너스포인트는 "+b.bonusPoint+"입니다.");
    }
}
