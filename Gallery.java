public class Gallery {
    private String galleryName;
    private Car[] cars;
    private static int car_count;
    private int capacity;
    private Person galleryOwner;
    public Gallery(String galleryName, int capacity, Person galleryOwner){
        this.galleryName=galleryName;
        this.capacity=capacity;
        this.galleryOwner=galleryOwner;
    
    }
    public String getGalleryName(){
        return this.galleryName;
    }
    public void setGalleryName(String name){
        this.galleryName=name;
    }
    public boolean add_car(Car car){
        if(capacity>0){
            for(int i=0;i<cars.length;i++){
                if(cars[i]==null){
                    cars[i]=car;
                    capacity-=1;
                    car_count+=1;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
    public boolean searchCar(Car car){
        
        for(Car myCars:cars){
            if(myCars.equals(car)){//burda iki obje karsilastirilirken == bunu kullanmamaliyiz bunun yerine equals methodu kullanilmali cunku == objelerin memorydeki adresini karsilastirirken equals content i karsilastir.
                
                return true;
            }
        }
        return false;
        
        
    }
    public String introduceSelf(){
        return "the name of gallery is"+this.galleryName+"the name of gallery owner is "+this.galleryOwner+"and the number of current cars is"+car_count;
    }
 




}
