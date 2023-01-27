public class Car {
    String brand;
    Myself owner;

    Car(String brandName, Myself me){
        this.brand = brandName;
        this.owner = me;
    }
    void showOwnerName(){
        System.out.println("My car is" + this.brand + " My name is " + owner.name);
    
    }
}
