import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args){
        System.out.print("1~4 사이의 숫자를 입력해 보세요 .>");

        Scanner scanner = new Scanner(System.in);
        int gender = scanner.nextInt();
        // switch 중첩 문.. 
        switch(gender) {
            case '1' : case '3':
                switch (gender) {
                    case '1' :
                        System.out.println("1은 ");
                        break;
                    case '3' :
                        System.out.println("3은");
                        break;        
                }
                break;    
            case '2' : case '4':
                switch (gender) {
                    case '2' :
                        System.out.println("2는");
                        break;
                    case '4' :
                        System.out.println("4는 ");
                        break;  
                }    
                break;
            default :
                System.out.println("유효하지 않은 번호입니다.");
        }
    }
}
