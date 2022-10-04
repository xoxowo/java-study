public class FlowEx16 {
}


/*  선언위치에 따른 변수의 종류 
    인스턴스 변수 
    클래스 변수
    지역변수 - 매서드 내에서만 사용가능 메서드가 종료되면 소멸된다.
*/
class CardTest {
    public static void main(String args[]){
        System.out.println("Card.width ="+Card.width);
        System.out.println("Card.height ="+Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 1;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 "+ c1.kind + "," + c1.number + "이며, 크기는 (" + c1.width + "," + c2.height + ") ");
        System.out.println("c2은 "+ c2.kind + "," + c2.number + "이며, 크기는 (" + c2.width + "," + c2.height + ") ");
        System.out.println("c1의 width와 height를 각 50, 80 으로 변경합니다.");
        c1.width = 50;
        c1.height =80;
        System.out.println("c1은 "+ c1.kind + "," + c1.number + "이며, 크기는 (" + c1.width + "," + c2.height + ") ");
        System.out.println("c2은 "+ c2.kind + "," + c2.number + "이며, 크기는 (" + c2.width + "," + c2.height + ") ");
    }
}

class Card {
    String kind;
    int number;
    static int width = 100;  // class 변수 객체생성을 하지 않아도 사용이 가능하다.
    static int height = 250; // class 변수는 인스턴스 변수 앞에 static만 붙이면 된다.
}