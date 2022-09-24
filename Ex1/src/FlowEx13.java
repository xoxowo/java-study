public class FlowEx13 {
    public static void main(String[] args) {
    // 배열 활용 예제 
    // 1. 총합과 평균 
    int sum = 0;
    float average = 0f; // float 자료형은 숫자 뒤에 f 붙여야함.
    
    int[] score = {100, 95, 90, 78};

    for (int i=0; i <score.length; i++) {
        sum += score[i];
    }
    average = sum / (float)score.length;

    System.out.println("총점:" + sum);
    System.out.println("평균:" + average);
    }
}
