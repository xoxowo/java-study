public class FlowEx12 {
    public static void main(String[] args) {
        /* 배열 array
            타입[] 변수 이름 = new 타입[길이]; 배열 선언과 생성을 동시에 
            길이는 선언해주어야한다. 길이가 0인 배열도 생성이 가능하다.
            python에서 range(리스트이름) 리스트의 길이 만큼 선언할 때처럼
            java에서는 배열이름.length 로 범위를 지정할 수 있다.
        */ 

        int[] arr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] += i ;
            System.out.printf("arr[%d] : %d%n", i, arr[i]);
        }
        System.out.println("------------------");
        for (int i = 0; i <arr.length; i++) {
            arr[i] += i++ ;
            System.out.printf("arr[%d] : %d%n", i, arr[i]);
        }
        
        /*
        int[] score = new int[5] {10,20,30,40,50} ;
        배열 생성과 초기화를 동시에 이렇게 할 수도 있다.
        또는 new int[] <- 생략할 수 있음
         */

        // int[] add;
        // add = new int[] {1,2,3,4,5};
        //add = {1,2,3,4,5}; new int[]를 생략할 수 없다.
        System.out.println("------------------");        
        int[] iarr = {1,2,3,4,5};

        for (int i =0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
        System.out.println("------------------");  
        // 그냥 배열 출력 시 '타입@주소' 형식으로 출력된다.
        System.out.println(iarr);

        //배열을 복사할 시 for문보다 System.arraycopy()를 사용하는 것이 요율적이다.
    }
}
