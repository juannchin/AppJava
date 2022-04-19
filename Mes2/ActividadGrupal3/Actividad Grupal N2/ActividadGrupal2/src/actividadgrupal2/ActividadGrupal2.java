
package actividadgrupal2;
import java.util.Scanner;
import java.util.ArrayList;

public class ActividadGrupal2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int contador = 100;
        int opcionMenu = 1;
        
        do {
            System.out.println("");
            System.out.println("**************************************");
            System.out.println("-: **** BIENVENIDO/A AL SISTEMA *** :-");
            System.out.println("**************************************");
            System.out.println("");
            System.out.println("1 - Indice de temas");
            System.out.println("2 - Acerca de");
            System.out.println("3 - Salir del sistema");
            System.out.println("Favor ingrese su opcion: "); 	
            opcionMenu = leer.nextInt();
            leer.nextLine();

            System.out.println("");
            
               switch (opcionMenu) {
                case 1:
                    do {
                        System.out.println("");
                        System.out.println("**************************************");
                        System.out.println("-: ****    INDICE DE TEMAS       *** :-");
                        System.out.println("**************************************");
                        System.out.println("");
                        System.out.println("1 - Estructura if 28/01/2021");
                        System.out.println("2 - Estructura switch 31/01/2021");
                        System.out.println("3 - Estructura while 04/02/2021");
                        System.out.println("4 - Estructura Dowhile 07/02/2021");
                        System.out.println("5 - Estructura for 11/02/2021");
                        System.out.println("6 - Estructura de datos Array 28/02/2021");
                        System.out.println("7 - Regresar al menu");
                        System.out.println("");
                        System.out.println("Favor ingrese su opcion: "); 
                        opcionMenu = leer.nextInt();
                        leer.nextLine();
                        
                        switch (opcionMenu) {
                            case 1:
                                //if
                                do {
                                    System.out.println("");
                                    System.out.println("**************************************");
                                    System.out.println("-: ****    ESTRUCTURA IF       *** :-");
                                    System.out.println("**************************************");
                                    System.out.println("");
                                    System.out.println("1 - Sintaxis");
                                    System.out.println("2 - Ejemplos");
                                    System.out.println("3 - Regresar al menu de temas");
                                    System.out.println("4 - Regresar al menu Principal");

                                    System.out.println("");
                                    System.out.println("Favor ingrese su opcion: "); 
                                    opcionMenu = leer.nextInt();
                                    leer.nextLine();
                                    
                                    switch (opcionMenu) {
                                        case 1:
                                            //Sintaxis
                                            System.out.println("");
                                            System.out.println("-: **** SINTAXIS ESTRUCTURA IF **** :-");
                                            System.out.println("");
                                            System.out.println("SELECTIVA SIMPLE");
                                            System.out.println("if(condicion){\n\tbloque de instrucciones \n}");
                                            System.out.println("");
                                            System.out.println("SELECTIVA DOBLE");
                                            System.out.println("if(condicion){\n\tbloque de instruciones 1\n}\n"
                                            + "else {\n\tbloque de instrucciones 2\n}");
                                            System.out.println("");
                                            System.out.println("SELECTIVA ANIDADA");
                                            System.out.println("if(condicion 1){\n\tbloque de instruciones 1 \n}\n"
                                                           + "else if(condicion 2){\n\tbloque de intrucciones 2\n}\n"
                                                           + "else{\n\tbloque de intruciones 3\n}");
                                            System.out.println("");
                                            break;
                                        case 2 :
                                            //ejemplos
                                            do {
                                                System.out.println("");
                                                System.out.println("**************************************");
                                                System.out.println("-: **** EJEMPLOS ESTRUCTURA IF   *** :-");
                                                System.out.println("**************************************");
                                                System.out.println("");
                                                System.out.println("1 - Ejemplo 1");
                                                System.out.println("2 - Ejemplo 2");
                                                System.out.println("3 - Ejemplo 3");
                                                System.out.println("4 - Ejemplo 4");
                                                System.out.println("5 - Ejemplo 5");
                                                System.out.println("6 - Regresar al menu de sintaxis y ejemplos");
                                                System.out.println("7 - Regresar al menu de temas");
                                                System.out.println("8 - Regresar al menu Principal");

                                                System.out.println("");
                                                System.out.println("Favor ingrese su opcion: "); 
                                                opcionMenu = leer.nextInt();
                                                leer.nextLine();
                                                
                                                switch (opcionMenu) {
                                                    case 1:
                                                        System.out.println("** Ejemplo 1 **");
                                                        System.out.println("================");
                                                        System.out.println("Ejercicio notas");
                                                        System.out.println("");

                                                        System.out.print("Ingrese al nota final de PROG3: ");
                                                        double notaFinal = leer.nextDouble();
                                                        leer.nextLine();

                                                        if(notaFinal >= 0 && notaFinal <= 10)
                                                        {
                                                            if(notaFinal < 6.0)
                                                            {
                                                                System.out.println("Estado: Reprobado");
                                                            }
                                                            else
                                                            {
                                                                System.out.println("Estado: Aprobado");
                                                            }					

                                                            if(notaFinal <= 2.0)
                                                            {
                                                                System.out.println("Estado: Necesita cambiar de carrera");
                                                            }
                                                            else if(notaFinal <= 4.0)
                                                            {
                                                                System.out.println("Estado: Necesita mejorar");
                                                            }
                                                            else if(notaFinal <= 6.0)
                                                            {				
                                                                System.out.println("Estado: Bueno");
                                                            }
                                                            else if(notaFinal <= 8.0)
                                                            {
                                                                System.out.println("Estado: Muy bueno");
                                                            }
                                                            else
                                                            {
                                                                System.out.println("Estado: Excelente");
                                                            }			
                                                        }
                                                        else
                                                        {
                                                            System.out.println("Error, nota no válida...");
                                                        }
                                                    break;
                                                    case 2:
                                                        System.out.println("** Ejemplo 2 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        System.out.print("Ingresa tu año de nacimiento para determinar tu edad y si eres mayor o menor de edad: ");
                                                        int anioNacido = leer.nextInt();
                                                        leer.nextLine();
                                                        
                                                        System.out.println(" ");
                                                        int resultado  = 2022-anioNacido;
                                                        if(anioNacido <=2022){
                                                            if(resultado <= 17){
                                                                System.out.println("Tu tienes una edad de, "+resultado+" años");
                                                                System.out.println("Eres menor de edad ");
                                                                System.out.println(" ");
                                                            }else{
                                                                System.out.println("Tu tienes una edad de, "+resultado+" años");
                                                                System.out.println("Eres mayor de edad ");
                                                                System.out.println(" ");
                                                            }
                                                        }else{
                                                            System.out.println("has ingresado un año mayor al actual ,2022");
                                                        }
                                                    break;
                                                    case 3:
                                                        System.out.println("** Ejemplo 3 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        System.out.println("Ejercicios Dias");
							System.out.println("");
										
                                                        System.out.print("Ingrese el numero del dia entre 1 y 7: ");
                                                        int dia = leer.nextInt();
                                                        leer.nextLine();
                                                        System.out.println("");

                                                        if(dia==1){
                                                            System.out.println("El dia corresponde a lunes");
                                                        }
                                                        else if(dia==2){
                                                            System.out.println("El dia corresponde a martes");
                                                        }
                                                        else if(dia==3){
                                                            System.out.println("El dia corresponde a miercoles");
                                                        }
                                                        else if(dia==4){
                                                            System.out.println("El dia corresponde a jueves");
                                                        }
                                                        else if(dia==5){
                                                            System.out.println("El dia corresponde a viernes");
                                                        }
                                                        else if(dia==6){
                                                            System.out.println("El dia corresponde a sabado");
                                                        }
                                                        else if(dia==7){
                                                            System.out.println("El dia corresponde a domingo");
                                                        }
                                                        else{
                                                            System.out.println("Numero de dia no valido, ingrese valores de 1  a 7 ");
                                                        }
                                                    break;
                                                    case 4:
                                                        System.out.println("** Ejemplo 4 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");

                                                        int num;

                                                        System.out.println("Ingrese un numero entero para determinar si es par o impar");
                                                        num = leer.nextInt();
                                                        leer.nextLine();
                                                        
                                                        if((num%2)==0)
                                                            System.out.println( "PAR");
                                                        else 
                                                            System.out.println(" IMPAR");
                                                        System.out.println(" ");
                                                    break;
                                                    case 5:
                                                        System.out.println("** Ejemplo 5 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        System.out.println("Este programa solicita una hora en valor entero y te  saluda con buenos o buenas noches segun la hora ingresada");
                                                        System.out.println(" ");
                                                        int Hora ;
                                                        System.out.println("Hola joven ingrese la hora (un valor entero):");
                                                        Hora = leer.nextInt();
                                                        leer.nextLine();
                                                        
                                                        if(Hora >= 0 && Hora  <= 12 )
                                                            System.out.println(" hola buenos Dias ");
                                                        else if ( Hora >= 12 && Hora <= 21)
                                                           System.out.println( " hola Buenas tardes ♥");
                                                        else if ( Hora >=21 && Hora <= 24)
                                                            System.out.println( " hola Buenas noches ");
                                                        else 
                                                             System.out.println( " que carajos has ingresado una hora no valida ");
                                                    break;
                                                    case 6:
                                                        //salir al menu sintaxis y ejemplos
                                                        opcionMenu = 9;
                                                        contador = 1000;
                                                    break;
                                                    case 7:
                                                        //salir al menu de temas
                                                        opcionMenu = 9;
                                                        contador = 100;
                                                    break;
                                                    case 8:
                                                        opcionMenu = 9;
                                                        contador =10;
                                                    break;

                                                    default:
                                                        System.out.println("Rango no existe!");
                                                        opcionMenu=4;
                                                    break;
                                                }
                                                
                                            } while (opcionMenu <=8);
                                        break;
                                        case 3 :
                                            //Regresar al menu de temas
                                            opcionMenu = 6;
                                            contador = 100;
                                        break;
                                        case 4:
                                            //Regresar al menu principal
                                            opcionMenu = 8;
                                            contador =10;
                                        break;
                                        
                                        default:
                                            System.out.println("Opción no encontradaa!");
                                            opcionMenu = 4;
                                        break;
                                    }
                                    
                                } while (opcionMenu <=4 || contador ==1000);
                                
                                break;
                            case 2:
                                //switch
                                do {
                                    System.out.println("");
                                    System.out.println("**************************************");
                                    System.out.println("-: ****    ESTRUCTURA SWITCH       *** :-");
                                    System.out.println("**************************************");
                                    System.out.println("");
                                    System.out.println("1 - Sintaxis");
                                    System.out.println("2 - Ejemplos");
                                    System.out.println("3 - Regresar al menu de temas");
                                    System.out.println("4 - Regresar al menu Principal");

                                    System.out.println("");
                                    System.out.println("Favor ingrese su opcion: "); 
                                    opcionMenu = leer.nextInt();
                                    leer.nextLine();
                                    
                                    switch (opcionMenu) {
                                        case 1:
                                            //Sintaxis
                                            System.out.println("-: **** SINTAXIS DE ESTRUCTURA SWITCH **** :-");
                                            System.out.println("");
                                            System.out.println("variable = valorInicial");
                                            System.out.println("");
                                            System.out.println("switch(variable)");
                                            System.out.println("{");
                                            System.out.println("    case valor1:");
                                            System.out.println("        instrucciones valor1;");
                                            System.out.println("    break;");
                                            System.out.println("    case valor2:");
                                            System.out.println("        instrucciones valor2;");
                                            System.out.println("    break;");
                                            System.out.println("    case valorN:");
                                            System.out.println("        instrucciones valorN;");
                                            System.out.println("    break;");
                                            System.out.println("    default:");
                                            System.out.println("        instrucciones para valor default;");
                                            System.out.println("    break;");
                                            System.out.println("}");
                                            break;
                                        case 2 :
                                            //ejemplos
                                            do {
                                                System.out.println("");
                                                System.out.println("**************************************");
                                                System.out.println("-: **** EJEMPLOS SWITCH   *** :-");
                                                System.out.println("**************************************");
                                                System.out.println("");
                                                System.out.println("1 - Ejemplo 1");
                                                System.out.println("2 - Ejemplo 2");
                                                System.out.println("3 - Ejemplo 3");
                                                System.out.println("4 - Ejemplo 4");
                                                System.out.println("5 - Ejemplo 5");
                                                System.out.println("6 - Regresar al menu de sintaxis y ejemplos");
                                                System.out.println("7 - Regresar al menu de temas");
                                                System.out.println("8 - Regresar al menu Principal");

                                                System.out.println("");
                                                System.out.println("Favor ingrese su opcion: "); 
                                                opcionMenu = leer.nextInt();
                                                leer.nextLine();
                                                
                                                switch (opcionMenu) {
                                                    case 1:
                                                         //EJERCICIO 1 DE ESTRUCTURA DE CONTROL SELECTIVA SWITCH
                                                        int saborPizza;
                                                        System.out.println("** Ejemplo 1 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        System.out.println("Ordena tu sabor de pizza favorita");
                                                        System.out.println("");
                                                        System.out.println("¿Que sabor de pizza deseas ordenar hoy? : ");
                                                        System.out.println("1- Hawaiana");
                                                        System.out.println("2- Peperoni");
                                                        System.out.println("3- Meet Lover");
                                                        System.out.println("4- Hot Cheese");
                                                        System.out.println("5- 3 Quesos");
                                                        System.out.println("Digitar cualquier otra opcion para regresar al menu de seleccion Switch");
                                                        System.out.print("Ingrese su opcion: ");
				
                                                        saborPizza = leer.nextInt();
                                                        leer.nextLine();
                                                        
                                                        System.out.println("");

                                                        switch(saborPizza){
                                                            case 1:
                                                                System.out.println("Se te enviara una pizza Hawaiana en breves minutos!!!");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                            case 2:
                                                                System.out.println("Se te enviara una pizza de Peperoni en breves minutos!!!");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                                break;
                                                            case 3:
                                                                System.out.println("Se te enviara una pizza Meet Lover en breves minutos!!!");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                            case 4:
                                                                System.out.println("Se te enviara una pizza Hot Cheese en breves minutos!!!");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                            case 5:
                                                                System.out.println("Se te enviara una pizza 3 Quesos en breves minutos!!!");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                            default:
                                                                System.out.println("Regresando a Menu Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                        }//CIERRE DEL EJERCICIO 1 
                                                    break;
                                                    case 2:
                                                        //EJERCICIO 2 DE ESTRUCTURA DE CONTROL SELECTIVA SWITCH
                                                        int pelicula;
                                                        System.out.println("** Ejemplo 2 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        System.out.println("Reserva boleto de peliculas en cartelera");
                                                        System.out.println("");
                                                        System.out.println("¿Que pelicula deseas reservar boletos? : ");
                                                        System.out.println("1- Titanic");
                                                        System.out.println("2- Batman");
                                                        System.out.println("3- Avengers");
                                                        System.out.println("4- Interstellar");
                                                        System.out.println("5- Toy Story");
                                                        System.out.println("Digitar cualquier otra opcion para regresar al menu de seleccion Switch");
                                                        System.out.print("Ingrese su opcion: ");
                                                        pelicula = leer.nextInt();
                                                        leer.nextLine();
                                                        System.out.println("");

                                                        switch(pelicula){
                                                            case 1:
                                                                System.out.println("Se ha reservado tu boleto para la pelicula Titanic");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                            case 2:
                                                                System.out.println("Se ha reservado tu boleto para la pelicula Batman");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                            case 3:
                                                                System.out.println("Se ha reservado tu boleto para la pelicula Avengers");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                            case 4:
                                                                System.out.println("Se ha reservado tu boleto para la pelicula Interstellar");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                            case 5:
                                                                System.out.println("Se ha reservado tu boleto para la pelicula Toy Story");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                            default:
                                                                System.out.println("Regresando a Menu Switch");
                                                            break;
                                                        }//CIERRE DE CASE DE EJERCICIO 2 DE ESTRUCTURA DE CONTROL SELECTIVA SWITCH
                                                    break;
                                                    case 3:
                                                        //EJERCICIO 3 DE ESTRUCTURA DE CONTROL SELECTIVA SWITCH
                                                        int lavaderia;
                                                        System.out.println("** Ejemplo 3 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        System.out.println("Selecciona dia para tu proxima visita a la lavanderia");
                                                        System.out.println("");
                                                        System.out.println("¿Que dias deseas volver a la lavanderia? : ");
                                                        System.out.println("1- Lunes");
                                                        System.out.println("2- Martes");
                                                        System.out.println("3- Miercoles");
                                                        System.out.println("4- Jueves");
                                                        System.out.println("5- Viernes");
                                                        System.out.println("Digitar cualquier otra opcion para regresar al menu de seleccion Switch");
                                                        System.out.print("Ingrese su opcion: ");			
                                                        lavaderia = leer.nextInt();
                                                        leer.nextLine();
                                                        System.out.println("");

                                                        switch(lavaderia){
                                                            case 1:
                                                                System.out.println("Se ha reservado el dia LUNES para tu proxima visita a la lavanderia!");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                            case 2:
                                                                System.out.println("Se ha reservado el dia MARTES para tu proxima visita a la lavanderia!");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                            case 3:
                                                                System.out.println("Se ha reservado el dia MIERCOLES para tu proxima visita a la lavanderia!");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                            case 4:
                                                                System.out.println("Se ha reservado el dia JUEVES para tu proxima visita a la lavanderia!");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                            case 5:
                                                                System.out.println("Se ha reservado el dia VIERNES para tu proxima visita a la lavanderia!");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                            default:
                                                                System.out.println("Regresando a Menu Switch");
                                                            break;
                                                        }//CIERRE DE CASE DE EJERCICIO 3 DE ESTRUCTURA DE CONTROL SELECTIVA SWITCH
                                                    break;
                                                    case 4:
                                                        //EJERCICIO 4 DE ESTRUCTURA DE CONTROL SELECTIVA SWITCH
                                                        int pintura;
                                                        System.out.println("** Ejemplo 4 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        System.out.println("Escoje tu color favorito de pintura");
                                                        System.out.println("");
                                                        System.out.println("¿Que color de pintura desea comprar? : ");
                                                        System.out.println("1- Blanco");
                                                        System.out.println("2- Amarillo");
                                                        System.out.println("3- Celeste");
                                                        System.out.println("4- Verde");
                                                        System.out.println("5- Rojo");
                                                        System.out.println("Digitar cualquier otra opcion para regresar al menu de seleccion Switch");
                                                        System.out.print("Ingrese su opcion: ");			
                                                        pintura = leer.nextInt();
                                                        leer.nextLine();
                                                        System.out.println("");

                                                        switch(pintura){
                                                            case 1:
                                                                System.out.println("Usted ha comprado exitosamente un bote de pintura BLANCA");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                                break;
                                                            case 2:
                                                                System.out.println("Usted ha comprado exitosamente un bote de pintura AMARILLA");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                                break;
                                                            case 3:
                                                                System.out.println("Usted ha comprado exitosamente un bote de pintura CELESTE");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                                break;
                                                            case 4:
                                                                System.out.println("Usted ha comprado exitosamente un bote de pintura VERDE");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                                break;
                                                            case 5:
                                                                System.out.println("Usted ha comprado exitosamente un bote de pintura ROJO");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                                break;
                                                            default:
                                                                System.out.println("Regresando a Menu Switch");
                                                            break;
                                                        }//CIERRE DE CASE DE EJERCICIO 4 DE ESTRUCTURA DE CONTROL SELECTIVA SWITCH
                                                    break;
                                                    case 5:
                                                        //EJERCICIO 5 DE ESTRUCTURA DE CONTROL SELECTIVA SWITCH
                                                        int opinion;
                                                        System.out.println("** Ejemplo 5 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        System.out.println("Deja tu puntuacion sobre este sistema!");
                                                        System.out.println("");
                                                        System.out.println("¿Cual es tu opinion sobre este sistema? : ");
                                                        System.out.println("1- Malisimo");
                                                        System.out.println("2- Regular");
                                                        System.out.println("3- Basico");
                                                        System.out.println("4- Bueno");
                                                        System.out.println("5- Excelente");
                                                        System.out.println("Digitar cualquier otra opcion para regresar al menu de seleccion Switch");
                                                        System.out.print("Ingrese su opcion: ");
			
                                                        opinion = leer.nextInt();
                                                        leer.nextLine();
                                                        System.out.println("");

                                                        switch(opinion){
                                                            case 1:
                                                                System.out.println("Has calificado este sistema como: MALO");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                            case 2:
                                                                System.out.println("Has calificado este sistema como: REGULAR");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                            case 3:
                                                                System.out.println("Has calificado este sistema como: BASICO");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                            case 4:
                                                                System.out.println("Has calificado este sistema como: BUENO");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                            case 5:
                                                                System.out.println("Has calificado este sistema como: EXCELENTE");
                                                                System.out.println("");
                                                                System.out.println("Regresando al Menu principal de Switch");
                                                                System.out.println("------------------------------------------------------");
                                                                System.out.println("");
                                                            break;
                                                            default:
                                                                System.out.println("Regresando a Menu Switch");
                                                            break;
                                                        }//CIERRE DE CASE DE EJERCICIO 5 DE ESTRUCTURA DE CONTROL SELECTIVA SWITCH
                                                    break;
                                                    case 6:
                                                        //salir al menu sintaxis y ejemplos
                                                        opcionMenu = 9;
                                                        contador = 1000;
                                                    break;
                                                    case 7:
                                                        //salir al menu de temas
                                                        opcionMenu = 9;
                                                        contador = 100;
                                                    break;
                                                    case 8:
                                                        opcionMenu = 9;
                                                        contador =10;
                                                    break;
                                                    
                                                    default:
                                                        System.out.println("Rango no existe!");
                                                        opcionMenu=4;
                                                    break;
                                                }
                                                
                                            } while (opcionMenu <=8);
                                        break;
                                        case 3 :
                                            //Regresar al menu de temas
                                            opcionMenu = 6;
                                            contador = 100;
                                        break;
                                        case 4:
                                            //Regresar al menu principal
                                            opcionMenu = 9;
                                            contador =10;
                                        break;
                                        
                                        default:
                                            System.out.println("Opción no encontrada!");
                                            opcionMenu = 4;
                                        break;
                                    }
                                    
                                } while (opcionMenu <=4 || contador ==1000);
                            break;
                            case 3:
                                //while
                                do {
                                    System.out.println("");
                                    System.out.println("**************************************");
                                    System.out.println("-: ****    ESTRUCTURA WHILE       *** :-");
                                    System.out.println("**************************************");
                                    System.out.println("");
                                    System.out.println("1 - Sintaxis");
                                    System.out.println("2 - Ejemplos");
                                    System.out.println("3 - Regresar al menu de temas");
                                    System.out.println("4 - Regresar al menu Principal");

                                    System.out.println("");
                                    System.out.println("Favor ingrese su opcion: "); 
                                    opcionMenu = leer.nextInt();
                                    leer.nextLine();
                                    
                                    switch (opcionMenu) {
                                        case 1:
                                            //Sintaxis
                                            System.out.println("");
                                            System.out.println("-: **** SINTAXIS DE ESTRUCTURA WHILE **** :-");
                                            System.out.println("");
                                            System.out.println("variable = valorInicial;");
                                            System.out.println("");
                                            System.out.println("//Bloque de instrucciones que alteran el valor de la variable");
                                            System.out.println("");
                                            System.out.println("while(condicionLogica)");
                                            System.out.println("{");
                                            System.out.println("    bloque de instrucciones a ejecutar");
                                            System.out.println("    variable = incremento / decremento;" );
                                            System.out.println("");
                                            System.out.println("}");
                                            System.out.println("");
                                        break;
                                        case 2 :
                                            //ejemplos
                                            do {
                                                System.out.println("");
                                                System.out.println("**************************************");
                                                System.out.println("-: **** EJEMPLOS ESTRUCTURA WHILE   *** :-");
                                                System.out.println("**************************************");
                                                System.out.println("");
                                                System.out.println("1 - Ejemplo 1");
                                                System.out.println("2 - Ejemplo 2");
                                                System.out.println("3 - Ejemplo 3");
                                                System.out.println("4 - Ejemplo 4");
                                                System.out.println("5 - Ejemplo 5");
                                                System.out.println("6 - Regresar al menu de sintaxis y ejemplos");
                                                System.out.println("7 - Regresar al menu de temas");
                                                System.out.println("8 - Regresar al menu Principal");

                                                System.out.println("");
                                                System.out.println("Favor ingrese su opcion: "); 
                                                opcionMenu = leer.nextInt();
                                                leer.nextLine();
                                                
                                                switch (opcionMenu) {
                                                    case 1:
                                                        System.out.println("** Ejemplo 1 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
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
                                                    break;
                                                    case 2:
                                                        System.out.println("");
                                                        System.out.println("** Ejemplo 2 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        System.out.println("Mi paciencia tiene un limite");
                                                        System.out.println("");

                                                        x = 1;

                                                        // Salir cuando x llega a ser mayor que 7
                                                        while (x <= 100)
                                                        {
                                                            System.out.println("Mi paciencia está al: " + x +" porciento");
                                                            x++;
                                                        }
                                                    break;
                                                    case 3:
                                                        System.out.println("");
                                                        System.out.println("** Ejemplo 3 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        System.out.println("Calcular la tabla del 3");
                                                        System.out.println("");

                                                        x = 1;

                                                        // Salir cuando x llega a ser mayor que 7
                                                        while (x <= 10)
                                                        {
                                                            System.out.println("3 por "+ x + " es: " + 3*x +" ");
                                                            x++;
                                                        }
                                                    break;
                                                    case 4:
                                                        System.out.println("");
                                                        System.out.println("** Ejemplo 4 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        System.out.println("Top 5 de paises con mujeres más lindas del mundo");
                                                        System.out.println("");

                                                        String[] paises = {"El Salvador", "Estados Unidos", "Venezuela", "Mexico", "Ucrania"};

                                                        x = 4;

                                                        // Salir cuando x llega a ser mayor que 7
                                                        while (x >= 0)
                                                        {
                                                            int valor = x+1;
                                                            System.out.println("El TOP "+ valor + " de pais con mujeres mas lindas es: " + paises[x]+" ");
                                                            x--;
                                                        }
                                                    break;
                                                    case 5:
                                                        System.out.println("");
                                                        System.out.println("** Ejemplo 5 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        System.out.println("Los planetas del sistema solar son");
                                                        System.out.println("");

                                                        String[] planetas = {"Mercurio", "Venus", "La Tierra", "Martes", "Jupiter", "Saturno", "Urano", "Neptuno", "Pluton"};

                                                        x = 0;

                                                        // Salir cuando x llega a ser mayor que 7
                                                        while (x <= 8)
                                                        {
                                                            System.out.println("El primer planeta del sistema solar es: "+ planetas[x]);
                                                            x++;
                                                        }
                                                    break;
                                                    case 6:
                                                        //salir al menu sintaxis y ejemplos
                                                        opcionMenu = 9;
                                                        contador = 1000;
                                                    break;
                                                    case 7:
                                                        //salir al menu de temas
                                                        opcionMenu = 9;
                                                        contador = 100;
                                                    break;
                                                    case 8:
                                                        opcionMenu = 9;
                                                        contador =10;
                                                    break;
                                                    default:
                                                        System.out.println("Rango no existe!");
                                                        opcionMenu=8;
                                                    break;
                                                }    
                                            } while (opcionMenu <=8);
                                        break;
                                        case 3 :
                                            //Regresar al menu de temas
                                            opcionMenu = 6;
                                            contador = 100;
                                        break;
                                        case 4:
                                            //Regresar al menu principal
                                            opcionMenu = 9;
                                            contador =10;
                                        break;
                                        default:
                                            System.out.println("Opción no encontrada!");
                                            opcionMenu = 4;
                                        break;
                                    }       
                                } while (opcionMenu <=4 || contador ==1000);
                                break;
                            case 4:
                                //do while
                                do {
                                    System.out.println("");
                                    System.out.println("**************************************");
                                    System.out.println("-: ****    ESTRUCTURA DO WHILE       *** :-");
                                    System.out.println("**************************************");
                                    System.out.println("");
                                    System.out.println("1 - Sintaxis");
                                    System.out.println("2 - Ejemplos");
                                    System.out.println("3 - Regresar al menu de temas");
                                    System.out.println("4 - Regresar al menu Principal");

                                    System.out.println("");
                                    System.out.println("Favor ingrese su opcion: "); 
                                    opcionMenu = leer.nextInt();
                                    leer.nextLine();
                                    
                                    switch (opcionMenu) {
                                        case 1:
                                            //Sintaxis
                                            System.out.println("");
                                            System.out.println("-: **** SINTAXIS DE ESTRUCTURA DO WHILE **** :-");
                                            System.out.println("");
                                            System.out.println("variable = valorInicial;");
                                            System.out.println("");
                                            System.out.println("//Bloque de instrucciones que alteran el valor de la variable");
                                            System.out.println("");
                                            System.out.println("do");
                                            System.out.println("{");
                                            System.out.println("    bloque de instrucciones a ejecutar");
                                            System.out.println("    variable = incremento / decremento;" );
                                            System.out.println("");
                                            System.out.println("}while(condicionLogica);");
                                            System.out.println("");
                                            break;
                                        case 2 :
                                            //ejemplos
                                            do {
                                                System.out.println("");
                                                System.out.println("**************************************");
                                                System.out.println("-: **** EJEMPLOS ESTRUCTURA DO WHILE   *** :-");
                                                System.out.println("**************************************");
                                                System.out.println("");
                                                System.out.println("1 - Ejemplo 1");
                                                System.out.println("2 - Ejemplo 2");
                                                System.out.println("3 - Ejemplo 3");
                                                System.out.println("4 - Ejemplo 4");
                                                System.out.println("5 - Ejemplo 5");
                                                System.out.println("6 - Regresar al menu de sintaxis y ejemplos");
                                                System.out.println("7 - Regresar al menu de temas");
                                                System.out.println("8 - Regresar al menu Principal");

                                                System.out.println("");
                                                System.out.println("Favor ingrese su opcion: "); 
                                                opcionMenu = leer.nextInt();
                                                leer.nextLine();
                                                
                                                switch (opcionMenu) {
                                                    case 1:
                                                        System.out.println("");
                                                        System.out.println("** Ejemplo 1 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        int c=1, suma=0,n=0, men=0,may=0,igu=0;
                                                        double media=0;

                                                        System.out.println("");
                                                        System.out.println("Ingrese 10 numeros para calcular la media y determinar cuantos");
                                                        System.out.println("numeros son mayores que 10, cuantos son iguales y cuantos son menores");
                                                        System.out.println("");	
                                                        do{
                                                            System.out.println("Ingrese un numero ("+c+"/10): ");
                                                            n=leer.nextInt();
                                                            leer.nextLine();
                                                            c=c+1;
                                                            if (n==10){
                                                                    igu++;
                                                            }else{
                                                                if(n>10){
                                                                    may++;
                                                                }else{
                                                                    men++;
                                                                }
                                                            }
                                                            suma=suma+n;
                                                            media=suma/c;

                                                        }while (c<=10);

                                                        System.out.println("La media es " +(media) + " y " + (igu) + 
                                                        " son iguales a 10;  " + (may) + "  mayores a 10; " + (men) + " menores a 10");
                                                        System.out.println("");
                                                    break;
                                                    case 2:
                                                        int numero=0, factorial=1, num1=0;
                                                        System.out.println("");
                                                        System.out.println("** Ejemplo 2 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        System.out.print("Ingrese un numero para calcular su factorial: ");
                                                        numero=leer.nextInt();
                                                        leer.nextLine();

                                                        do{
                                                            num1=numero;

                                                            do{
                                                                factorial=factorial*numero;
                                                                numero--;
                                                            }while(numero > 0);

                                                            System.out.println("El factorial del numero "+num1+" es "+factorial+"\n");
                                                            System.out.println("Ingrese un numero mayor a cero para calcular su factorial"); 
                                                            System.out.print("o un numero negativo para salir :");
                                                            numero=leer.nextInt();
                                                            leer.nextLine();
                                                            factorial=1;
                                                        }while (numero>0);
                                                        System.out.println("");
                                                    break;
                                                    case 3:
                                                        int num, sum=0,resultado=0, i=1;
                                                        System.out.println("");
                                                        System.out.println("** Ejemplo 3 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        System.out.println("Digite 10 numeros para sumarlos");
                                                        System.out.print("Ingrese el primer numero: ");
                                                        num=leer.nextInt();
                                                        leer.nextLine();

                                                        do{
                                                            sum+=num;
                                                            i++;
                                                            System.out.print("Ingrese el siguiente numero: ");
                                                            num=leer.nextInt();
                                                            leer.nextLine();
                                                        }while (i<10);
                                                        
                                                        resultado+=sum;
                                                        System.out.println("\nLa suma de los numeros ingresados da un total de: "+resultado);
                                                        System.out.println("");
                                                    break;
                                                    case 4:
                                                        System.out.println("");
                                                        System.out.println("** Ejemplo 4 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        double number = 0.0;
                                                        String resp = "";

                                                        do{
                                                            System.out.println("Ingrese un numero para calcular su cubo y raiz cuadrada");
                                                            number=leer.nextDouble();
                                                            leer.nextLine();

                                                            System.out.println("El cubo del numero "+number+" es: "+Math.pow(number,3));

                                                            System.out.println("La raiz cuadrada del nuamero "+number+" es: "+Math.pow(number,0.5));

                                                            System.out.println("Desea continuar con los procesos?"+"\nEscribir \'si\' o \'no\'");
                                                            resp=leer.nextLine();

                                                        }while(resp.equals("si"));
                                                        System.out.println("");
                                                    break;
                                                    case 5:
                                                        System.out.println("");
                                                        System.out.println("** Ejemplo 5 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        System.out.println("CALCULO DE PROMEDIO DE 10 ALUMNOS: ");
                                                        int j=1;
                                                        double promedio=0.0,nota=0.0,total=0.0;

                                                        do{
                                                            System.out.print("Ingrese el valor del examen del alumno "+j+": ");
                                                            nota=leer.nextDouble();
                                                            leer.nextLine();
                                                            
                                                            total+=nota;
                                                            j++;
                                                        }while(j<=10);
                                                        
                                                        promedio=total/10;
                                                        System.out.println("=================================");
                                                        System.out.println("\tResultados: "+promedio);
                                                        System.out.println("=================================");
                                                        System.out.println("");
                                                    break;
                                                    case 6:
                                                        //salir al menu sintaxis y ejemplos
                                                        opcionMenu = 9;
                                                        contador = 1000;
                                                    break;
                                                    case 7:
                                                        //salir al menu de temas
                                                        opcionMenu = 9;
                                                        contador = 100;
                                                    break;
                                                    case 8:
                                                        opcionMenu = 9;
                                                        contador =10;
                                                    break;
                                                    default:
                                                        System.out.println("Rango no existe!");
                                                        opcionMenu=8;
                                                    break;
                                                }   
                                            } while (opcionMenu <=8);
                                        break;
                                        case 3 :
                                            //Regresar al menu de temas
                                            opcionMenu = 9;
                                            contador = 100;
                                        break;
                                        case 4:
                                            //Regresar al menu principal
                                            opcionMenu = 9;
                                            contador =10;
                                        break;
                                        
                                        default:
                                            System.out.println("Opción no encontrada!");
                                            opcionMenu = 4;
                                        break;
                                    }  
                                } while (opcionMenu <=4 || contador ==1000);
                                break;
                                
                            case 5:
                                // for
                                do {
                                    System.out.println("**************************************");
                                    System.out.println("-: ****    ESTRUCTURA FOR       *** :-");
                                    System.out.println("**************************************");
                                    System.out.println("");
                                    System.out.println("1 - Sintaxis");
                                    System.out.println("2 - Ejemplos");
                                    System.out.println("3 - Regresar al menu de temas");
                                    System.out.println("4 - Regresar al menu Principal");

                                    System.out.println("");
                                    System.out.println("Favor ingrese su opcion: "); 
                                    opcionMenu = leer.nextInt();
                                    leer.nextLine();
                                    
                                    switch (opcionMenu) {
                                        case 1:
                                            //Sintaxis
                                            System.out.println("");
                                            System.out.println("-: **** SINTAXIS DE ESTRUCTURA FOR **** :-");
                                            System.out.println("");
                                            System.out.println("for(variable=valorInicial; condicionLogica; incremento/decremento){\n" +
                                            "   Bloque de instrucciones a repetir\n" +
                                            "}"); 
                                        break;
                                        case 2 :
                                            //ejemplos
                                            do {
                                                System.out.println("**************************************");
                                                System.out.println("-: **** EJEMPLOS ESTRUCTURA FOR   *** :-");
                                                System.out.println("**************************************");
                                                System.out.println("");
                                                System.out.println("1 - Ejemplo 1");
                                                System.out.println("2 - Ejemplo 2");
                                                System.out.println("3 - Ejemplo 3");
                                                System.out.println("4 - Ejemplo 4");
                                                System.out.println("5 - Ejemplo 5");
                                                System.out.println("6 - Regresar al menu de sintaxis y ejemplos");
                                                System.out.println("7 - Regresar al menu de temas");
                                                System.out.println("8 - Regresar al menu Principal");

                                                System.out.println("");
                                                System.out.println("Favor ingrese su opcion: "); 
                                                opcionMenu = leer.nextInt();
                                                leer.nextLine();
                                                
                                                switch (opcionMenu) {
                                                    case 1:
                                                        System.out.println("");
                                                        System.out.println("** Ejemplo 1 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        System.out.println("Secuencia de numeros pares del 1 al 10 ");
							for (int contadorPar = 0; contadorPar <= 10; contadorPar=contadorPar+2){
                                                            System.out.println(contadorPar);
							}
                                                    break;
                                                    case 2:
                                                        System.out.println("");
                                                        System.out.println("** Ejemplo 2 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        int numeroEntero;
                                                        System.out.print("Introduce un número entero: ");
							numeroEntero = leer.nextInt();
                                                        leer.nextLine();
                                                        
							System.out.println("\nNumeros del 1 al " + numeroEntero + ": ");
							for (int contadorNE = 1; contadorNE <= numeroEntero; contadorNE++) {
                                                            System.out.println(contadorNE);
							}
                                                    break;
                                                    case 3:
                                                        System.out.println("");
                                                        System.out.println("** Ejemplo 3 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        int numtablaM=0;
							System.out.println("Ingrese un numero a realizar la tabla");
							numtablaM=leer.nextInt();
                                                        leer.nextLine();
							
                                                        for (int tbMultiplicar = 1; tbMultiplicar <= 10; tbMultiplicar++) {
                                                            System.out.println(numtablaM + " * "+ tbMultiplicar+" = "+(tbMultiplicar*numtablaM) );
							}
                                                    break;
                                                    case 4:
                                                        System.out.println("");
                                                        System.out.println("** Ejemplo 4 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        int numDigitado=0;
							System.out.println("Ingrese un numero para encontrar los impares menores que el");
							numDigitado=leer.nextInt();
                                                        leer.nextLine();
                                                        
							for (int contD = 1; contD <= numDigitado; contD++) {
                                                            if (contD%2 !=0) {
                                                                System.out.println(contD);
                                                            }
							}
                                                    break;
                                                    case 5:
                                                        System.out.println("");
                                                        System.out.println("** Ejemplo 5 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        int auxiliar;
							int contIteracion=0;
                                                        
							for(int j=1;j<=5;j++){
                                                            System.out.println("Ingrese el " + j + " numero para sumarlo");
                                                            auxiliar =leer.nextInt();
                                                            leer.nextLine();
                                                            contIteracion =contIteracion+auxiliar;
							}
							System.out.println("La suma de los numeros es : "+contIteracion);
                                                    break;
                                                    case 6:
                                                        //salir al menu sintaxis y ejemplos
                                                        opcionMenu = 9;
                                                        contador = 1000;
                                                    break;
                                                    case 7:
                                                        //salir al menu de temas
                                                        opcionMenu = 9;
                                                        contador = 100;
                                                    break;
                                                    case 8:
                                                        opcionMenu = 9;
                                                        contador =10;
                                                    break;
                                                    default:
                                                        System.out.println("Rango no existe!");
                                                        opcionMenu=8;
                                                    break;
                                                }  
                                            } while (opcionMenu <=8);
                                        break;
                                        case 3 :
                                            //Regresar al menu de temas
                                            opcionMenu = 9;
                                            contador = 100;
                                        break;
                                        case 4:
                                            //Regresar al menu principal
                                            opcionMenu = 9;
                                            contador =10;
                                        break;
                                        
                                        default:
                                            System.out.println("Opción no encontrada!");
                                            opcionMenu = 4;
                                        break;
                                    } 
                                } while (opcionMenu <=4 || contador ==1000);
                                break;
                            case 6:
                                //array
                                do {
                                    System.out.println("**************************************");
                                    System.out.println("-: ****    ESTRUCTURA ARRAY       *** :-");
                                    System.out.println("**************************************");
                                    System.out.println("");
                                    System.out.println("1 - Sintaxis");
                                    System.out.println("2 - Ejemplos");
                                    System.out.println("3 - Regresar al menu de temas");
                                    System.out.println("4 - Regresar al menu Principal");

                                    System.out.println("");
                                    System.out.println("Favor ingrese su opcion: "); 
                                    opcionMenu = leer.nextInt();
                                    leer.nextLine();
                                    
                                    switch (opcionMenu) {
                                        case 1:
                                            //Sintaxis
                                            System.out.println("");
                                            System.out.println("-: **** SINTAXIS DE ARRAYS **** :-");
                                            System.out.println("");
                                            System.out.println("tipo_dato nombre_array[]; \n" +
                                                                "nombre_array = new tipo_dato[tamanio];");
                                        break;
                                        case 2 :
                                            //ejemplos
                                            do {
                                                System.out.println("**************************************");
                                                System.out.println("-: **** EJEMPLOS ESTRUCTURA ARRAY   *** :-");
                                                System.out.println("**************************************");
                                                System.out.println("");
                                                System.out.println("1 - Ejemplo 1");
                                                System.out.println("2 - Ejemplo 2");
                                                System.out.println("3 - Ejemplo 3");
                                                System.out.println("4 - Ejemplo 4");
                                                System.out.println("5 - Ejemplo 5");
                                                System.out.println("6 - Regresar al menu de sintaxis y ejemplos");
                                                System.out.println("7 - Regresar al menu de temas");
                                                System.out.println("8 - Regresar al menu Principal");
                                                System.out.println("");
                                                System.out.println("Favor ingrese su opcion: "); 
                                                opcionMenu = leer.nextInt();
                                                leer.nextLine();
                                                
                                                switch (opcionMenu) {
                                                    case 1:
                                                        System.out.println("");
                                                        System.out.println("** Ejemplo 1 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        System.out.println("Ejemplo 1: Promedio Notas");
                                                        int i2, n;
                                                        double suma = 0, promedio;

                                                        System.out.println("Ingrese la cantidad de estudiantes: ");
                                                        n = leer.nextInt();
                                                        leer.nextLine();
                                                        
                                                        double[] notas = new double[n];
                                                        for (i2 = 0; i2 < n; i2++)
                                                        {
                                                            System.out.println("Ingrese la nota : ");
                                                            notas[i2] = leer.nextDouble();
                                                            leer.nextLine();
                                                            suma += notas[i2];
                                                        }
                                                        System.out.println("El promedio es: "+suma/n);
                                                    break;
                                                    case 2:
                                                        System.out.println("");
                                                        System.out.println("** Ejemplo 2 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        System.out.println("Sueldo empleados");
                                                        int i1;
                                                        double sueldo_mayor, sueldo_menor;
                                                        double[] sueldos = new double[10];

                                                        //llenando el arreglo
                                                        for (i1 = 1; i1 <= 10; i1++)
                                                        {
                                                            System.out.println("Ingrese el sueldo del empleado "+ i1);
                                                            sueldos[i1] = leer.nextDouble();  
                                                            leer.nextLine();
                                                        }
                                                        //inicializando las variables con el primer elemento del arreglo
                                                        sueldo_mayor = sueldos[0];
                                                        sueldo_menor = sueldos[0];

                                                        //imprimiendo el arreglo
                                                        System.out.println("\nImprimiendo los sueldos de los empleados...");
                                                        for (i1 = 0; i1 <= 9; i1++)
                                                        {
                                                            System.out.println(sueldos[i1]);
                                                        }

                                                        for (i1 = 0; i1 <= 9; i1++)
                                                        {
                                                            if (sueldos[i1] > sueldo_mayor)
                                                                sueldo_mayor = sueldos[i1];
                                                            else if (sueldos[i1] < sueldo_menor)
                                                                sueldo_menor = sueldos[i1];
                                                        }
                                                        System.out.println("El sueldo mayor es $" +sueldo_mayor+ " y el sueldo menor es $"+sueldo_menor);
                                                    break;
                                                    case 3:
                                                        System.out.println("");
                                                        System.out.println("** Ejemplo 3 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        System.out.println("Ingrese un numero");
                                                        int dui = leer.nextInt();
                                                        leer.nextLine();
                                                        ArrayList listado = new ArrayList();
                                                        listado.add(2020);
                                                        listado.add(2020);
                                                        if(listado.contains(dui))
                                                        {
                                                            System.out.println("El numero ya esta en el listado!");
                                                        }
                                                        else
                                                        {
                                                            listado.add(dui);
                                                            System.out.println("El numero fue guardado!");
                                                        }
                                                        System.out.println("Listado: "+listado);
                                                    break;
                                                    case 4:
                                                        /*
                                                        hacer un programa que capture una serie de numeros desde el teclado,
                                                        los almacene en un vector y sume los elementos de las posiciones pares,
                                                        lo mismo que las posiciones impares por separado.
                                                        */
                                                        System.out.println("");
                                                        System.out.println("** Ejemplo 4 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        int i, num, suma_par=0, suma_impar=0;
                                                        System.out.println("Ingrese la cantidad de numeros a almacenar: ");
                                                        num = leer.nextInt();
                                                        leer.nextLine();
                                                        int[] numeros=new int[num];
                                                        for(i=0; i<num; i++)
                                                        {
                                                            System.out.println("Ingrese un numero: ");
                                                            numeros[i]=leer.nextInt();
                                                            leer.nextLine();
                                                            if(i%2==0)
                                                                suma_impar = suma_impar+numeros[i];
                                                            else
                                                                suma_par = suma_par+numeros[i];
                                                        }
                                                        System.out.println("\nValores del arreglo: ");
                                                        for(i=0;i<num;i++)
                                                        {
                                                            System.out.println(numeros[i]+", ");
                                                        }
                                                        System.out.println("\n Suma de numeros pares: "+suma_par);
                                                        System.out.println("\n Suma de numeros impares: "+suma_impar);
                                                    break;
                                                    case 5:
                                                        /*
                                                        Hacer un programa que almacene una cantidad de números del que no se sabe la cantidad de 
                                                        elementos (el tamaño lo indica el usuario). Calcule el promedio de todos los elementos y forme 
                                                        dos nuevos arreglos, uno con los elementos menores o iguales al promedio y otro con los 
                                                        superiores. Imprima los dos nuevos arreglos y el original.
                                                        */
                                                        System.out.println("");
                                                        System.out.println("** Ejemplo 5 **");
                                                        System.out.println("================");
                                                        System.out.println(" ");
                                                        double suma1=0;
                                                        int i4, N, menor=0, mayor=0;
                                                        
                                                        System.out.println("Ingrese la cantidad de numeros a almacenar: ");
                                                        N = leer.nextInt();
                                                        leer.nextLine();
                                                        
                                                        double[] numeros1 = new double[N];
                                                        for(i4=0; i4 < N; i4++)
                                                        {
                                                            System.out.println("Ingrese un numero: ");
                                                            numeros1[i4] = leer.nextDouble();
                                                            leer.nextLine();
                                                            suma1+= numeros1[i4];//acumulador para el promedio
                                                        }
                                                        promedio = suma1 / N;
                                                        
                                                        for(i4=0; i4<N; i4++)
                                                        {
                                                            //para saber las longitudes de los nuevos arreglos
                                                            if(numeros1[i4] > promedio)
                                                                mayor++; //longitud para los mayores
                                                            else if(numeros1[i4] < promedio)
                                                                menor++; //longitud para los menores
                                                        }
                                                        //declaramos los nuevos vectores con sus respectivas longitudes
                                                        double[] vector_mayor = new double [mayor];
                                                        double[] vector_menor = new double [menor];
                                                        
                                                        int j = 0, k = 0; //se necesitan 2 indices para lso nuevos vectores
                                                        
                                                        for(i4=0; i4<N;i4++)
                                                        {
                                                            if(numeros1[i4]>promedio)
                                                            {
                                                                vector_mayor[j] = numeros1[i4]; //almaceno el valor en el vector mayor
                                                                j++;
                                                            }
                                                            else if(numeros1[i4] < promedio)
                                                            {
                                                                vector_menor[k] = numeros1[i4]; //almaceno el valor en el vector menor
                                                                k++;
                                                            }
                                                        }
                                                        //imprimimos los 3 vectores por separado
                                                        System.out.println("\nVector original: ");
                                                        for(i4=0; i4<N; i4++)
                                                        {
                                                            System.out.println(numeros1[i4]+", ");
                                                        }
                                                        System.out.println("\n\nEl promedio es: "+ promedio);
                                                        
                                                        System.out.println("\nVector mayor que el promedio: ");
                                                        for(i4=0; i4 < mayor; i4++)
                                                        {
                                                            System.out.println(vector_mayor[i4]+", ");
                                                        }
                                                        System.out.println("\nVector menor que el promedio: ");
                                                        for(i4=0; i4 < menor; i4++)
                                                        {
                                                            System.out.println(vector_menor[i4]+", ");
                                                        }
                                                    break;
                                                    case 6:
                                                        //salir al menu sintaxis y ejemplos
                                                        opcionMenu = 9;
                                                        contador = 1000;
                                                    break;
                                                    case 7:
                                                        //salir al menu de temas
                                                        opcionMenu = 9;
                                                        contador = 100;
                                                    break;
                                                    case 8:
                                                        opcionMenu = 9;
                                                        contador =10;
                                                    break;
                                                    default:
                                                        System.out.println("Rango no existe!");
                                                        opcionMenu=8;
                                                    break;
                                                }
                                                
                                            } while (opcionMenu <=8);
                                        break;
                                        case 3 :
                                            //Regresar al menu de temas
                                            opcionMenu = 9;
                                            contador = 100;
                                        break;
                                        case 4:
                                            //Regresar al menu principal
                                            opcionMenu = 9;
                                            contador =10;
                                        break;
                                        
                                        default:
                                            System.out.println("Opción no encontrada!");
                                            opcionMenu = 4;
                                        break;
                                    }
                                    
                                } while (opcionMenu <=4 || contador ==1000);
                                break;    
                            case 7:
                                //salir al nivel 1
                                opcionMenu = 8;
                                contador = 10;
                                break;  
                            default:
                                //deafault menu nivel 2
                                System.out.println("No se encuentra esa opción");
                        }
                    } while (opcionMenu <=7 || contador==100);
                    
                    break;
                case 2:
                    // About us
                    System.out.println("--------------------------------------");
                    System.out.println("INTEGRANTES DEL GRUPO!");
                    System.out.println("Arteaga Canjura, Kevin Emanuel		25-0560-2020");
                    System.out.println("Beltrán Gómez, Johana Abigail		25-0347-2020");
                    System.out.println("Chávez Ramos, Elías Rigoberto 		25-1695-2020");
                    System.out.println("Coreas De Jesús, Milagro Elizabeth	25-0011-2020");
                    System.out.println("Cruz Cruz, David Alejandro 		25-1306-2020");
                    System.out.println("Deras Hernández, Christian Alexander 	25-1387-2020");
                    System.out.println("Garay Diaz, Juan Francisco		17-5165-2009");
                    System.out.println("González Guerrido, Angel Alberto	25-0839-2020");
                    System.out.println("Morales Rosales, Melany Beatriz 	25-5329-2018");
                    System.out.println("Valencia Azucena, Ronaldo Alexander	25-1168-2020");
                    System.out.println("Vásquez Andino, Emerson Vladimir	25-0581-2020");
                    System.out.println("");
                break;
                case 3:
                    //Salir del sistema
                    System.out.println("¿Queres salir del sistema ");
                    System.out.println("1- Si");
                    System.out.println("2- No");
                    System.out.println("");
                    int opcionMenuPrincipal = leer.nextInt();
                    leer.nextLine();
                    if (opcionMenuPrincipal == 1) {
                        opcionMenu = 4;
                        contador = 0;
                    }else opcionMenu = 1;
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opción no encontrada! en Menú principal");
                    opcionMenu = 1;
                    System.out.println("");
                break;
                }
            } while (opcionMenu<=3 || contador == 10);    
    } 
}
