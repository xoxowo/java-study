import java.util.*;

public class FlowEx4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char ch = ' ';

        System.out.printf("문자 하나를 입력해주세요. > ");

        String input = scanner.nextLine();
        ch = input.charAt(0);

        if ('0'<=ch && ch <= '9') {
            System.out.printf("입력하신 문자는 숫자입니다. %n");
        }
        if (('a'<=ch && ch <='z') || ('A'<=ch && ch <='Z')) {
            System.out.printf("입력하신 문자는 영문자입니다. %n");
        }

        if (('ㄱ' <= ch && ch <='ㅎ') || ('ㅏ' <= ch && ch <='ㅖ')) {
            System.out.printf("입력하신 문자는 한글입니다. %n");
        }
    }
}
