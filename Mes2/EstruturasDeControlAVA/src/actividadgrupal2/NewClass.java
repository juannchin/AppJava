//SINTAXIS DE LA ESTRUCTRA WHILE
package actividadgrupal2;

public class NewClass {
    public static void main(String[] args) {
        System.out.println("Sintaxis de la estructra WHILE");
                                            												  
	//EJEMPLO 1
            System.out.println("**Ejemplo 1**");
            System.out.println("================");
            System.out.println("Imprimir dias de la semana");
            System.out.println("");

            String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

            int x = 0;

            // Salir cuando x llega a ser mayor que 7
            while (x <= 6)
            {
                System.out.println("Hoy es el dia: " + dias[x]);
                x++;
            }
												
	
    }
}