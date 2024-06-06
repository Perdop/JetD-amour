public class geometriaPlana {
    public double gPTrapezio(double a, double b, double c){
        return (a + b)* c / 2;
    }
    public double gPParalelogramo(double a, double b){
        return a * b;
    }
    public double gPQuadrilatero(double a, double b){
        return a * b;
    }
    public double gPLosangulo(double a, double b){
        return (a * b) / 2;
    }
    public double gPTriangulo(double a, double b){
        return (a * b) / 2;
    }
    public double gPCirculo(double a){
        return 3.14*(a*a);
    }

    public static void main(String[] args) {
    }
}
