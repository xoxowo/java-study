class FightTest {
    public static void main(String[] args) {
        
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