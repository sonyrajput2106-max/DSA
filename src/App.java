public class App{
public static void main(String[] args) {
//    Objects A = new Objects();
//    A.id = 13;
//    A.age = 34;
//    A.name ="sona";
//    A.nos =4;
//    System.out.println(A.name);
//    System.out.println(A.id);
//    System.out.println(A.age);
//    System.out.println(A.nos);
//
//    A.bunk();
//    A.study();
//    A.sleep();

    //Parameterized constructor
    Objects A = new Objects(1,12, "sona", 3);
    System.out.println(A.name);
    System.out.println(A.id);
    System.out.println(A.age);
    System.out.println(A.nos);

    A.bunk();
    A.study();
    A.sleep();

    Objects B= new Objects(2,14, "nona", 5);
    Objects C = new Objects(3,12, "tona", 7);
    Objects D = new Objects(4,16, "mona", 3);


    //Copy constructor
//    Objects B = new Objects(A);
//    System.out.println(B.name);
//    System.out.println(B.id);
//    System.out.println(B.age);
//    System.out.println(B.nos);
//
//    B.sleep();
}}
