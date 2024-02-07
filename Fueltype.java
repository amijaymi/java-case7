public class Fueltype {
    private enum fuel{
        GASOLINE,
        DIESEL;
    }
    private String fuelName;
    private double priceByLiter;
    private Fueltype(String fuelName,double priceByLiter){
        this.fuelName=fuelName;
        this.priceByLiter=priceByLiter;
    }
    public String getFuelName(){
        return this.fuelName;
    }
    public double getPriceLiter(){
        return this.priceByLiter;
    }
}
