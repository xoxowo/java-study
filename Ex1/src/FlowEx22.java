/*
길이가 1인 메서드로 배열 호출
 */

class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] x = {10};
        System.out.println("main() : x = " +x[0]);

        change(x);
        System.out.println("After change(x)");
        System.out.println("main() : x = " + x[0]);
    }                   // int[] x 값이 참조형 매개변수
    static void change(int[] x) { // 참조형 매개변수 : 읽고 값을 변경할 수 있다. 따라서 x[0]의 값이 1000으로 변경되었음.
        x[0] = 1000;
        System.out.println("change() : x = " + x[0]);
    }
}

/* 실행 결과값
main() : x = 10
change() : x = 1000
After change(x)
main() : x = 1000
 */