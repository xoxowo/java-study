public class FlowEx16 {
}
/*  선언위치에 따른 변수의 종류 
    인스턴스 변수 - 클래스 영역에 선언되며, 클래스의 인스턴스를 생성할 때 만들어진다. 객체생성을 해야 사용 가능
    클래스 변수 -  class 변수는 인스턴스 변수 앞에 static만 붙이면 된다.
    지역변수 - 매서드 내에서만 사용가능 메서드가 종료되면 소멸된다.
*/
class CardTest {
    public static void main(String args[]){
        System.out.println("Card.width ="+Card.width);
        System.out.println("Card.height ="+Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";   // c1.kind 의 c1은 참조변수 
        c1.number = 1;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 "+ c1.kind + "," + c1.number + "이며, 크기는 (" + c1.width + "," + c2.height + ") ");
        System.out.println("c2은 "+ c2.kind + "," + c2.number + "이며, 크기는 (" + c2.width + "," + c2.height + ") ");
        System.out.println("c1의 width와 height를 각 50, 80 으로 변경합니다.");

        c1.width = 50; // 클래스 변수의 값을 변경. 
        c1.height =80; // 클래스 변수이기 때문에 되도록 '클래스명.변수명' 으로 작성해야한다. Card.width

        System.out.println("c1은 "+ c1.kind + "," + c1.number + "이며, 크기는 (" + c1.width + "," + c2.height + ") ");
        System.out.println("c2은 "+ c2.kind + "," + c2.number + "이며, 크기는 (" + c2.width + "," + c2.height + ") ");
    }
}

class Card {
    String kind;
    int number;
    static int width = 100;  // class 변수 객체생성을 하지 않아도 사용이 가능하다.
    static int height = 250; 
}