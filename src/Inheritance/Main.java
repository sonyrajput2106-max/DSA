package Inheritance;

public class Main {
    static void main() {
//        Car c = new Car(" Maruti", "800", 4 , 5 , "auto");
//        c.startAc();
//        c.startEngine();
//        c.stopEngine();

        MotorCycle m = new MotorCycle("Splender" , "Xline" , 2 ,"U", "Soft");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}
