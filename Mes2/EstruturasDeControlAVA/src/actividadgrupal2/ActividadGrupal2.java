
package actividadgrupal2;
import java.util.Scanner;

public class ActividadGrupal2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int contador = 100;
        int opcionMenu = 1;
        
        do {
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
                        
                        switch (opcionMenu) {
                            case 1:
                                //if
                                do {
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
                                    
                                    switch (opcionMenu) {
                                        case 1:
                                            //Sintaxis
                                            
                                            break;
                                        case 2 :
                                            //ejemplos
                                            do {
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
                                                
                                                switch (opcionMenu) {
                                                    case 1:
                                                         System.out.println("Ejemplo 1");
                                                    break;
                                                    case 2:

                                                    break;
                                                    case 3:

                                                    break;
                                                    case 4:

                                                    break;
                                                    case 5:

                                                    break;
                                                    case 6:
                                                        //salir al menu sintaxis y ejemplos
                                                        opcionMenu = 6;
                                                        contador = 1000;
                                                    break;
                                                    case 7:
                                                        //salir al menu de temas
                                                        opcionMenu = 6;
                                                        contador = 100;
                                                    break;
                                                    case 8:
                                                        opcionMenu = 6;
                                                        contador =10;
                                                    break;
                                                    case 9:

                                                    break;

                                                    default:
                                                        System.out.println("Rango no existe!");
                                                        opcionMenu=4;
                                                }
                                                
                                            } while (opcionMenu <=4);
                                        break;
                                        case 3 :
                                            //Regresar al menu de temas
                                            opcionMenu = 6;
                                            contador = 100;
                                        break;
                                        case 4:
                                            //Regresar al menu principal
                                            opcionMenu = 6;
                                            contador =10;
                                        break;
                                        
                                        default:
                                            System.out.println("Opción no encontrada!");
                                            opcionMenu = 4;
                                    }
                                    
                                } while (opcionMenu <=4 || contador ==1000);
                                
                                break;
                            case 2:
                                //switch
                                do {
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
                                    
                                    switch (opcionMenu) {
                                        case 1:
                                            //Sintaxis
                                            
                                            break;
                                        case 2 :
                                            //ejemplos
                                            do {
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
                                                
                                                switch (opcionMenu) {
                                                    case 1:
                                                         System.out.println("Ejemplo 1");
                                                    break;
                                                    case 2:

                                                    break;
                                                    case 3:

                                                    break;
                                                    case 4:

                                                    break;
                                                    case 5:

                                                    break;
                                                    case 6:
                                                        //salir al menu sintaxis y ejemplos
                                                        opcionMenu = 6;
                                                        contador = 1000;
                                                    break;
                                                    case 7:
                                                        //salir al menu de temas
                                                        opcionMenu = 6;
                                                        contador = 100;
                                                    break;
                                                    case 8:
                                                        opcionMenu = 6;
                                                        contador =10;
                                                    break;
                                                    case 9:

                                                    break;

                                                    default:
                                                        System.out.println("Rango no existe!");
                                                        opcionMenu=4;
                                                }
                                                
                                            } while (opcionMenu <=4);
                                        break;
                                        case 3 :
                                            //Regresar al menu de temas
                                            opcionMenu = 6;
                                            contador = 100;
                                        break;
                                        case 4:
                                            //Regresar al menu principal
                                            opcionMenu = 6;
                                            contador =10;
                                        break;
                                        
                                        default:
                                            System.out.println("Opción no encontrada!");
                                            opcionMenu = 4;
                                    }
                                    
                                } while (opcionMenu <=4 || contador ==1000);
                                break;
                            case 3:
                                //while
                                do {
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
                                    
                                    switch (opcionMenu) {
                                        case 1:
                                            //Sintaxis
                                            
                                            break;
                                        case 2 :
                                            //ejemplos
                                            do {
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
                                                
                                                switch (opcionMenu) {
                                                    case 1:
                                                         System.out.println("Ejemplo 1");
                                                    break;
                                                    case 2:

                                                    break;
                                                    case 3:

                                                    break;
                                                    case 4:

                                                    break;
                                                    case 5:

                                                    break;
                                                    case 6:
                                                        //salir al menu sintaxis y ejemplos
                                                        opcionMenu = 6;
                                                        contador = 1000;
                                                    break;
                                                    case 7:
                                                        //salir al menu de temas
                                                        opcionMenu = 6;
                                                        contador = 100;
                                                    break;
                                                    case 8:
                                                        opcionMenu = 6;
                                                        contador =10;
                                                    break;
                                                    case 9:

                                                    break;

                                                    default:
                                                        System.out.println("Rango no existe!");
                                                        opcionMenu=4;
                                                }
                                                
                                            } while (opcionMenu <=4);
                                        break;
                                        case 3 :
                                            //Regresar al menu de temas
                                            opcionMenu = 6;
                                            contador = 100;
                                        break;
                                        case 4:
                                            //Regresar al menu principal
                                            opcionMenu = 6;
                                            contador =10;
                                        break;
                                        
                                        default:
                                            System.out.println("Opción no encontrada!");
                                            opcionMenu = 4;
                                    }
                                    
                                } while (opcionMenu <=4 || contador ==1000);
                                break;
                            case 4:
                                //do while
                                do {
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
                                    
                                    switch (opcionMenu) {
                                        case 1:
                                            //Sintaxis
                                            
                                            break;
                                        case 2 :
                                            //ejemplos
                                            do {
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
                                                
                                                switch (opcionMenu) {
                                                    case 1:
                                                         System.out.println("Ejemplo 1");
                                                    break;
                                                    case 2:

                                                    break;
                                                    case 3:

                                                    break;
                                                    case 4:

                                                    break;
                                                    case 5:

                                                    break;
                                                    case 6:
                                                        //salir al menu sintaxis y ejemplos
                                                        opcionMenu = 6;
                                                        contador = 1000;
                                                    break;
                                                    case 7:
                                                        //salir al menu de temas
                                                        opcionMenu = 6;
                                                        contador = 100;
                                                    break;
                                                    case 8:
                                                        opcionMenu = 6;
                                                        contador =10;
                                                    break;
                                                    case 9:

                                                    break;

                                                    default:
                                                        System.out.println("Rango no existe!");
                                                        opcionMenu=4;
                                                }
                                                
                                            } while (opcionMenu <=4);
                                        break;
                                        case 3 :
                                            //Regresar al menu de temas
                                            opcionMenu = 6;
                                            contador = 100;
                                        break;
                                        case 4:
                                            //Regresar al menu principal
                                            opcionMenu = 6;
                                            contador =10;
                                        break;
                                        
                                        default:
                                            System.out.println("Opción no encontrada!");
                                            opcionMenu = 4;
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
                                    
                                    switch (opcionMenu) {
                                        case 1:
                                            //Sintaxis
                                            
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
                                                
                                                switch (opcionMenu) {
                                                    case 1:
                                                         System.out.println("Ejemplo 1");
                                                    break;
                                                    case 2:

                                                    break;
                                                    case 3:

                                                    break;
                                                    case 4:

                                                    break;
                                                    case 5:

                                                    break;
                                                    case 6:
                                                        //salir al menu sintaxis y ejemplos
                                                        opcionMenu = 6;
                                                        contador = 1000;
                                                    break;
                                                    case 7:
                                                        //salir al menu de temas
                                                        opcionMenu = 6;
                                                        contador = 100;
                                                    break;
                                                    case 8:
                                                        opcionMenu = 6;
                                                        contador =10;
                                                    break;
                                                    case 9:

                                                    break;

                                                    default:
                                                        System.out.println("Rango no existe!");
                                                        opcionMenu=4;
                                                }
                                                
                                            } while (opcionMenu <=4);
                                        break;
                                        case 3 :
                                            //Regresar al menu de temas
                                            opcionMenu = 6;
                                            contador = 100;
                                        break;
                                        case 4:
                                            //Regresar al menu principal
                                            opcionMenu = 6;
                                            contador =10;
                                        break;
                                        
                                        default:
                                            System.out.println("Opción no encontrada!");
                                            opcionMenu = 4;
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
                                    
                                    switch (opcionMenu) {
                                        case 1:
                                            //Sintaxis
                                            
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
                                                
                                                switch (opcionMenu) {
                                                    case 1:
                                                         System.out.println("Ejemplo 1");
                                                    break;
                                                    case 2:

                                                    break;
                                                    case 3:

                                                    break;
                                                    case 4:

                                                    break;
                                                    case 5:

                                                    break;
                                                    case 6:
                                                        //salir al menu sintaxis y ejemplos
                                                        opcionMenu = 6;
                                                        contador = 1000;
                                                    break;
                                                    case 7:
                                                        //salir al menu de temas
                                                        opcionMenu = 6;
                                                        contador = 100;
                                                    break;
                                                    case 8:
                                                        opcionMenu = 6;
                                                        contador =10;
                                                    break;
                                                    case 9:

                                                    break;

                                                    default:
                                                        System.out.println("Rango no existe!");
                                                        opcionMenu=4;
                                                }
                                                
                                            } while (opcionMenu <=4);
                                        break;
                                        case 3 :
                                            //Regresar al menu de temas
                                            opcionMenu = 6;
                                            contador = 100;
                                        break;
                                        case 4:
                                            //Regresar al menu principal
                                            opcionMenu = 6;
                                            contador =10;
                                        break;
                                        
                                        default:
                                            System.out.println("Opción no encontrada!");
                                            opcionMenu = 4;
                                    }
                                    
                                } while (opcionMenu <=4 || contador ==1000);
                                break;    
                            case 7:
                                //salir al nivel 1
                                opcionMenu = 5;
                                contador = 10;
                                break;  
                            default:
                                //deafault menu nivel 2
                                System.out.println("No se encuentra esa opción");
                        }
                    } while (opcionMenu <=4 || contador==100);
                    
                    break;
                case 2:
                    // About us
                    System.out.println("--------------------------------------");
                    System.out.println("INTEGRANTES DEL GRUPO!");
                    System.out.println("Juan Francisco Garay Diaz: 17-5165-2009");
                    System.out.println("Angel Alberto González Guerrido 2508392020");
                    System.out.println("Vásquez Andino Emerson Vladimir 2505812020");
                    System.out.println("Ronaldo Alexander Valencia Azucena 25-1168-2020");
                    System.out.println("Johana Abigail Beltrán Gómez25-0347-2020");
                    System.out.println("Kevin Emanuel Arteaga Canjura 2505602020");
                    System.out.println("Christian Alexander Deras Hernandez 2513872020");
                    System.out.println("COREAS DE JESUS MILAGRO ELIZABETH 2500112020");
                    System.out.println("Morales Rosales Melany Beatriz 2553292018");
                    System.out.println("David Alejandro Cruz Cruz 2513062020");
                    System.out.println("Chavez Ramos Elias Rigoberto 2516952020");
                    break;
                case 3:
                    //Salir del sistema
                    System.out.println("¿Queres salir del sistema ");
                    System.out.println("1- Si");
                    System.out.println("2- No");
                    System.out.println("");
                    int opcionMenuPrincipal = leer.nextInt();
                    if (opcionMenuPrincipal == 1) {
                        opcionMenu = 4;
                        contador = 0;
                    }else opcionMenu = 1;
                    break;
                default:
                    System.out.println("Opción no encontrada! en Menú principal");
                    opcionMenu = 1;
                break;
                }
            } while (opcionMenu<=3 || contador == 10);
        
    }
    
}
