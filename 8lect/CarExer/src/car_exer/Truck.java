package car_exer;

public class Truck extends Car{

        public int weight;

        @Override
        public double getSalePrice() {
            double price = 0.0;
            if(weight>2000){
                price = regularPrice*0.9;
            }
            else{
                price = regularPrice*0.8;
            }
            return price;
        }

}
