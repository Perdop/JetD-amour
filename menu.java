import java.util.Scanner;
public class menu extends geometriaEspacial {
    boolean state = true;

    public static void main(String[] args) {
        Escolha esc = new Escolha();
        boolean val = false;
        while(val == false) {
            int opc = esc.opcao();
            val = esc.escolher(opc);
        }    
        }
        
    }
