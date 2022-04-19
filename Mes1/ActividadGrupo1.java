import java.util.Scanner;
import java.text.DecimalFormat;
class ActividadGrupo1{	
	public static void main(String[] jorge){
		Scanner leer = new Scanner(System.in);

		String elUsuario = "";
		String laClave = "";
		int contador = 100;
		int opcionMenu = 1;
		
		do{
			System.out.print("Ingrese su usuario: ");
			elUsuario = leer.nextLine();
			
			System.out.print("Ingrese la clave: ");
			laClave = leer.nextLine();
			
			if(elUsuario.equals("PROG3") && laClave.equals("123")){
				opcionMenu = 1;
				do{			
					//MENU PRINCIPAL
					System.out.println("**************************************");
					System.out.println("-: **** BIENVENIDO/A AL SISTEMA *** :-");
					System.out.println("**************************************");
					System.out.println("");
					System.out.println("1 - Mostrar ejercicios estructura de control selectivas if-else");
					System.out.println("2 - Mostrar ejercicios estructura de control selectiva switch");
					System.out.println("3 - Mostrar ejercicios estructura de control repetitiva while");
					System.out.println("4 - Mostrar ejercicios estructura de control repetitiva do-while");
					System.out.println("5 - Mostrar ejercicios estructura de control repetitiva for");
					System.out.println("6 - Acerca de..."); 
					System.out.println("7 - Cerrar sesion");
					System.out.println("8 - Salir del sistema");
					System.out.println("Favor ingrese su opcion: "); 	
					opcionMenu = leer.nextInt();
					leer.nextLine();

					System.out.println("");
					switch(opcionMenu)
					{
						case 6:
							//CASE DE ACERCA DE...
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
							System.out.println("--------------------------------------");
						break;//CIERRE DE CASE ACERCA DE...
						case 5:
							opcionMenu = 1;
							do{	
								//SUBMENU DE EJERCICIOS ESTRUCTURA DE CONTROL REPETITIVA FOR
								System.out.println("*******************************************");
								System.out.println("EJERCICIOS ESTRUCTURA DE CONTROL REPETITIVA FOR...");
								System.out.println("*******************************************");
								System.out.println("");
											
								System.out.println("1- Ejercicio 1: muestra los numeros pares del 1 a 10");
								System.out.println("2- Ejercicio 2: Muestra un numero de el 1 al N");
								System.out.println("3- Ejercicio 3: Imprine la tabla de multiplicar de N numero");
								System.out.println("4- Ejercicio 4: Imprimir los numeros impares de 1 hasta N");
								System.out.println("5- Ejercicio 5: pida al usuario 5 números y muestre la suma de estos números.");
								System.out.println("6 - Regresar al menu principal");
								System.out.println("Favor ingrese su opcion: "); 	
								opcionMenu = leer.nextInt();
								leer.nextLine();
								System.out.println("");
								switch(opcionMenu)
								{
									
									case 6:
										System.out.println("¿Queres regresar al menu principal? : ");
										System.out.println("1- Si");
										System.out.println("2- No");
										System.out.println("");
										int opcionMenuPrincipal = leer.nextInt();
										leer.nextLine();
										if(opcionMenuPrincipal == 1){
											opcionMenu = 6;
											contador = 0;
										}
										else if(opcionMenuPrincipal == 2){
											opcionMenu = 1;								
										}
										else{
											System.out.println("Opcion no valida...");
											opcionMenu = 1;
										}
									break;
									case 1:
										//EJERCICIO 1 DE ESTRUCTURA DE CONTROL REPETITIVA FOR
										System.out.println("Secuencia de numeros pares del 1 al 10 ");
										for (int contadorPar = 0; contadorPar <= 10; contadorPar=contadorPar+2) {
										System.out.println(contadorPar);
										}
									break; //CIERRE DE CASE DE EJERCICIO 1 DE ESTRUCTURA DE CONTROL REPETITIVA FOR
									case 2:
										//EJERCICIO 2 DE ESTRUCTURA DE CONTROL REPETITIVA FOR
										int numeroEntero;
										System.out.print("Introduce un número entero: ");
										numeroEntero = leer.nextInt();
										System.out.println("\nNumeros del 1 al " + numeroEntero + ": ");
										for (int contadorNE = 1; contadorNE <= numeroEntero; contadorNE++) {
										System.out.println(contadorNE);
										}
									break; //CIERRE DE CASE DE EJERCICIO 2 DE ESTRUCTURA DE CONTROL REPETITIVA FOR
									case 3:
										//EJERCICIO 3 DE ESTRUCTURA DE CONTROL REPETITIVA FOR
										int numtablaM=0;
										System.out.println("Ingrese un numero a realizar la tabla");
										numtablaM=leer.nextInt();
										for (int tbMultiplicar = 1; tbMultiplicar <= 10; tbMultiplicar++) {
										System.out.println(numtablaM + " * "+ tbMultiplicar+" = "+(tbMultiplicar*numtablaM) );
										}
									break; //CIERRE DE CASE DE EJERCICIO 3 DE ESTRUCTURA DE CONTROL REPETITIVA FOR	
									case 4:
										//EJERCICIO 4 DE ESTRUCTURA DE CONTROL REPETITIVA FOR
										int numDigitado=0;
										System.out.println("Ingrese un numero");
										numDigitado=leer.nextInt();
										for (int contD = 1; contD <= numDigitado; contD++) {
												if (contD%2 !=0) {
												System.out.println(contD);
												}
										}
									break; //CIERRE DE CASE DE EJERCICIO 4 DE ESTRUCTURA DE CONTROL REPETITIVA FOR
									case 5:
										//EJERCICIO 5 DE ESTRUCTURA DE CONTROL REPETITIVA FOR
										int auxiliar;
										int contIteracion=0;
										for(int j=1;j<=5;j++){
										System.out.println("Ingrese el " + j + " numero");
										auxiliar =leer.nextInt();
										contIteracion =contIteracion+auxiliar;
										}
										System.out.println("La suma de los numeros es ; "+contIteracion);
										
									break;//CIERRE DE CASE DE EJERCICIO 5 DE ESTRUCTURA DE CONTROL REPETITIVA FOR
									default:
										System.out.println("Opcion no valida del menu...");
										opcionMenu = 1;
										break;
								} // cierre del switch de la variable opcionMenu
							}while(opcionMenu <= 5); // cierre de la estructura while(SUBMENU <= 5)
							
						break;//CIERRE DE CASE DE MOSTRAR EJERCICIOS DE ESTRUCTURA DE CONTROL REPETITIVA FOR
						case 4:
							opcionMenu = 1;
							do{	
								//SUBMENU DE EJERCICIOS ESTRUCTURA DE CONTROL REPETITIVA DO-WHILE
								System.out.println("*******************************************");
								System.out.println("EJERCICIOS ESTRUCTURA DE CONTROL REPETITIVA DO-WHILE...");
								System.out.println("*******************************************");
								System.out.println("");
											
								System.out.println("1 - Ejercicio 1: media de 10 números ");
								System.out.println("2 - Ejercicio 2: factorial de un numero hasta que el usuario desee");
								System.out.println("3 - Ejercicio 3: sumatoria de 10 números");
								System.out.println("4 - Ejercicio 4: cubo y raíz cuadrada de un número");
								System.out.println("5 - Ejercicio 5: total acumulado y a pagar en caja");
								System.out.println("6 - Regresar al menu principal");
								System.out.println("Favor ingrese su opcion: "); 	
								opcionMenu = leer.nextInt();
								leer.nextLine();
								System.out.println("");
								switch(opcionMenu)
								{
									case 5:
										//EJERCICIO 5 DE ESTRUCTURA DE CONTROL REPETITIVA DO-WHILE
										/*Hacer un programa que lea 10 consumos en una cafetería si el consumo 
										ingresado excede los $5, el descuento será 7% mostrar todos los pagos y el 
										pago total o acumulado*/
										double consumo=0.0, descuento=0.0, total=0.0;
										int cont=1;

										DecimalFormat ft=new DecimalFormat("#.##");
										
										System.out.println("\n\t\"Bienvenido\"");
										
										do{
											System.out.print("\nIngrese el consumo "+cont+": $ ");
											consumo=leer.nextDouble();
											if (consumo>5.0)
												descuento=consumo*0.07;
											else
												descuento=0.0;
											consumo=consumo-descuento;
											System.out.println("Total a pagar: $ "+ft.format(consumo));
											total=total+consumo;
											cont++;
										}while (cont<=10);	
										System.out.println("\n\nTotal acumulado en caja: $ "+ft.format(total));
									break;//CIERRE DE CASE DE EJERCICIO 5 DE ESTRUCTURA DE CONTROL REPETITIVA DO-WHILE
									case 6:
										System.out.println("¿Queres regresar al menu principal? : ");
										System.out.println("1- Si");
										System.out.println("2- No");
										System.out.println("");
										int opcionMenuPrincipal = leer.nextInt();
										leer.nextLine();
										if(opcionMenuPrincipal == 1){
											opcionMenu = 6;
											contador = 0;
										}
										else if(opcionMenuPrincipal == 2){
											opcionMenu = 1;								
										}
										else{
											System.out.println("Opcion no valida...");
											opcionMenu = 1;
										}
									break;
									case 1:
										//EJERCICIO 1 DE ESTRUCTURA DE CONTROL REPETITIVA DO-WHILE
										/*De un conjunto de 10 números calcular la media y determinar cuántos 
										números son mayores que 10, cuantos son iguales y cuántos son menores.*/
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
									break; //CIERRE DE CASE DE EJERCICIO 1 DE ESTRUCTURA DE CONTROL REPETITIVA DO-WHILE
									case 2:
										//EJERCICIO 2 DE ESTRUCTURA DE CONTROL REPETITIVA DO-WHILE
										/*Hacer un programa que calcule el factorial de un número. El proceso de 
										repetición deber ser hasta que se ingrese un valor negativo.*/
										int numero=0, factorial=1, num1=0;
								
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
									break; //CIERRE DE CASE DE EJERCICIO 2 DE ESTRUCTURA DE CONTROL REPETITIVA DO-WHILE
									case 3:
										//EJERCICIO 3 DE ESTRUCTURA DE CONTROL REPETITIVA DO-WHILE
										/*Capturar 10 números enteros, sumarlos y mostrar el resultado de la suma*/
										int num, sum=0,resultado=0, i=1;

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
									break; //CIERRE DE CASE DE EJERCICIO 3 DE ESTRUCTURA DE CONTROL REPETITIVA DO-WHILE	
									case 4:
										//EJERCICIO 4 DE ESTRUCTURA DE CONTROL REPETITIVA DO-WHILE
										/*Hacer un programa que imprima el cubo y la raíz cuadrada de un numero 
										ingresado por teclado; el programa debe estar desarrollado de tal manera 
										que el proceso a efectuarse sea repetitivo. Debe terminar cuando el usuario 
										ya no desea continuar.*/

										double number=0;
										String resp=" ";
										
										do{
											
											System.out.println("Ingrese cualquier numero");
											number=leer.nextDouble();
											leer.nextLine();
											
											System.out.println("El cubo del numero "+number+" es: "+Math.pow(number,3));
											
											System.out.println("La raiz cuadrada del nuamero "+number+" es: "+Math.pow(number,0.5));
											
											System.out.println("Desea continuar con los procesos?"+"\nEscribir \'si\' o \'no\'");
											resp=leer.nextLine();

										}while(resp.equals("si"));
									break; //CIERRE DE CASE DE EJERCICIO 4 DE ESTRUCTURA DE CONTROL REPETITIVA DO-WHILE
									default:
										System.out.println("Opcion no valida del menu...");
										opcionMenu = 1;
										break;
								} // cierre del switch de la variable opcionMenu
							}while(opcionMenu <= 5); // cierre de la estructura while(SUBMENU <= 5)
						break;//CIERRE DE CASE DE MOSTRAR EJERCICIOS DE CONTROL REPETITIVA DO-WHILE
						case 8:
							//CASE SALIR DEL SISTEMA
							System.out.println("¿Queres salir del sistema? : ");
							System.out.println("1- Si");
							System.out.println("2- No");
							System.out.println("");
							int opcionSalirSistema = leer.nextInt();
							leer.nextLine();
							if(opcionSalirSistema == 1){
								opcionMenu = 8;
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
						case 7:
							//CASE DE CERRAR SESION
							System.out.println("¿Queres cerrar sesion? : ");
							System.out.println("1- Si");
							System.out.println("2- No");
							System.out.println("");
							int opcionCerrarSesion = leer.nextInt();
							leer.nextLine();
							if(opcionCerrarSesion == 1){

								opcionMenu = 7;
								contador = 0;
							}
							else if(opcionCerrarSesion == 2){
								opcionMenu = 1;								
							}
							else{
								System.out.println("Opcion no valida...");
								opcionMenu = 1;
							}
						break;//CIERRE DE CASE DE CERRAR SESION
						case 1:
							opcionMenu = 1;
							do{	
								//SUBMENU DE EJERCICIOS ESTRUCTURA DE CONTROL SELECTIVA IF-ELSE
								System.out.println("*******************************************");
								System.out.println("EJERCICIOS ESTRUCTURA DE CONTROL SELECTIVA IF-ELSE...");
								System.out.println("*******************************************");
								System.out.println("");
											
								System.out.println("1- Ejemplo notas");
								System.out.println("2- Ejemplo dias");
								System.out.println("3- Ejemplo mascotas");
								System.out.println("4- Ejemplo mes");
								System.out.println("5- Ejemplo planetas");
								System.out.println("6 - Regresar al menu principal");
								System.out.println("Favor ingrese su opcion: "); 	
								opcionMenu = leer.nextInt();
								leer.nextLine();
								System.out.println("");
								switch(opcionMenu)
								{
									
									case 6:
										System.out.println("¿Queres regresar al menu principal? : ");
										System.out.println("1- Si");
										System.out.println("2- No");
										System.out.println("");
										int opcionMenuPrincipal = leer.nextInt();
										leer.nextLine();
										if(opcionMenuPrincipal == 1){
											opcionMenu = 6;
											contador = 0;
										}
										else if(opcionMenuPrincipal == 2){
											opcionMenu = 1;								
										}
										else{
											System.out.println("Opcion no valida...");
											opcionMenu = 1;
										}
									break;
									case 1:
										//EJERCICIO 1 DE ESTRUCTURA DE CONTROL SELECTIVA IF-ELSE
										System.out.println("Ejercicio notas");
										System.out.println("");
				
										System.out.print("Ingrese al nota final de PROG3: ");
										double notaFinal = leer.nextDouble();
							
							
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
									break; //CIERRE DE CASE DE EJERCICIO 1 DE ESTRUCTURA DE CONTROL SELECTIVA IF-ELSE
									case 2:
										//EJERCICIO 2 DE ESTRUCTURA DE CONTROL SELECTIVA IF-ELSE
										System.out.println("Ejercicios Dias");
										System.out.println("");
										
										System.out.print("Ingrese el numero del dia");
										int dia = leer.nextInt();
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
											System.out.println("Numero de dia no valido");
										}
									break; //CIERRE DE CASE DE EJERCICIO 2 DE ESTRUCTURA DE CONTROL SELECTIVA IF-ELSE
									case 3:
										//EJERCICIO 3 DE ESTRUCTURA DE CONTROL SELECTIVA IF-ELSE
										System.out.println("Ejercicio mascotas");
										System.out.println("");
										
										System.out.print("Ingrese el numero de 4 tipos de mascota");
										int mascota = leer.nextInt();
										System.out.println("");
										
										if(mascota==1){
											System.out.println("La mascota corresponde a: perro");
										}
										else if(mascota==2){
											System.out.println("La mascota corresponde a: gato");
										}
										else if(mascota==3){
											System.out.println("La mascota corresponde a: pez");
										}
										else if(mascota==4){
											System.out.println("La mascota corresponde a: perico");
										}
										else{
											System.out.println("numero de mascota no valido");
										}
									break; //CIERRE DE CASE DE EJERCICIO 3 DE ESTRUCTURA DE CONTROL SELECTIVA IF-ELSE	
									case 4:
										//EJERCICIO 4 DE ESTRUCTURA DE CONTROL SELECTIVA IF-ELSE
											System.out.println("Ejercicio meses");
										System.out.println("");
										
										System.out.println("Ingrese el numero de mes");
										int mes = leer.nextInt();
										System.out.println("");
										
										if(mes==1){
											System.out.println("Enero");
										}
										else if(mes==2){
											System.out.println("febrero");
										}
										else if(mes==3){
											System.out.println("marzo");
										}
										else if(mes==4){
											System.out.println("abril");
										}
										else if(mes==5){
											System.out.println("mayo");
										}
										else if(mes==6){
											System.out.println("junio");
										}
										else if(mes==7){
											System.out.println("julio");
										}
										else if(mes==8){
											System.out.println("agosto");
										}
										else if(mes==9){
											System.out.println("septiembre");
										}
										else if(mes==10){
											System.out.println("octubre");
										}
										else if(mes==11){
											System.out.println("noviembre");
										}
										else if(mes==12){
											System.out.println("diciembre");
										}
										else {
											System.out.println("numero no valido");
										}
									break; //CIERRE DE CASE DE EJERCICIO 4 DE ESTRUCTURA DE CONTROL SELECTIVA IF-ELSE
									case 5:
										//EJERCICIO 5 DE ESTRUCTURA DE CONTROL SELECTIVA IF-ELSE
											System.out.println("Ejercicios de planetas");
											System.out.println("");
											
											System.out.println("Ingrese el numero de planeta");
												int planeta = leer.nextInt();
											System.out.println("");
											
											if(planeta==1){
												System.out.println("mercurio");
											}
											else if(planeta==2){
												System.out.println("venus");
											}
											else if(planeta==3){
												System.out.println("tierra");
											}
											else if(planeta==4){
												System.out.println("marte");
											}
											else if(planeta==5){
												System.out.println("jupiter");
											}
											else if(planeta==6){
												System.out.println("saturno");
											}
											else if(planeta==7){
												System.out.println("urano");
											}
											else if(planeta==8){
												System.out.println("neptuno");
											}
											else if(planeta==9){
												System.out.println("pluton");
											}
											else {
												System.out.println("numero no valido");
											}
									break;//CIERRE DE CASE DE EJERCICIO 5 DE ESTRUCTURA DE CONTROL SELECTIVA IF-ELSE
									default:
										System.out.println("Opcion no valida del menu...");
										opcionMenu = 1;
										break;
								} // cierre del switch de la variable opcionMenu
							}while(opcionMenu <= 5); // cierre de la estructura while(SUBMENU <= 5)
						break; // del case 1 opcionMenu
						case 2:
							opcionMenu = 1;
							do{	
								//SUBMENU DE EJERCICIOS ESTRUCTURA DE CONTROL SELECTIVA SWITCH
								System.out.println("*******************************************");
								System.out.println("EJERCICIOS ESTRUCTURA DE CONTROL SELECTIVA SWITCH...");
								System.out.println("*******************************************");
								System.out.println("");
											
								System.out.println("1- Ordena tu sabor de pizza favorita");
								System.out.println("2- Reserva boleto de peliculas en cartelera");
								System.out.println("3- Selecciona dia para tu proxima visita a la lavanderia");
								System.out.println("4- Escoje tu color favorito de pintura");
								System.out.println("5- Deja tu puntuacion sobre este sistema!");
								System.out.println("6- Salir al menu principal");
								System.out.println("6 - Regresar al menu principal");
								System.out.println("Favor ingrese su opcion: "); 	
								opcionMenu = leer.nextInt();
								leer.nextLine();
								System.out.println("");
								switch(opcionMenu)
								{
									case 5:
										//EJERCICIO 5 DE ESTRUCTURA DE CONTROL SELECTIVA SWITCH
										System.out.println("¿Cual es tu opinion sobre este sistema? : ");
										System.out.println("1- Malisimo");
										System.out.println("2- Regular");
										System.out.println("3- Basico");
										System.out.println("4- Bueno");
										System.out.println("5- Excelente");
										System.out.println("Digitar cualquier otra opcion para regresar al menu de seleccion Switch");
										System.out.print("Ingrese su opcion: ");

										int opinion;
										Scanner opinionSelect = new Scanner(System.in);				
										opinion = opinionSelect.nextInt();
										//saborPizza.nextLine();
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
											}
									break;//CIERRE DE CASE DE EJERCICIO 5 DE ESTRUCTURA DE CONTROL SELECTIVA SWITCH
									case 6:
										System.out.println("¿Queres regresar al menu principal? : ");
										System.out.println("1- Si");
										System.out.println("2- No");
										System.out.println("");
										int opcionMenuPrincipal = leer.nextInt();
										leer.nextLine();
										if(opcionMenuPrincipal == 1){
											opcionMenu = 6;
											contador = 0;
										}
										else if(opcionMenuPrincipal == 2){
											opcionMenu = 1;								
										}
										else{
											System.out.println("Opcion no valida...");
											opcionMenu = 1;
										}
									break;
									case 1:
										//EJERCICIO 1 DE ESTRUCTURA DE CONTROL SELECTIVA SWITCH
										System.out.println("¿Que sabor de pizza deseas ordenar hoy? : ");
										System.out.println("1- Hawaiana");
										System.out.println("2- Peperoni");
										System.out.println("3- Meet Lover");
										System.out.println("4- Hot Cheese");
										System.out.println("5- 3 Quesos");
										System.out.println("Digitar cualquier otra opcion para regresar al menu de seleccion Switch");
										System.out.print("Ingrese su opcion: ");

										int saborPizza;
										Scanner saborPizzaSelect = new Scanner(System.in);				
										saborPizza = saborPizzaSelect.nextInt();
										//saborPizza.nextLine();
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
										}
									break; //CIERRE DE CASE DE EJERCICIO 1 DE ESTRUCTURA DE CONTROL SELECTIVA SWITCH
									case 2:
										//EJERCICIO 2 DE ESTRUCTURA DE CONTROL SELECTIVA SWITCH
										System.out.println("¿Que pelicula deseas reservar boletos? : ");
										System.out.println("1- Titanic");
										System.out.println("2- Batman");
										System.out.println("3- Avengers");
										System.out.println("4- Interstellar");
										System.out.println("5- Toy Story");
										System.out.println("Digitar cualquier otra opcion para regresar al menu de seleccion Switch");
										System.out.print("Ingrese su opcion: ");

										int pelicula;
										Scanner peliculaSelect = new Scanner(System.in);				
										pelicula = peliculaSelect.nextInt();
										//saborPizza.nextLine();
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
										}
									break; //CIERRE DE CASE DE EJERCICIO 2 DE ESTRUCTURA DE CONTROL SELECTIVA SWITCH
									case 3:
										//EJERCICIO 3 DE ESTRUCTURA DE CONTROL SELECTIVA SWITCH
										System.out.println("¿Que dias deseas volver a la lavanderia? : ");
										System.out.println("1- Lunes");
										System.out.println("2- Martes");
										System.out.println("3- Miercoles");
										System.out.println("4- Jueves");
										System.out.println("5- Viernes");
										System.out.println("Digitar cualquier otra opcion para regresar al menu de seleccion Switch");
										System.out.print("Ingrese su opcion: ");

										int lavaderia;
										Scanner lavaderiaSelect = new Scanner(System.in);				
										lavaderia = lavaderiaSelect.nextInt();
										//saborPizza.nextLine();
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
										}
									break; //CIERRE DE CASE DE EJERCICIO 3 DE ESTRUCTURA DE CONTROL SELECTIVA SWITCH	
									case 4:
										//EJERCICIO 4 DE ESTRUCTURA DE CONTROL SELECTIVA SWITCH
										System.out.println("¿Que color de pintura desea comprar? : ");
										System.out.println("1- Blanco");
										System.out.println("2- Amarillo");
										System.out.println("3- Celeste");
										System.out.println("4- Verde");
										System.out.println("5- Rojo");
										System.out.println("Digitar cualquier otra opcion para regresar al menu de seleccion Switch");
										System.out.print("Ingrese su opcion: ");

										int pintura;
										Scanner pinturaSelect = new Scanner(System.in);				
										pintura = pinturaSelect.nextInt();
										//saborPizza.nextLine();
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
									}
									break; //CIERRE DE CASE DE EJERCICIO 4 DE ESTRUCTURA DE CONTROL SELECTIVA SWITCH
									default:
										System.out.println("Opcion no valida del menu...");
										opcionMenu = 1;
										break;
								} // cierre del switch de la variable opcionMenu
							}while(opcionMenu <= 5); // cierre de la estructura while(SUBMENU <= 5)
						break; // del case 2 opcionMenu
						case 3:
							opcionMenu = 1;
							do{	
								//SUBMENU DE EJERCICIOS ESTRUCTURA DE CONTROL REPETITIVA WHILE
								System.out.println("*******************************************");
								System.out.println("EJERCICIOS ESTRUCTURA DE CONTROL REPETITIVA WHILE...");
								System.out.println("*******************************************");
								System.out.println("");
											
								System.out.println("1 - Ejercicio 1 : Número del 1 al 100");
								System.out.println("2 - Ejercicio 2 : Calificaciones");
								System.out.println("3 - Ejercicio 3: numeros del 1 al 10 de 2 en 2");
								System.out.println("4 - Ejercicio 4: numeros del 1 al 20 de 4 en 24");
								System.out.println("5 - Ejercicio 5: numeros del 10 al 100 de 5 en 5");
								System.out.println("6 - Regresar al menu principal");
								System.out.println("Favor ingrese su opcion: "); 	
								opcionMenu = leer.nextInt();
								leer.nextLine();
								System.out.println("");
								switch(opcionMenu)
								{
									case 5:
										//EJERCICIO 5 DE ESTRUCTURA DE CONTROL REPETITIVA WHILE
										int N = 10;
										while(N<=100)
										{
										System.out.println(N);
										N+=5;
										}
									break;//CIERRE DE CASE DE EJERCICIO 5 DE ESTRUCTURA DE CONTROL REPETITIVA WHILE
									case 6:
										System.out.println("¿Queres regresar al menu principal? : ");
										System.out.println("1- Si");
										System.out.println("2- No");
										System.out.println("");
										int opcionMenuPrincipal = leer.nextInt();
										leer.nextLine();
										if(opcionMenuPrincipal == 1){
											opcionMenu = 6;
											contador = 0;
										}
										else if(opcionMenuPrincipal == 2){
											opcionMenu = 1;								
										}
										else{
											System.out.println("Opcion no valida...");
											opcionMenu = 1;
										}
									break;
									case 1:
										//EJERCICIO 1 DE ESTRUCTURA DE CONTROL REPETITIVA WHILE
										int x;
										x=1;
										while (x<=100)
										{
										System.out.print(x);
										System.out.print(" - ");
										x = x + 1;
										}

									break; //CIERRE DE CASE DE EJERCICIO 1 DE ESTRUCTURA DE CONTROL REPETITIVA WHILE
									case 2:
										//EJERCICIO 2 DE ESTRUCTURA DE CONTROL REPETITIVA WHILE
										int Estudiante=1, Calificacion;
										double Suma=0;
										

										while(Estudiante<=10)
										{
										System.out.println("Ingrese su nota: "+Estudiante);
										Calificacion = leer.nextInt();
										Estudiante++;
										Suma+=Calificacion;
										}
										System.out.println("El promedio del grupo de estudiantes es:"+(Suma/10));
										
									break; //CIERRE DE CASE DE EJERCICIO 2 DE ESTRUCTURA DE CONTROL REPETITIVA WHILE
									case 3:
										//EJERCICIO 3 DE ESTRUCTURA DE CONTROL REPETITIVA WHILE
										int Nu = 1;
										while(Nu<=10)
										{
										System.out.println(Nu);
										Nu+=2;
										}
									break; //CIERRE DE CASE DE EJERCICIO 3 DE ESTRUCTURA DE CONTROL REPETITIVA WHILE	
									case 4:
										//EJERCICIO 4 DE ESTRUCTURA DE CONTROL REPETITIVA WHILE
										int nume = 1;
										while(nume<=20)
										{
										System.out.println(nume);
										nume+=4;
										}
									break; //CIERRE DE CASE DE EJERCICIO 4 DE ESTRUCTURA DE CONTROL REPETITIVA WHILE
									default:
										System.out.println("Opcion no valida del menu...");
										opcionMenu = 1;
										break;
								} // cierre del switch de la variable opcionMenu
							}while(opcionMenu <= 5); // cierre de la estructura while(SUBMENU <= 5)
						break; // del case 3 opcionMenu	
						default:
							System.out.println("Opcion no valida del menu...");
							opcionMenu = 1;
							break;
					} // cierre del switch de la variable opcionMenu
				}while(opcionMenu <= 6); // cierre de la estructura while(opcionMenu <= 5)
			}// cierre del login
			else{
				System.out.println("Error, usuario y/o contrasena no es correcta...");
			}
			contador++;
		}while(contador <= 3); // Cierre de la estructura while(contador <= 3)
	}
}

