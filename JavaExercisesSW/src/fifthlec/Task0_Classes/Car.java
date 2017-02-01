package fifthlec.Task0_Classes;


public class Car {
    String type;
    String model;
    int power;
    int year;

    public Car(String type, String model, int power, int year) {
        this.type = type;
        this.model = model;
        this.power = power;
        this.year = year;
    }
    String insuranceCategory(int years){

        int yearsOfCar = 2016 - years;
        if (yearsOfCar < 8){
            return "cat1";
        }
        else if (yearsOfCar<16){
            return  "cat2";
        }
        else if (yearsOfCar < 26){
            return "cat3";
        }
        else{
            return "cat4";
        }
    }
    Double tax(String category, int power){
        Double tax = 0.0;
        switch (category){
            case "cat1": tax = (double)150; break;
            case "cat2": tax = (double)200; break;
            case "cat3": tax = (double)300; break;
            case "cat4": tax = (double)500; break;

        }
        if (power < 80){
            tax = tax * 1.2;
        }
        else if(power> 140){
            tax *= 1.45;
        }
        return  tax;
    }
}
