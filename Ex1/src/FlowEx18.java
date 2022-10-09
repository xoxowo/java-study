
public class FlowEx18 {
    
}
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