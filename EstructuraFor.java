/*
Crear un programa que solicite al usuario, usuario y contraseña, validar que los datos
ingresados por el usuario sean válidaos, donde usuario  = 'PROG3' y clave = '123',
si los datos son válidos mostrar un mensaje de bienvenida, de los contrario mostrar un mensaje de error.
El usuario tiene un máximo de tres intentos


Si ingresó al sistema realizar lo siguiente:

Mostrar el siguiente menú de opciones

1- Ejemplo 1 - Estructara if
2- Ejemplo 2 - Estructura switch dias
3- Ejemplo 3 - Estructura switch semana

Ejemplo 1 - Estructura if

	Crear un programa que solicite al usuario, la nota final de programación III.
	Determinar e imprimir lo siguiente:

	Si la nota es menor 6.0 imprimir rerobado
	Si la nota es mayor o igua a 6.0, imprimir aprobado

	También determinar e imprimir lo siguiente:

	Si la nota es menor o igual a 2.0 imprimir necesita cambio de carrera
	Si la nota es menor o igual a 4.0 necesita mejorar
	Si la nota es monor o igual a 6.0 Bueno
	Si la nota es menor o igual a 8.0 Muy bueno
	Si la nota es mayor a 8, Excelente

	Ademas, validar que la nota ingresada se válida (0 - 10), se la nota ingresada no es válida mostrar un mensaje de error.

Ejemplo 2 - Estructura switch

Crear un programa que solicite al usuario un número entero entre 1 y 7, determinar e imprimir 
el día de la semana correspondiente al número ingresado por el usuario.
Validar que el número ingresado sea válido (1 - 7), si el número ingresado no es válido mostrar un mensaje de error

Ejemplo 3 - Estructura switch semana

Crear un programa que solicite al usuario un número entero entre 1 y 7, determinar e imprimir 
el día de la semana correspondiente al número ingresado por el usuario.
Validar que el número ingresado sea válido (1 - 7), si el número ingresado no es válido mostrar un mensaje de error

Determinar e imprimir si corresponde a dia de semana o fin de semana 

Crear un programa que imprima la tabla de multiplicar solicitada por el usuario utilizando la estructura 
repetitiva for, agregar la opcion al menú

Crear un programa que imprima la tabla de multiplicar desde una tabla inicial 
hasta una tabla final solicitadas por el usuario utilizando la estructura 
repetitiva for, tambien solicitar hasta cuanto sera multiplicada cada una
de las tablas solicitadas por el usuario validando su valor inicial y su valor final
agregar la opcion al menú
validar en caso la tabla inicial sea mayor que la tabla final 
*/

