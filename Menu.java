import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Bienvenido a la radio Swiftie, por favor selecciona una opción ");
        System.out.println("1. Ver estado de la radio");
        System.out.println("2. Encender la radio");
        System.out.println("3. Salir");
        int opcion = Integer.parseInt(leer.nextLine());

        if (opcion == 1) {
            System.out.println();
            getState radio = new getState();
            radio.status();
        } else if (opcion == 2) {
            System.out.println();
            tooglePowerOffOn.main(args);
        }
        leer.close();
    }
}
