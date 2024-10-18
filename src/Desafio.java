import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("******************************************");
        System.out.println("\nNombre: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: $" +saldo);
        System.out.println(" \n******************************************");

        String menu = """
                *** Escriba el número de la opción deseada
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir                
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion !=9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actual es: $" + saldo );
                    break;
                case 2:
                    System.out.println("¿Cantidad a retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo actual es: $" + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Cantidad a depositar");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El saldo actual es: $" + saldo);
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }
    }
}

