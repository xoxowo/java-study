import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args){
        System.out.print("요일을 입력하시면 수강가능한 클래스를 안내해드립니다.\n 요일을 입력해주세요.>");

        Scanner scanner = new Scanner(System.in);
        String day = scanner.next();
        // switch 중첩 문 연습 String 변수 사용
        switch(day) {
            case "월요일" : case "화요일":
                switch (day) {
                    case "월요일" :
                        System.out.println("월요일은 마카롱 만들기 class가 있습니다.");
                        break;
                    case "화요일" :
                        System.out.println("화요일은 마들렌 만들기 class가 있습니다.");
                        break;        
                }
                break;    
            case "수요일" : case "목요일": case "금요일":
                switch (day) {
                    case "수요일" :
                        System.out.println("수요일은 수강 가능한 class가 없습니다.");
                        break;
                    case "목요일" :
                        System.out.println("목요일은 마들렌 만들기 class가 있습니다.");
                        break;  
                    case "금요일" :
                        System.out.println("금요일은 마카롱 만들기 class가 있습니다.");
                        break;      
                }    
                break;
            default :
                System.out.println("수강 가능한 class가 없습니다.");
        }
    }
}