import java.util.Scanner;
class EstructuraFor{	
	public static void main(String[] jorge){
		Scanner leerDatos = new Scanner(System.in);

		String elUsuario = "";
		String laClave = "";
		int contador = 100;
		int opcionMenu = 1;
		
		do{
			System.out.print("Ingrese su usuario: ");
			elUsuario = leerDatos.nextLine();
			
			System.out.print("Ingrese la clave: ");
			laClave = leerDatos.nextLine();
			
			if(elUsuario.equals("PROG3") && laClave.equals("123")){
				opcionMenu = 1;
				do{											
					System.out.println("**************************************");
					System.out.println("-: **** BIENVENIDO/A AL SISTEMA *** :-");
					System.out.println("**************************************");
					System.out.println("");
					System.out.println("1- Ejemplo estructura if notas");
					System.out.println("2- Ejemplo estructura switch dias");
					System.out.println("3- Ejemplo estructura switch semana");
					System.out.println("4- Ejemplo estructura while tabla de multiplicar");
					System.out.println("5- Ejemplo estructura for tabla de multiplicar 1");
					System.out.println("6- Ejemplo estructura for tabla de multiplicar desed hasta - 2");
					System.out.println("7- Acerca de...");
					// PREGUNTAR AL USUARIO SI QUIERE CERRAR SESION
					// VALIDAR LA OPCION SI SE PARA SALIR
					System.out.println("8- Cerrar sesion"); 
					// PREGUNTAR AL USUARIO SI QUIERE SALIR DEL SISTEMA
					// VALIDAR LA OPCION SI SE PARA SALIR
					System.out.println("9- Salir del sistema");
					System.out.print("Ingrese su opcion: ");	
					opcionMenu = leerDatos.nextInt();
					leerDatos.nextLine();
					//Validar que la opcion del menu sea valida
					//Si al opcion es valida mostrar o retornar al menu
					//de lo contrario mostrar un mensaje de error y retornar al menu
					System.out.println("");
					switch(opcionMenu)
					{
						case 6:
							System.out.print("Ingrese el numero de tabla a multiiplicar incial: ");
							int tablaInicial = leerDatos.nextInt();
							System.out.print("Ingrese el numero de tabla a multiiplicar final: ");
							int tablaFinal = leerDatos.nextInt();
							if(tablaInicial <= tablaFinal){
								for(int tInicial = tablaInicial ; tInicial <= tablaFinal ; tInicial++){
									System.out.println("Tabla de multiplicar del: " + tInicial);
									for(int contador3 = 1; contador3 <= 10 ; contador3++){
										System.out.println(tInicial + " * " + contador3 + " = " + (tInicial * contador3));
									}
									System.out.println("");
								}
							}
							else{
								for(int tInicial = tablaInicial ; tInicial >= tablaFinal ; tInicial--){
									System.out.println("Tabla de multiplicar del: " + tInicial);
									for(int contador3 = 1; contador3 <= 10 ; contador3++){
										System.out.println(tInicial + " * " + contador3 + " = " + (tInicial * contador3));
									}
									System.out.println("");
								}
							}
						break;
						case 5:
							System.out.print("Ingrese el numero de tabla a multiplicar");
							int tabla = leerDatos.nextInt();
							leerDatos.nextLine();
							int contador2 = 1;
							for(int contadorTabla = 100; contadorTabla < 110 ; contadorTabla++){
								System.out.println(tabla + " * " + contador2 + " = " + (tabla * contador2));
								contador2++;
							}
						break;
						case 9:
							System.out.println("¿Queres salir del sistema? : ");
							System.out.println("1- Si");
							System.out.println("2- No");
							System.out.println("");
							int opcionSalirSistema = leerDatos.nextInt();
							leerDatos.nextLine();
							if(opcionSalirSistema == 1){
								opcionMenu = 9;
								contador = 100;
							}
							else if(opcionSalirSistema == 2){
								opcionMenu = 1;								
							}
							else{
								System.out.println("Opcion no valida...");
								opcionMenu = 1;
							}
						break;
						case 8:
							System.out.println("¿Queres cerrar sesion? : ");
							System.out.println("1- Si");
							System.out.println("2- No");
							System.out.println("");
							int opcionCerrarSesion = leerDatos.nextInt();
							leerDatos.nextLine();
							if(opcionCerrarSesion == 1){
								opcionMenu = 8;
								contador = 0;
							}
							else if(opcionCerrarSesion == 2){
								opcionMenu = 1;								
							}
							else{
								System.out.println("Opcion no valida...");
								opcionMenu = 1;
							}
						break;
						case 7:
							System.out.println("Nombre desarrollador: La tia bubu");
							System.out.println("Nombre del software:  a la suerte");
							System.out.println("Fecha: ahora");
							System.out.println("Version: La ultima");
						break;
						case 1:
							//Ejercicio Estructura if
					
							System.out.println("");
							System.out.print("Ingrese al nota final de PROG3: ");
							double notaFinal = leerDatos.nextDouble();
							
							
							if(notaFinal >= 0 && notaFinal <= 10){
								if(notaFinal < 6.0){
									System.out.println("Estado: Reprobado");
								}
								else{
									System.out.println("Estado: Aprobado");
								}					
								
								if(notaFinal <= 2.0){
									System.out.println("Estado: Necesita cambiar de carrera");
								}
								else if(notaFinal <= 4.0){
									System.out.println("Estado: Necesita mejorar");
								}
								else if(notaFinal <= 6.0){				
									System.out.println("Estado: Bueno");
								}
								else if(notaFinal <= 8.0){
									System.out.println("Estado: Muy bueno");
								}
								else{
									System.out.println("Estado: Excelente");
								}			
							}
							else{
								System.out.println("Error, nota no válida...");
							}
							
						break; // del case 1 opcionMenu
						case 2:
							//Ejercicio Estructura switch
					
							int numeroDia;
							
							System.out.print("");
							System.out.print("Ingrese el numero de dia: ");
							numeroDia = leerDatos.nextInt();
							
							switch(numeroDia){
								case 5:
									System.out.println("Dia corresponde a: Viernes");
									break;
								case 1:
									System.out.println("Dia corresponde a: Lunes");
									break;
								case 3:
									System.out.println("Dia corresponde a: Miercoles");
									break;
								case 6:
									System.out.println("Dia corresponde a: Sabado");
									break;
								case 2:
									System.out.println("Dia corresponde a: Martes");
									break;
								case 7:
									System.out.println("Dia corresponde a: Domingo");
									break;
								case 4:
									System.out.println("Dia corresponde a: Jueves");
									break;
								default:
									System.out.println("Numero ingresado no valido...");
									break;
							}
						break; // del case 2 opcionMenu
						case 3:
						//Ejercicio 3  Estructura switch semana
					
							int numeroDia2;
							
							System.out.print("");
							System.out.print("Ingrese el numero de dia: ");
							numeroDia2 = leerDatos.nextInt();
							
							switch(numeroDia2){
								case 5:
									System.out.println("Dia corresponde a: Viernes");
									break;
								case 1:
									System.out.println("Dia corresponde a: Lunes");
									break;
								case 3:
									System.out.println("Dia corresponde a: Miercoles");
									break;
								case 6:
									System.out.println("Dia corresponde a: Sabado");
									break;
								case 2:
									System.out.println("Dia corresponde a: Martes");
									break;
								case 7:
									System.out.println("Dia corresponde a: Domingo");
									break;
								case 4:
									System.out.println("Dia corresponde a: Jueves");
									break;
								default:
									System.out.println("Numero ingresado no valido...");
									break;
							}
							switch(numeroDia2){
								case 5:
								case 1:
								case 3:
								case 4:
								case 2:
									System.out.println("Corresponde a dia de semana...");
									break;
								case 6:
								case 7:
									System.out.println("Corresponde a fin de semana...");
									break;
								default:
									System.out.println("Numero no valido...");
									break;
								
							}
						break; // del case 3 opcionMenu	
						default:
							System.out.println("Opcion no valida del menu...");
							opcionMenu = 1;
							break;
					} // cierre del switch de la variable opcionMenu
				}while(opcionMenu <= 7); // cierre de la estructura while(opcionMenu <= 5)
			}// cierre del login
			else{
				System.out.println("Error, usuario y/o contrasena no es correcta...");
			}
			contador++;
		}while(contador <= 3); // Cierre de la estructura while(contador <= 3)
	}
}

