public class FlowEx25 {
}

/*
참조형 반환타입
매개변수말고도 메서드의 반환타입이 참조형이 될 수 있다.

*/

class Data { int x ;}

class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        
        Data d2 = copy(d);
        System.out.println("d.x ="+d.x);
        System.out.println("d2.x ="+d2.x);
        }
    static Data copy(Data d) {
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp;
    }
}

/* 실행결과값
d.x =10
d2.x =10
 */