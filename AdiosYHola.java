import java.util.Scanner;

public class AdiosYHola {
     public static void main(String[] args) {
     var entrada = new Scanner(System.in);

     System.out.println(" Bienvenido al Programa ");

     System.out.print("Escriba la Primer palabra : ");
     var palabra1= entrada.nextLine();
     System.out.print("Escriba la Segunda palabra : ");
     var palabra2= entrada.nextLine();
     System.out.print("Escriba la Tercer palabra : ");
     var palabra3= entrada.nextLine();

     System.out.println(palabra1 + " " + palabra2 + " " + palabra3); 

     entrada.close(); 
    };
}
