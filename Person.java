public class Person {
    private String name;
    private Car car;
    public Person(String name){
        this.name=name;
    }
    public String get_name(){
        return this.name;
    }
    public void set_car(Car car){
        this.car=car;
    }

    public String introduceSelf(){
        if(car!=null){
            return ("hello my name is "+get_name()+ "introducing the car that i use, "+car.IntroduceSelf());
        }
        else{
            return ("hello my name is "+get_name());
        }
        
    }
}

