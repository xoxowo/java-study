public class FlowEx15 {

}

class Tv {
    // Tv 인스턴스 생성 및 사용
    String color;
    boolean power;
    int channel;
    //메서드 선언 
    //void는 반환하는 return 값이 없는 메서드를 선언할 때 사용
    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class TvTest {
    public static void main(String args[]) {
        Tv t;              // Tv 인스턴스를 참조하기 위한 참조변수 t 선언
        t = new Tv();      // Tv 인스턴스 생성
        t.channel = 9;     // Tv 인스턴스의 맴버변수 channel 의 값을 9로 선언
        t.channelDown();;  // Tv 인스턴스의 메서드 channelDown()을 호출한다.
        System.out.println("현재 채널은" + t.channel + "입니다.");
    }
}