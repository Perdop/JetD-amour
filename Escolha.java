import java.util.Scanner;
public class Escolha extends menu{
    public boolean escolher(int escolha) {
        int selection = 0;
        int selection2 = 0;
        Scanner sc = new Scanner(System.in);
        geometriaPlana plana = new geometriaPlana();
        geometriaEspacial esp = new geometriaEspacial();

        switch (escolha) {
        case 1:
            System.out.println("Geometria Plana: \nTrapezio(1) \nParalelogramo(2) \nQuadrilatero(3) \nLosangulo(4) \nTriangulo(5) \nCirculo(6)");
            selection = sc.nextInt();
            switch(selection){
                case 1: System.out.println("Formula(a + b)* c / 2), digite os numeros para a,b,c em sequência");
                double x1 = sc.nextDouble();
                double y1 = sc.nextDouble();
                double z1 = sc.nextDouble();
                System.out.println(plana.gPTrapezio(x1,y1,z1));
                break;
                case 2: System.out.println("Formula(a * b), digite os numeros para a,b em sequência");
                double x2 = sc.nextDouble();
                double y2 = sc.nextDouble();
                System.out.println(plana.gPParalelogramo(x2,y2));
                break;
                case 3: System.out.println("Formula(a * b), digite os numeros para a,b em sequência");
                double x3 = sc.nextDouble();
                double y3 = sc.nextDouble();
                System.out.println(plana.gPQuadrilatero(x3,y3));
                break;
                case 4: System.out.println("Formula((a * b) / 2), digite os numeros para a,b em sequência");
                double x4 = sc.nextDouble();
                double y4 = sc.nextDouble();
                System.out.println(plana.gPLosangulo(x4,y4));
                break;
                case 5: System.out.println("Formula((a * b) / 2), digite os numeros para a,b em sequência");
                double x5 = sc.nextDouble();
                double y5 = sc.nextDouble();
                System.out.println(plana.gPTriangulo(x5,y5));
                break;
                case 6: System.out.println("Formula(3.14*(a*a)), digite os numeros para a,b em sequência");
                double x6 = sc.nextDouble();
                System.out.println(plana.gPParalelogramo(x6,x6));
                break;
            }
            return true;
        case 2:
        System.out.println("Geometria Espacial: \nPrismas(1) \nPiramideCone(2) \nEsfera(3) \nTronco(4)");
        selection2 = sc.nextInt();
        switch(selection2){
            case 1: System.out.println("Formula(a*b)* c / 2), digite os numeros para a,b,c em sequência");
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            System.out.println(esp.gEPrismas(x1,y1));
            break;
            case 2: System.out.println("Formula((a*b)/3), digite os numeros para a,b em sequência");
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            System.out.println(esp.gEPiramideCone(x2,y2));
            break;
            case 3: System.out.println("Formula(4/3*3.14*(a*a*a)), digite os numeros para a,b em sequência");
            double x3 = sc.nextDouble();
            System.out.println(esp.gEEsfera(x3));
            break;
            case 4: System.out.println("Formula((a*3.14*((b*b)+b*c+(c*c)))/3), digite os numeros para a,b em sequência");
            double x4 = sc.nextDouble();
            double y4 = sc.nextDouble();
            double z4 = sc.nextDouble();
            System.out.println(esp.gETronco(x4,y4,z4));
            break;
        }
            return true;
        default:
            System.out.println("Opção inválida" + "\n" + "Por favor, escolha uma opção valida.");
        }
        return false;

    }

    public int opcao(){
        System.out.println("Escolha uma opção: \nGeometria Plana(1) \nGeometria Espacial(2) \nSair(3)");
        Scanner sc = new Scanner(System.in);
        int escolha = sc.nextInt();
        return escolha;
    }
}
