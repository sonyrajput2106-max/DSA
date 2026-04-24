public class Objects {
    //Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    //Default constructor
    public Objects() {
        System.out.println("student default constructor called ");
    }

    //,Methods/Behaviour
    public void study() {
        System.out.println(name + "studying");
    }

    public void sleep() {
        System.out.println(name + "sleeping");
    }

    public void bunk() {
        System.out.println(name + "bunking");
    }
}
