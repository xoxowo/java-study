/*
메서드로 배열을호출
 */
class Data { int x ;}

class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = new int[] {3,2,1,6,5,4};
        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum="+sumArr(arr));
    }
    static void printArr(int[] arr) {
        System.out.print("[");

        for (int i : arr) // 향상된 for 문 for (int i = 0; i <arr.length; i ++) <- 이렇게 작성해도 괜찮다.
            System.out.print(i+",");
        System.out.println("]");
    }

    static int sumArr(int[] arr) { // return 값이 있기 때문에 void 사용하지 않음..
        int sum = 0;

        for(int i=0;i<arr.length; i++)
            sum +=arr[i];
        return sum;
    }

    static void sortArr(int[] arr) {
        for (int i=0;i<arr.length-1; i++)
            for (int j=0;j<arr.length-1-i; j++)
                if(arr[j] < arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
    } // sortArr(int[] arr)
}

/* 실행 결과값

[3,2,1,6,5,4,]
[6,5,4,3,2,1,]
sum=21

 */