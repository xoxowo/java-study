class FightTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        //instanceof 연산자 조건문에 보통 사용되며 형변환이 가능한지 확인 
        if (f instanceof Unit) 
            System.out.println("f는 Unit클래스의 자손입니다.");
        if (f instanceof Fightable)
            System.out.println("F는 Fightable 인터페이스를 구현했습니다.");
        if (f instanceof Movable)
            System.out.println("F는 Movable 인터페이스를 구현했습니다.");
        if (f instanceof Attackable)
            System.out.println("F는 Attackable 인터페이스를 구현했습니다.");
        if (f instanceof Object)
            System.out.println("f는 Object클래스의 자손입니다.");
    }    
}
class Fighter extends Unit implements Fightable {
    public void move(int x, int y){ }
    public void attact(Unit u) {}
}
class Unit {
    int currentHp;
    int x;
    int y;
}

interface Fightable extends Movable, Attackable {}
interface Movable {void move(int x, int y);}//인터페이스 내부 메서드는 모두 public abstract 이기 때문에 생략가능.
interface Attackable {void attact(Unit u);}

/* 실행 결과
f는 Unit클래스의 자손입니다.
F는 Fightable 인터페이스를 구현했습니다. 
F는 Movable 인터페이스를 구현했습니다.   
F는 Attackable 인터페이스를 구현했습니다.
f는 Object클래스의 자손입니다.
 */