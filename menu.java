import java.util.Scanner;
public class menu extends geometriaEspacial {
    boolean state = true;

    public static void main(String[] args) {
        menu menu = new menu();
        Scanner scanner = new Scanner(System.in);
        
        menu.state = scanner.nextBoolean();
    }
}
