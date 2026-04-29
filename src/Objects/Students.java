package Objects;

public class Students {
    //Attributes
    public int id;
    private int age;
    public String name;
    public int nos;
    private String gf;

    public String getGf(){
        return this.gf;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int a){
        //extra layer of authentication
        if (age <100){
        this.age =a;}
        return;
    }

    //Default constructor
    public Students() {
        System.out.println("student default constructor called ");
    }

    //Parameterized constructor
    public Students(int id , int age , String name , int nos , String gf) {
        System.out.println("student Parameterized  constructor called ");
        this.id= id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf=gf;
    }

    //Copy constructor
    public Students(Students srcobj) {
        System.out.println("student Parameterized  constructor called ");
        this.id= srcobj.id;
        this.age =srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }

    //,Methods/Behaviour
    public void study() {
        System.out.println(name + " studying");
    }

    public void sleep() {
        System.out.println(name + " sleeping");
    }

    public void bunk() {
        System.out.println(name + " bunking");
    }

    private void gfChatting(){
        System.out.println(name +" chatting");
    }
}


