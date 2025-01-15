
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Shape cir = new Circle();
        cir.draw();
        Shape squ = new Square();
        squ.draw();
    }
}
