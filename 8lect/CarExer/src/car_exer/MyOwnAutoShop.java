package car_exer;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan delorean = new Sedan();

        delorean.length = 3;
        delorean.speed = 237;
        delorean.regularPrice = 33_000;
        delorean.color = "silver";

        Ford focus = new Ford();
        focus.year = 2012;
        focus.manufacturerDiscount = 300;
        focus.speed = 210;
        focus.regularPrice = 24_000;
        focus.color = "dark_blue";

        Ford mondeo = new Ford();
        mondeo.year = 2014;
        mondeo.manufacturerDiscount = 700;
        mondeo.speed = 230;
        mondeo.regularPrice = 30_000;
        mondeo.color = "black";

        Car trabant = new Car();
        trabant.speed = 120;
        trabant.regularPrice = 3_000;
        trabant.color = "white";

        System.out.println(delorean.getSalePrice());
        System.out.println(focus.getSalePrice());
        System.out.println(mondeo.getSalePrice());
        System.out.println(trabant.getSalePrice());

    }
}
