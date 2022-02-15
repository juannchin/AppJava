import java.util.Scanner;
class EstructuraSwitchLAB{	
	public static void main(String[] jorge){
		Scanner opcionMenuSelect = new Scanner(System.in);
		int opcionMenu;
		do{
			System.out.println("**************************************");				
			System.out.println("-: **** BIENVENIDO/A A EJERCICIOS DE ESTRUCTURA SWITCH *** :-");
			System.out.println("**************************************");				
			System.out.println("");
			System.out.println("Favor seleccione el ejercicio de su preferencia");
			System.out.println("");
			System.out.println("1- Ordena tu sabor de pizza favorita");
			System.out.println("2- Reserva boleto de peliculas en cartelera");
			System.out.println("3- Selecciona dia para tu proxima visita a la lavanderia");
			System.out.println("4- Escoje tu color favorito de pintura");
			System.out.println("5- Deja tu puntuacion sobre este sistema!");
			System.out.println("6- Salir al menu principal");
			System.out.println("-------------------------------------------------");
			System.out.print("Ingrese su opcion: ");				
			opcionMenu = opcionMenuSelect.nextInt();
			
			System.out.println("");
			switch(opcionMenu)
			{
				case 1:
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
				break;

				case 2:
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
				break;

				case 3:
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
					break;

				case 4:
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
				break;

				case 5:
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
				break;
			} 
		} while(opcionMenu!=6);
	}
	//opcionMenuSelect.close();
		
}