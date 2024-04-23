public class geometriaPlana {
    double a = 2;
    double b = 3;
    double c = 4;
    double d;
    double e;

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
    public double gPCirculo(double a, double b){
        return 3.14*(a*a);
    }

    public static void main(String[] args) {
        geometriaPlana gP = new geometriaPlana();
        System.err.println(gP.gPTrapezio(gP.a, gP.b, gP.c));
        System.err.println(gP.gPParalelogramo(gP.a, gP.b));
        System.err.println(gP.gPQuadrilatero(gP.a, gP.b));
        System.err.println(gP.gPLosangulo(gP.a, gP.b));
        System.err.println(gP.gPTriangulo(gP.a, gP.b));
        System.err.println(gP.gPCirculo(gP.a, gP.b));
    }
}
