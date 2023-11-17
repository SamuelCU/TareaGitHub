import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Calculadora, suma y resta, Samuel Cuti
        Scanner dato = new Scanner(System.in);

        System.out.println("Calculadora....");

        // Solicitar los operandos al usuario
        System.out.print("Ingrese el primer número: ");
        double numero1 = dato.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = dato.nextDouble();

        // Mostrar menú de operaciones
        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
	System.out.println("3. Multiplicación");

        // Leer la opción del usuario
        int opcion = dato.nextInt();

        // Realizar la operación seleccionada
        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
	    case 3:
		resultado = numero1 * numero2;
		System.out.println("Resultado de la multiplicación: " + resultado);
		break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
