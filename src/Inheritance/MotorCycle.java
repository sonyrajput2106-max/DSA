package Inheritance;

public class MotorCycle  extends Vehicle{

   public String handleBarStyle;


   public String suspensionType;

   MotorCycle(String name, String model , int noOfTyres , String handleBarStyle, String suspensionType){
      super(name, model, noOfTyres);
      this.handleBarStyle = handleBarStyle;
      this.suspensionType = suspensionType;
   }

   public void wheelie(){
      System.out.println("Motorcycle is doing wheelieeeeee!" +name);
   }

}
