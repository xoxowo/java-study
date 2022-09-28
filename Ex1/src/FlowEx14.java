public class FlowEx14 {
    public static void main(String[] args){
        // String array 선언과 생성 
        // String[] name = new String[3];
        String[] animals = {"cat", "dog", "fox"};
        
        for (int i=0; i <animals.length; i ++)
            System.out.println("animals["+i+"]:" + animals[i]);
        String tmp = animals[2];
        System.out.println("tmp:"+tmp);
        animals[0] = "bear";
        for (String str : animals) //향상된 for문 사용
            System.out.println((str));

        //char 배열과 String 클래스 `

        char[] hex = {'C', 'A', 'F', 'E'};    
        String[] binary = {"0000", "0001", "0011",
                           "0100", "0101", "0111",
                           "1000", "1010", "1011",
                           "1100", "1101", "1111"};
        String result = "";
        
        // for (int i =0; i<hex.length; i++){
        //     if (hex[i] >= '0' && hex[i] <='9') {
        //         result +=binary[hex[i]-'0'];
        //     } else {
        //         result +=binary[hex[i]-'A'+10];
        //     }
        // }
        System.out.println("hex:" +new String(hex));
        System.out.println("binary:" + result);

        // Strng 객체는 읽을 수만 있고 내용을 변경 할 수 없다.

        String src ="ABCDE";
        
        for (int i=0; i<src.length(); i++){
            char ch = src.charAt(i);
            System.out.println("src.charAt("+i+")"+ ch);
        }
        char[] chArr = src.toCharArray();
        
        System.out.println(chArr);

        // String문자열을 모스부호로 변환하는 예제
        String source ="SOSHELP";
        String[] morse = {".-", "-...","-.-","-..",".",
                            "..-.","--.","....","..",".---",
                            ".--","--.-",".-.","...","---",
                            "..-","...-",".--","-..-","-.--",
                            "--.."};

        String results="";

        for (int i =0; i<source.length(); i++){
            results+=morse[source.charAt(i)-'A'];
        }
        System.out.println("source:"+ source);
        System.out.println("morse:"+ results);
        // 사용자로부터 입력받아 출력하기 예제

        System.out.println("매개변수의 개수:"+args.length);
        for (int i =0; i <args.length; i++){
            System.out.println("args["+i+"] \""+ args[i] + "\"");
        }

        // 사칙연산 추가 예제


        if (args.length !=3){
            System.out.println("usage :java ArrayEx NUM1 OP NUM2");
            System.exit(0);
        }

        int num1 = Integer.parseInt(args[0]);
        char op = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);
        int result2 = 0;

        switch(op) {
            case '+' :
                result2 = num1 +num2;
                break;
            case '-' :
                result2 = num1 - num2;
                break;
            case 'x' :
                result2 = num1 * num2;
                break;
            case '/' :
                result2 = num1 / num2;
                break;
            default :
                System.out.println("지원되지 않는 연산입니다.");
        }
        System.out.println("결과:"+ result2);
    }
}
