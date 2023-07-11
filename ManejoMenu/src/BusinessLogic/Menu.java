package BusinessLogic;

import java.util.Scanner;

public class Menu {

    public Menu() {
        login();

        MostrarOpciones();
    }

    /**
     * 
     */
    public void MostrarOpciones() {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("----Menu");
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Opcion 4");
            System.out.println("Elige una opcion");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intentelo de nuevo.");
                    break;
            }
            System.out.println();
        } 
        while (opcion != 4);
        entrada.close();
    }

    public void Saludar() {
        System.out.print("Hola");
    }

    public void login() {
        Scanner entrada = new Scanner(System.in);

        String vlUsuario = "";
        String vlClave = "";

        System.out.println("Por favor ingrese sus credenciales");
        System.out.println("Ingrese su usuario");
        vlUsuario = entrada.next();
        System.out.println("Ingrese su contraseña");
        vlClave = entrada.next();

        Seguridad vlSeguridad = new Seguridad();

        Boolean vlResultado = vlSeguridad.buscarPorUsuarioYClave(vlUsuario, vlClave);
        if (vlResultado) {
            System.out.println("Bienvenido");
            MostrarOpciones();
        } else {
            System.out.println("Credenciales incorrectas");
        }
        entrada.close();

    }

}
