public class DrawShape {
    public static void main(String[] args) {
        Point[] p = {   new Point(100, 100),
                        new Point(140, 50),
                        new Point(200, 100),
                    };

        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150, 150), 50);
        t.draw();
        c.draw();
    }    
}

class Shape { // 조상 클래스 
    String color = "black";
    void draw() {
        System.out.printf("[color=%s]%n", color);
    }
}

class Point {
    int x;
    int y;
    Point(int x, int y) {
        this. x = x;
        this. y = y;
    }
    Point() {
        this(0, 0);
    }
    String getXY() {
        return "("+x+", "+y+")";
    }
}

class Circle extends Shape { // 조상 클래스 Shape 상속하여 Shape 클래스를 사용할 수 있다.
    Point center;
    int r;

    Circle() {
        this (new Point(0, 0), 100);
    }
    // 생성자에서 다른 생성자 호출 할 때 this(), this 사용
    Circle(Point center, int r) { // 매개변수가 있는 생성자
        this.center = center;
        this.r = r;
    }
    void draw() {
        System.out.printf("[center=(%d, %d), r= %d, color=%s]%n", center.x, center.y, r, color);
    }
}

class Triangle extends Shape {
    Point[] p = new Point[3]; // 길이가 3인 배열 생성

    Triangle(Point[] p) {
        this.p = p;
    }

    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}