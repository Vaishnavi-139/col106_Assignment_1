
import java.lang.Math;

public class MethodOverloading extends AbstractMethodOverloading {
    public double calculate(int a){
        double area = a* a;
        return area;
    }
//Returns area of a square with side a.
    public double calculate(int a, int b){
        double area = a *b;
        return area;
    }
//Returns area of a rectangle with sides a, b.
    public double calculate(int a, int b, int c){
        double s= (a+b+c)/2.0;
        double sa= s-a;
        double sb= s-b;
        double sc= s-c;
        double area = Math.sqrt(s*sa*sb*sc);
        return area;

    }
//Returns area of a triangle with sides a, b ,c.
}
