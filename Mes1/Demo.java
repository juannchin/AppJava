import java.util.Scanner;
class Demo {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);
	int edad;
	String nombres;
	double salario;
	boolean estado;

	nombres	= "Juan Garay";
	salario	= 100;
	estado = true;

	System.out.println("Ingrese o digite el nombre del usuario");
	nombres = leer.nextLine();

        System.out.println("Hola Mundo");
        System.out.println("El nombre es: " + nombres);
        //System.out.println("El edad es: " + edad);
	System.out.println("El salario es: " + salario);
	System.out.print("Estado de ingreso al sistema es: " + estado);
    }
 
}