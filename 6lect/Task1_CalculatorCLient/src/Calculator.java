public class Calculator {

    public void sum(double a, double b){
       double summ = a+b;
        System.out.printf("%.3f\n", summ);
    }
    public void subtract(double a, double b){
        double result = a-b;
        System.out.printf("%.3f\n", result);
    }
    public void multiply(double a, double b){
        double result = (a*b);
        System.out.printf("%.3f\n", result);
    }
    public void divide(double a, double b){
        double result = (a/b);
        System.out.printf("%.3f\n", result);
    }
    public void percentage(double a, double b){
        double result = ((a/100)*b);
        System.out.printf("%.3f\n", result);
    }
}
