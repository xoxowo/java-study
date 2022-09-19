import java.util.*;

public class FlowEx6 {
    public static void main(String[] args){
        //switch 문 조건식을 먼저 계산한 다음 결과값에 일치하는 case문으로 이동한다.
        // 1. 조건식 결과는 정수 또는 문자열이여야한다.
        // 2. case문의 값은 정수 상수만 가능하며 중복되지 않아야한다.
        // 3. case문은 한줄에 작성할 수 있다.  
        System.out.print("예약을 원하시는 월을 입력해주세요. >");

        Scanner scanner = new Scanner((System.in)); 
        int month = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 month에 저장한다.

        switch(month) {
            case 3:
            case 4:
            case 5:
                System.out.println("현재 예약이 가능한 달이 아닙니다.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("예약이 가능한 달입니다.");
                break;
            case 9: case 10: case 11: // case문은 한줄에 작성할 수 있다. 
                System.out.println("현재 예약이 가능한 달이 아닙니다.");
                break;
            case 12: case 1 : case 2 :
                System.out.println("현재 예약이 가능한 달이 아닙니다.");
                break; //마지막 문장에는 break를 사용할 필요가 없다.
        }
    }
}
