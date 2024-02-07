import java.util.Objects;

public class Car {
    private String plate;
    private Fueltype fueltype;
    private Person person;
    public Car(String plate, Fueltype fueltype){
        this.plate=plate;
        this.fueltype=fueltype;
    }
    public String getplate(){
        return this.plate;
    }
    public void setplate(String new_plate){
        this.plate=new_plate;
        
    }
    
    public double calculateFuelCost(double liter){
        return this.fueltype.getPriceLiter()*liter;
    }
    public void set_driver(Person person){
        this.person=person;

    }
    public String IntroduceSelf(){
        if(person!=null){
            return ("the plate number is" +this.plate+  "the fuel type is" +fueltype.getFuelName()+ "and it cost for"+fueltype.getPriceLiter()+ "every kilometer is like, and the current driver of this car"+ this.person.get_name());
    
        }
        else{
            return "the plate number is"+ this.plate+ "the fuel type is" +fueltype.getFuelName()+"and it cost for" +fueltype.getPriceLiter()+ "every kilometer is like";
        }
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car otheCar=(Car) obj;
        return Objects.equals(this.plate,otheCar.plate) && Objects.equals(this.fueltype, otheCar.fueltype)
    }
    @Override
    public int hashcode(){
        return Object.hash(plate,fueltype);
    }

}

