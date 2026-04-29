package Inheritance;

public class Vehicle {

    public String name;

    public String model;

    public int noOfTyres;


    Vehicle(){
        this.name = "";
        this.model = "";
        this.noOfTyres= -1;
    }

    Vehicle(String name , String model , int noOfTyres){
        this.name = name;
        this.model = model;
        this.noOfTyres= noOfTyres;
    }

    void startEngine(){
        System.out.printf("engine is starting of %s: %s\n" , name , model);
    }

    void stopEngine(){
        System.out.printf("engine is stopping of %s:%s\n", name , model);
    }



}
