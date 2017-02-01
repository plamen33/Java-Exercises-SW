package fifthlec.Task0_Classes;

import java.util.Scanner;

public class BworkingWithCar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String car = sc.next();
        String model = sc.next();
        int year = Integer.parseInt(sc.next());
        int power = Integer.parseInt(sc.next());

        Car newCar = new Car(car, model, year, power);
        String category = newCar.insuranceCategory(year);

        Double taxes = newCar.tax(category, power);

        System.out.println(taxes);
    }
}
