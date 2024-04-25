public class geometriaEspacial extends geometriaPlana {

    public double gEPrismas(double a, double b){
        // a = area da base, b = altura
        return a*b;
    }
    public double gEPiramideCone(double a, double b){
        // a = area da base, b = altura
        return (a*b)/3;
    }
    public double gEEsfera(double a){
        // a = raio
        return 4/3*3.14*(a*a*a);
    }
    public double gETronco(double a, double b, double c){
        // a = altura, b = raio menor, c = raio maior
        return (a*3.14*((b*b)+b*c+(c*c)))/3;
    }
    
}
