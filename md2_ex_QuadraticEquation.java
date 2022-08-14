public class md2_ex_QuadraticEquation {
    double a;
    double b;
    double c;

    public md2_ex_QuadraticEquation(){
    }

    public md2_ex_QuadraticEquation( double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscriminant(){
        return b*b -4*a*c;
    }
}



