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
    }

}
