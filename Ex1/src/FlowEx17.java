public class FlowEx17 {
}
/*
메서드의 선언과 구현
메서드 내에 선언된 변수를 '지역변수' 라고한다. 
예를 들면 for문도 메서드라고 볼 수 있다.
for문안에 선언된 변수가 '지역변수' (local variable)
 */

 class MyMathTest {
    public static void main(String args[]) {
        MyMath mm = new MyMath() ;
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);  // <-()괄호안의 값을 double 대신 long 값으로 호출했지만 자동으로 double로 형변환된다.

        System.out.println("add(5L, 3L) = " +result1);
        System.out.println("subtract(5L, 3L) = " +result2);
        System.out.println("multiply(5L, 3L) = " +result3);
        System.out.println("divide(5L, 3L) = " +result4);
    }
 }
 // 리턴값이 없으면 void를 붙여야한다. 메서드 이름 앞에 
 class MyMath {
    long add(long a, long b) { // a,b 변수 (매개번수)는 여러개 들어갈 수 있지만 리턴 반환값은 1개만 출력된다.
       // long result = a+b;
       // return result;
        return a + b;  // 위 두줄을 <- 한줄로 표시할 수 있다.
    }
    long subtract(long a, long b) {return a-b;}
    long multiply(long a, long b) {return a*b;}
    double divide(double a, double b) {return a/b;}
 }