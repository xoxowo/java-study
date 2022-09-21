public class FlowEx9 {
    public static void main(String[] args) {
        // 형변환 double -> int

        double d = 99.87;
        int age = (int)d;

        System.out.println(age);

        // 형변환 int -> double
        int date = 9;
        double fork = (int)date;
        
        System.out.println(fork);

        // 형변환 float -> double (double이 정밀도가 약 2배 높다)
        float f =9.23f;
        double dd = (double)f;
        System.out.println(f);
        System.out.println(dd);
    }
}
