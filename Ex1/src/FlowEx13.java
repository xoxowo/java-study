import java.util.Arrays;

import javax.swing.text.AbstractDocument.BranchElement;

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
    System.out.println("----------------------------");
    // 2. 최대값과 최소값
    int[] number = {32,6,11,999};
    
    int max = number[0]; // 배열의 첫 번째 값으로 최대값초기화
    int min = number[0]; // 배열의 첫 번째 값으로 최대값초기화

    for (int i = 0; i <number.length; i++){
        if (number[i] >max) {
            max = number[i];
        } else if (number[i] <min) {
            min = number[i];
        }
    }
    System.out.println("최대값 :" +max);
    System.out.println("최소값 :" +min);

    System.out.println("----------------------------");
    // 3. 요소의 순서를 반복해서 섞기 (바꾸기)
    int[] numArr = new int[10]; // 배열선언하면서 초기화

    for (int i = 0; i< numArr.length; i++){
        numArr[i]=i; //배열을 0~9 for문사용하여 초기화 < 값을 넣어줌
        System.out.println(numArr[i]);
    }
    System.out.println();

    for (int i = 0; i <100; i++){
        int n = (int)(Math.random() * 10); //0~9 중의 한 값을 임의로 얻음
        int tmp = numArr[0];  // 45~47줄은 numArr[0]과 numArr[n]의 값을 서로 바꾸는것
        numArr[0] = numArr[n];
        numArr[n] = tmp;
    }
    
    for (int i =0; i< numArr.length; i++){
        System.out.println(numArr[i]);

    }
    System.out.println("----------------------------");
    // 4. 번호를 랜덤으로 생성하는 예제
    int[] ball = new int[45];
    // 배열의 인덱스는 0부터 시작하기 때문 
    for(int i = 0; i<ball.length; i++) {
        ball[i]= i+1;
        System.out.println(ball[i]);
    }
    int tmp = 0;
    int j = 0;

    // for(int i = 0; i<46; i++) {
    //     ball[i]= i+1;
    //     System.out.println(ball[i]);
    // }

    for (int i =0; i<6; i++){
        j = (int)(Math.random() * 45);
        tmp= ball[i];       //64줄부터 66은ball[i] 값과 ball[j]값을 서로 바꿈.
        ball[i] = ball[j];
        ball[j] = tmp;
    }
    for (int i =0; i <6; i++){
        System.out.printf("ball[%d]=%d%n",i,ball[i]);
    }
    System.out.println("----------------------------");
    // 5. Arrays.toString() 사용

    int[] code = {-1,-32,4,100};
    int[] arr = new int[10];

    for (int i =0; i<arr.length; i++){
        int tmps = (int)(Math.random()*code.length);
        arr[i]= code[tmps];
    }
    System.out.println(Arrays.toString(arr));

    System.out.println("----------------------------");
    // 6. 
    int[] bArry = new int[10];
    
    for (int i =0; i <bArry.length; i++) {
        System.out.print(bArry[i]= (int)(Math.random()*10));
    }
    System.out.println();

    for (int i=0; i<bArry.length; i++) {
        boolean changed = false;

        for (int l=0; l<bArry.length-1-i; l++) {
            if (bArry[l] >bArry[l+1]) {
                int tmpp = bArry[l];
                bArry[l] = bArry[l+1];
                bArry[l+1] = tmpp;
                changed = true;
            }
        }

        if (!changed) break;
        for (int k = 0; k<bArry.length; k++)
            System.out.print(bArry[k]);
        System.out.println();
    }
    System.out.println("----------------------------");
    // 7. 
    int[] cArr = new int[10];
    int[] dArr = new int[10];

    for (int i = 0; i<cArr.length; i++){
        cArr[i] = (int)(Math.random()*10);
        System.out.print(cArr[i]);
    }
    System.out.println();

    for (int i = 0; i<cArr.length; i++){
        dArr[cArr[i]]++;
    }
    for (int i =0; i<cArr.length; i++){
        System.out.println(i +"의 개수"+dArr[i]);
    }
    }
}
