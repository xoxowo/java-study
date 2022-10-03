public class FlowEx15 {

}
    // Tv 인스턴스 생성 및 사용
class Tv {
    // Tv의 속성 (멤버 변수)
    String color;
    boolean power;
    int channel;
    //메서드 선언 (Tv의 기능) 
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

class TvTest2 {
    public static void main(String args[]) {
        Tv t1 = new Tv();  // 인스턴스 선언과 생성을 동시에 
        Tv t2 = new Tv();
        System.out.println("t1의 channel 값은" + t1.channel + "입니다");
        System.out.println("t1의 channel 값은" + t2.channel + "입니다");

        t1.channel = 6;
        System.out.println("t1의 channel 값을 6으로 변경하였습니다.");
        System.out.println("t1의 channel 값은" + t1.channel + "입니다");
        System.out.println("t1의 channel 값은" + t2.channel + "입니다");
    }
}

class TvTest3 {
    public static void main(String args[]){
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel 값은" + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은" + t2.channel + "입니다.");
        t2 = t1;
        t1.channel = 8;
        System.out.println("t1의 channel 값을 8으로 변경하였습니다."); 
        System.out.println("t1의 channel 값은" + t1.channel + "입니다");
        System.out.println("t1의 channel 값은" + t2.channel + "입니다");

    }
}

class TvTest4 {
    public static void main(String args[]){
        Tv[] tvArr = new Tv[3]; // 길이가 3인 Tv객체 배열 생성 및 선언

        for (int i = 0; i<tvArr.length; i++){
            tvArr[i] = new Tv(); 
            tvArr[i].channel = i+10; //tvArr[i]의 channel에 i+10을 저장
        }
        for (int i =0; i<tvArr.length; i++){
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
        }

    }

}