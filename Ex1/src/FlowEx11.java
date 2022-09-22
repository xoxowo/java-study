import java.util.*;

public class FlowEx11 {
    public static void main(String[] args){
    //break 문은 자신이 포함된 가장 가까운 반복문을 벗어난다.
    //주로 if문이랑 함께 사용됨 !
    
        int sum = 0;
    int i = 0;
    
    while (true) {
        if (sum > 50)
            break;
        ++i;  //break 문이 수행되면 11,12줄은 실행되지 않고 while문을 벗어난다.
        sum +=i;

        // ++i 와 sum +=i를 한문장으로 줄이면 sum += ++i;다.
    }
    System.out.println("i=" + i);
    System.out.println("sum=" + sum);

    //continue문은 반복문 내에서만 사용할 수 있고 특정 조건을 만족하는 경우를 제외할 때 유용하다.
    for (int j = 0; j <=10; j++) {
        if (j%3==0)
            continue;
        System.out.println(j);
    }

    int menu = 0;
    int num = 0;

    Scanner scanner = new Scanner(System.in);
    while(true){
        System.out.println("(1) square");
        System.out.println("(2) square root");
        System.out.println("(3) log");
        System.out.println("원하시는 메뉴(1~3)를 선택하세요. (종료:0)>");

        String tmp = scanner.nextLine();
        menu = Integer.parseInt(tmp); // 입력받은 tmp를 숫자로 변환
        
        if (menu==0) {
            System.out.println("프로그램을 종료합니다.");
            break;
        } else if (!(1 <=menu && menu <=3)) {
            System.out.println("메뉴를 잘못 선택하셨습니다. (종료:0)");
            continue;
        }
        System.out.println("선택하신 메뉴는 "+menu+"번입니다.");
        
        for(;;){
            System.out.println("계산할 값을 입력하세요. (계산종료:0, 전체 종료:99)>");
            tmp= scanner.nextLine();
            num=Integer.parseInt(tmp);

            if (num==0)
                break;
            if(num==99)
                break;
            
            switch(menu) {
                case 1 :
                    System.out.println("result=" +num*num);
                    break;
                case 2 :
                    System.out.println("result=" +Math.sqrt(num));
                    break;
                case 3 :
                    System.out.println("result=" +Math.log(num));
                    break;
            }
        }
    }
    }
}
