public class Car {
    
    private String color;
    private double percentageFull;
    
    Car(String color, double percentageFull){
        this.color=color;
        this.percentageFull=percentageFull;
    }
    
    public String printCar(){
        return String.format("The car is %s and fuel level is at %.2f", color, percentageFull);
    }


}
