import java.util.Scanner;

/**
 * HolaMundo 
 */
public class HolaMundo {

    public static void main(String[] args) {        
        System.out.println("Hola Juanse!");
        System.out.print("Como van las cosas?");

        System.out.printf("Aqui va una cadena:  %s%n","Juanse");
        System.out.printf("Aqui va un entero:  %d%n",10);
        System.out.printf("Mi nombre completo es %s y tengo %d años%n","Juanse", 15);

        var entrada = new Scanner(System.in);
        System.out.println("Ingrese Un numero porfavor");
        var entero = entrada.nextInt();

        System.out.println(entero);

        entrada.close();

        var nombre = new Scanner(System.in);
        System.out.print("Ingrese su nombre completo porfavor");
        var completo = nombre.nextInt();

        System.out.println(completo);

        nombre.close();
    }
} 
