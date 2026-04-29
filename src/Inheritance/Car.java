package Inheritance;

public class Car extends Vehicle {

public int noOfDoors;

public String transmissionType;


Car(String name , String model, int noOfTyres, int noOfDoors, String transmissionType){
    super(name , model , noOfTyres);
    this.noOfDoors = noOfDoors;
    this.transmissionType = transmissionType;

}

public void startAc(){
    System.out.println("ac started of" + name);
}


}
