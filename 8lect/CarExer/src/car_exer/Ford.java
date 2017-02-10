package car_exer;


public class Ford extends Car {
    public int year;
    public int manufacturerDiscount;

    @Override
    public double getSalePrice(){

        return regularPrice - manufacturerDiscount;
    }
}
