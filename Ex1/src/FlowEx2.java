import java.util.*; // scanner util 사용하기 위해 import 

public class FlowEx2 {
    public static void main(String[] args) {
        int input;

        System.out.println("구매하실 제품 수량을 입력해주세요.");

        Scanner scanner = new Scanner(System.in); // scanner 초기화!
        String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
        input = Integer.parseInt(tmp); // 입력받은 문자열(tmp)를 숫자로 변환

        if (input==0) {
            System.out.println("1 이상의 수량을 입력해주세요.");
        }

        else if (input!=0) {
            System.out.printf("주문하신 제품의 수량은 %d개 입니다.", input);
            //println은 format형식이 아니기 때문에 printf를 사용해야 format
        }

        String tmp2 = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
        input = Integer.parseInt(tmp2); // 입력받은 문자열(tmp)를 숫자로 변환
        System.out.printf("주문하신 제품의 수량은 %d개 입니다.", input);
    }
}