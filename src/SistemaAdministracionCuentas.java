import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        boolean salir = false;
        //comenzar la iteracion con el menu
        while (!salir){
            System.out.print("""
                    ***Sistema de Administracion de cuentas***
                    Menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Escoje una opcion:\s
                    """);
            int opcion = consola.nextInt();
            //evaluar cada opcion
            switch (opcion) {
                case 1 -> System.out.println("Creando tu cuenta...\n");
                case 2 -> System.out.println("Eliminando tu cuenta...\n");
                case 3 -> {
                    System.out.println("Saliendo del sistema, Hasta la proxima...");
                    salir = true;
                }
                default -> System.out.println("opcion invalida ");

            }


        }
        System.out.println("Fin del sistema de Administracion de cuentas.");

    }
}

