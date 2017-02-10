

public class Main {
    public static void main(String[] args) {
        Expression e = new Sum(
                new Exponent(
                        new Number(2.0), new Number(3.0)),
                new Sum(
                        new Number(1.0), new Number(-3.0)) );
        System.out.println(e.toString() + " = " + e.evaluate());
        Exponent test = new Exponent( new Number(2.0), new Number(5.0));
//        Expression test1 = new Sum(new Exponent( new Number(2.0), new Number(5.0)), new Sum(new Number(0), new Number(0))  );
//        System.out.println(test.evaluate());
    }

}

interface Expression{
    double evaluate();
}

class Sum implements Expression{
    Number n1;
    Number n2;
    Sum(Number num1, Number num2){
        this.n1 = num1;
        this.n2 = num2;
    }
    Sum(Expression e1, Expression e2){
        this.n1 = new Number(e1.evaluate());
        this.n2 = new Number(e2.evaluate());
    }


    @Override
    public double evaluate() {
        return n1.number + n2.number;
    }
}

class Exponent implements Expression{
    Number n1;
    Number n2;
    Exponent(Number num1, Number num2){
        this.n1 = num1;
        this.n2 = num2;
    }
    //    Exponent(Expression e1, Expression e2){
//        this.n1 = new Number(e1.evaluate());
//        this.n2 = new Number(e2.evaluate());
//    }
    @Override
    public double evaluate() {
        return Math.pow(n1.number, n2.number);
    }
}


class Number{
    double number;
    Number(double num){
        this.number = num;
    }
}