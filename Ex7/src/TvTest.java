class Tv {
    boolean power; // 전원 상태 (on/off)
    int channel; // 채널

    void power() { power = !power; }// void는 리턴값이 없을 때 선언해준다.
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

// 조상 클래스인 Tv 클래스를 자손 클래스인 CaptionTv가 상속
class CaptionTv extends Tv {
    boolean caption;    // 캡션 상태 (on/off)
    void displayCaption(String text) {
        if (caption) { // 캡션 상태가 on(true)일 때만 text를 보여 준다.
            System.out.println(text);
        }
    }
}
class TvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv() ; // 초기화 및 선언
        ctv.channel = 10; // CaptionTv 클래스는 Tv 클래스를 상속받았기 때문에 tv 클래스의 채널을 사용할 수 있음
        ctv.channelUp(); // 
        System.out.println(ctv.channel);
        ctv.displayCaption("hello world");
        ctv.caption = true;
        ctv.displayCaption("hello world");

    }
}
