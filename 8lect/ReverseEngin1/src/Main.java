
public class Main {
    public static void main(String[] args) {

        Expression e = new Sum( new Exponent(new Number(2.0), new Number(3.0)), new Sum(new Number(1.0), new Number(-3.0)) );
        System.out.println(e.toString() + " = " + e.evaluate());

    }
}

abstract class Expression{

    abstract double evaluate();

}

class Sum extends Expression{
    Number num1;
    Number num2;

    Sum(Number Number1, Number Number2){
        this.num1 = Number1;
        this.num2 = Number2;
    }
    Sum(Expression e1, Expression e2){
        this.num1 = new Number(e1.evaluate());
        this.num2 = new Number(e2.evaluate());
    }
    double evaluate(){
        return  num1.number + num2.number;
    }

}

class Exponent extends Expression{
    Number num1;
    Number num2;
    Exponent(Number Number1, Number Number2){
        this.num1 = Number1;
        this.num2 = Number2;

    }
    Exponent(Expression e1, Expression e2){
        this.num1 = new Number(e1.evaluate());
        this.num2 = new Number(e2.evaluate());
    }
    double evaluate(){
        return  Math.pow(num1.number, num2.number);
    }
}
class Number{
    double number;

    Number(double input){
        this.number = input;

    }
}
