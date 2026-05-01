package Polymorphism;

public class Main {
    static void main() {
//        Calculator c = new Calculator();
//        System.out.println(c.add(2,3));
//        System.out.println(c.add(4,5,6));

        //runtime polymorphism
Circle c = new Circle();
doDrawingStuff(c);

Rectangle r = new Rectangle();
doDrawingStuff(r);

Shape s = new Shape();
doDrawingStuff(s);


    }


    //upcasting / dynamic method dispatch
    public static void doDrawingStuff(Shape s){
        s.draw();
    }
}
