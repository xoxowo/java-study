class FlowEx1 {
	public static void main(String[] args) {
    int x = 0;
    System.out.printf("x=%d 일 때, 참인 것은 %n", x);
    // 블럭 {} 내 문장이 하나일 경우 블럭{}을 생략할 수 있고 한 줄로 작성할 수 있다.
    if(x==0) System.out.println("x==0");
    if(x!=0) System.out.println("x!=0");
    if(!(x==0)) System.out.println("!(x==0)");
    if(!(x!=0)) System.out.println("!(x!=0)");
    
    x = 1;
    System.out.printf("x=%d 일 때, 참인 것은 %n", x);    

    if(x==0) System.out.println("x==0");
    if(x!=0) System.out.println("x!=0");
    if(!(x==0)) System.out.println("!(x==0)");
    if(!(x!=0)) System.out.println("!(x!=0)");
    
    }
}