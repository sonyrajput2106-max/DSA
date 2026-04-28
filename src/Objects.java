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

    //Parameterized constructor
    public Objects(int id , int age , String name , int nos) {
        System.out.println("student Parameterized  constructor called ");
        this.id= id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    //Copy constructor
    public Objects(Objects srcobj) {
        System.out.println("student Parameterized  constructor called ");
        this.id= srcobj.id;
        this.age =srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
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


