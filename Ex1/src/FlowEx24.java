public class FlowEx24 {
    
}

class ReturnTest{
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(3,5); // 변수 선언? 
        System.out.println(result);

        int[] result2 = {0}; // 배열생성 후 result2 의 값을 0 으로 초기화
        r.add(3,5,result2); // void add 메서드로 들어간다.
        System.out.println(result2[0]); //result2의 인덱스 0 호출
    }
    // 반환값이 있는 메서드를 아래 매서드처럼 void를 사용하고 결과값을 바꿔 반환값이 없는 메서드로 변환
    // 참조형 매개변수를 활용하여 반환값이 없어도 메서드의 실행결과를 가져올 수 있도록 했다.
    int add(int a, int b) {
        return a+b;
    }

    void add(int a, int b, int[] result) {
        result[0] = a+b; // 매개변수로 넘겹갇은 배열에 연산결과를 저장한다. 
    }                    // 14번째줄에서 프린트 시 result에 저장한 변수값이 출력된다.
}

/* 실행 결과값
8
8
 */