/*Sintaxis estructura if
	if(condicionLogica){
		bloque de instrucciones true
	}

	if(condicionLogica){
		bloque de instrucciones true
	}
	else{
		if(condicionLogica){
			bloque de instrucciones true
		}
		else{
			bloque de instrucciones false
		}
	}
	
	if(condicionLogica1){
		bloque de instrucciones true
	}
	else if(condicionLogica2){
		bloque de instrucciones true
	}
	else if(condicionLogicaX){
		bloque de instrucciones true
	}
	else{
		bloque de instrucciones false
	}
	
*/
/*
Sintaxis estructura switch

variable = valorInicial;
//Procesos que alteran el valor de la variable
switch(variable){
	case valor1:
		Instrucciones valor1;
		break;
	case valor2:
		Instrucciones valor2;
		break;
	case valorX:
		Instrucciones valorX;
		break;
	default:
		Instrucciones default;
		break;
}

variable = valorInicial;
//Procesos que alteran el valor de la variable
switch(variable){
	case valor1:
	case valor2:
	case valor3:
		Instrucciones bloque1;
		break;
	case valor4:
	case valor5:
	case valor6:
		Instrucciones bloque2;
		break;
	default:
		Instrucciones default;
		break;
}

*1 -> Lunes
2 -> Martes
*3 -> Miércoles
4 -> Jueves
*5 -> Viernes
6 -> Sábado
7 -> Domingo
*/
/*
Sintaxis estructura While

variable = valorInicial;
//Bloque de instrucciones que alteren el valor de la varible
while(condicionLogica)
{
	Bloque de instrucciones a repetir
	variable = incremento / decremento;
}

*/
/*
Sintaxis estructura for


for(variable = valorInicial ; condicionLogica ; incremento/decremento){
	Bloque de instrucciones a repetir
}

*/