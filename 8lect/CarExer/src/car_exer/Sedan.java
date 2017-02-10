package car_exer;

public class Sedan extends Car {

    public int length;

    @Override
    public double getSalePrice() {
        double price = 0.0;
        if(length>4){
            price = regularPrice*0.95;
        }
        else{
            price = regularPrice*0.9;
        }
        return price;
    }
}
