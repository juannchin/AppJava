/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.util.Scanner;

/**
 *
 * @author Acevedo
 */
public class Sistema {

   /**
    * 
    * @param args 
    */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner leerDatos = new Scanner(System.in);
        int respuesta = 1;
        int opcionesMenuPrincipal = 1;
        Usuarios usuarios = new Usuarios();
        int contador = 1;        
        
        System.out.println("Cantidad de correos: " + usuarios.getCantidadCorreos());
        do{
            System.out.print("Ingrese su usuario: ");
            String elUsuario = leerDatos.nextLine();
            System.out.print("Ingrese la clave: ");
            String laClave = leerDatos.nextLine();
            System.out.println("");

            boolean estadoLogin = false;

            estadoLogin = usuarios.login(elUsuario, laClave);

            if(estadoLogin){
                System.out.println("Bienvenido al sistema... ");  
                do{
                    /*
                    Antes de mostrar el menú de opciones mostar el nombre de usuario en el
                    menú de opciones
                    Ejemplo
                    nombre de usuario = jacevedo69@utec
                    nombre del usuario = Jorge 69 Acevedo 69
                    
                    Para las opciones de editar cualquier dato, no pemitir editar los datos
                    del usuario actual que ingresado en el sistema
                    */
                    System.out.println("▓▓▓▓▓▓▓▓▓ MENÚ DE OPCIONES javevedo69@utec ▓▓▓▓▓▓▓▓▓");
                    System.out.println("1- Listado de usuarios");
                    System.out.println("2- Agregar usuarios");
                    System.out.println("3- Buscar usuarios");
                    System.out.println("4- Eliminar usuarios");
                    /*
                        Para editar los datos del usuario mostrar el siguiente menu
                        1- Editar correo
                        2- Editar nombres
                        3- Editar apellidos
                        4- Cancelar -> Retorna al menú pp
                        Validar la entrada de la opciones del menu editar
                    */
                    System.out.println("5- Editar usuarios");
                                
                    System.out.println("6- Cambiar contraseña");
                    System.out.println("7- Cambiar nivel de usuario");
                    System.out.println("8- Listado de usuarios nivel usuario");
                    System.out.println("9- Listado de usuarios nivel asistente");
                    System.out.println("10- Listado de usuarios nivel administrador");
                    System.out.println("11- Acerca de...");
                    System.out.println("12- Cerrar sesión");
                    System.out.println("13- Salir del sistema"); 
                    System.out.println("");
                    System.out.print("Ingrese su opción del menú: ");
                    opcionesMenuPrincipal = leerDatos.nextInt();
                    leerDatos.nextLine();
                    switch(opcionesMenuPrincipal){
                        case 11:
                            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
                            System.out.println("░░░░░░░░░ ACERCA DE...  ░░░░░░░░░░░░");
                            System.out.println("░░░░░░░░░ Jorge Acevedo ░░░░░░░░░░░░");
                            System.out.println("░░░░░░░░░ V1.0          ░░░░░░░░░░░░");
                            System.out.println("░░░░░░░░░ 17-6122-200   ░░░░░░░░░░░░");
                            System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");                            
                        break;
                        case 8:
                            System.out.println("░░░ LISTADO DE USUARIOS NIVEL USUARIO ░░░");
                            int cantidadUsuariosUsuario = usuarios.getCantidadCorreos();
                            for(int indice = 0; indice < cantidadUsuariosUsuario; indice++){
                                String nivelMostrar = usuarios.getNivel(indice);
                                if(nivelMostrar.equals("1")){
                                    System.out.println("Correo: " + usuarios.getCorreo(indice));
                                    System.out.println("Nombres: " + usuarios.getNombre(indice));
                                    System.out.println("Apellidos: " + usuarios.getApellidos(indice));
                                    System.out.println("Claves: " + usuarios.getClave(indice));
                                    /*
                                        Mostrar el nivel del usuario correspondiente 
                                    */
                                    System.out.println("Nivel: " + usuarios.getNivel(indice));
                                    System.out.println("│││││││││││││││││││││││││││");
                                }
                            }   
                        break;
                       case 9:
                            System.out.println("░░░ LISTADO DE USUARIOS NIVEL ASISTENTE ░░░");
                            int cantidadUsuariosAsistente = usuarios.getCantidadCorreos();
                            for(int indice = 0; indice < cantidadUsuariosAsistente; indice++){
                                String nivelMostrar = usuarios.getNivel(indice);
                                if(nivelMostrar.equals("2")){
                                    System.out.println("Correo: " + usuarios.getCorreo(indice));
                                    System.out.println("Nombres: " + usuarios.getNombre(indice));
                                    System.out.println("Apellidos: " + usuarios.getApellidos(indice));
                                    System.out.println("Claves: " + usuarios.getClave(indice));
                                    /*
                                        Mostrar el nivel del usuario correspondiente 
                                    */
                                    System.out.println("Nivel: " + usuarios.getNivel(indice));
                                    System.out.println("│││││││││││││││││││││││││││");
                                }
                            }   
                        break;
                       case 10:
                            System.out.println("░░░ LISTADO DE USUARIOS NIVEL ADMINISTRADOR ░░░");
                            int cantidadUsuariosAdministrador = usuarios.getCantidadCorreos();
                            for(int indice = 0; indice < cantidadUsuariosAdministrador; indice++){
                                String nivelMostrar = usuarios.getNivel(indice);
                                if(nivelMostrar.equals("3")){
                                    System.out.println("Correo: " + usuarios.getCorreo(indice));
                                    System.out.println("Nombres: " + usuarios.getNombre(indice));
                                    System.out.println("Apellidos: " + usuarios.getApellidos(indice));
                                    System.out.println("Claves: " + usuarios.getClave(indice));
                                    /*
                                        Mostrar el nivel del usuario correspondiente 
                                    */
                                    System.out.println("Nivel: " + usuarios.getNivel(indice));
                                    System.out.println("│││││││││││││││││││││││││││");
                                }
                            }   
                        break;
                        case 7:
                            System.out.println(" ::::: CAMBIAR NIVEL USUARIO ::::: ");
                            System.out.print("Ingre el correo del usuario: ");
                            String elCorreoNivel = leerDatos.nextLine();
                            
                            int indiceNivel = usuarios.buscarCorreo2(elCorreoNivel);
                            if(indiceNivel != -1){
                                /*
                                    Para las opciones de nivel no mostrar el nivel actual del usuario 

                                    Mostrar el nivel del usuario correspondiente
                                */
                                System.out.println("Nivel de usuario actual es: " + usuarios.getNivel(indiceNivel));
                                System.out.println(" -- ::Seleccionar un nivel para el usuario :: --");
                                System.out.println("1- Usuario");
                                System.out.println("2- Asistente");
                                System.out.println("3- Administrador");
                                System.out.println("");
                                System.out.println("Ingres la opción del nivel: ");
                                String opcionNivel = leerDatos.nextLine();
                                usuarios.editarNivel(indiceNivel, opcionNivel);
                                System.out.println(" -- NIVEL EDITADO PARA USUARIO --");
                            }
                            else{
                                System.out.println("*** CORREO EDITAR NIVEL NO EXISTE ***");
                            }
                        break;
                        case 6:                            
                            System.out.println(" ::::: CAMBIAR CONTRASEÑA ::::: ");
                            System.out.print("Ingre el correo del usuario: ");
                            String elCorreoEditar = leerDatos.nextLine();
                            
                            /*
                            Validar que la nueva contraseña sea igual a la confirmación
                            si son iguales cambiar la contraseña de lo contrario no permitir
                            */
                            System.out.print("Ingrese la nueva clave: ");
                            String nuevaClave = leerDatos.nextLine();
                            System.out.print("Confirme su clave: ");
                            String confirmarClave = leerDatos.nextLine();
                            
                            int indiceCorreoEditar = usuarios.buscarCorreo2(elCorreoEditar);
                            if(indiceCorreoEditar != -1){
                                usuarios.editarClave(indiceCorreoEditar, nuevaClave);
                            }
                            else{
                                System.out.println(" ::::: NO EXISTE EL USUARIO ::::: ");  
                            }
                        break;
                        case 4:
                            System.out.println(" ::::: ELIMINAR USUARIO ::::: ");
                            System.out.print("Ingre el correo del usaurio: ");
                            String elCorreoEliminar = leerDatos.nextLine();
                            int indiceCorreoEliminar = usuarios.buscarCorreo2(elCorreoEliminar);
                            if(indiceCorreoEliminar != -1){
                                usuarios.eliminarUsuario(indiceCorreoEliminar);
                                System.out.println(" ::::: REGISTRO ELIMINADO ::::: ");  
                            }
                            else{
                                System.out.println(" ::::: NO EXISTE EL USUARIO ::::: ");                                
                            }
                        break;
                        case 3:
                            System.out.println(" ::::: BUSCAR USUARIO ::::: ");
                            System.out.print("Ingrese el correo a buscar: ");
                            String correoBuscar = leerDatos.nextLine();
                            int indiceEncontradoBuscar = usuarios.buscarCorreo2(correoBuscar);
                            if(indiceEncontradoBuscar != -1){
                                System.out.println(" ::::: DATOS ENCONTRADOS ::::: ");
                                System.out.println("Correo: " + usuarios.getCorreo(indiceEncontradoBuscar));
                                System.out.println("Nombres: " + usuarios.getNombre(indiceEncontradoBuscar));
                                System.out.println("Apellidos: " + usuarios.getApellidos(indiceEncontradoBuscar));
                                System.out.println("Clave: " + usuarios.getClave(indiceEncontradoBuscar));
                                /*
                                    Mostrar el nivel del usuario correspondiente 
                                */
                                System.out.println("Nivel: " + usuarios.getNivel(indiceEncontradoBuscar));
                            }
                            else{
                                System.out.println(" ::::: NO EXISTE EL CORREO ::::: ");
                                System.out.println("");
                            }
                        break;
                        case 2:
                            System.out.println("░░░ AGREGAR NUEVO USUARIO ░░░");
                            /*
                            Validar que el nuevo correo no existe en la base de datos
                            antes continuar o almacenar la información
                            */
                            System.out.print("Ingrese el correo: ");
                            String elCorreoNuevo = leerDatos.nextLine();
                            System.out.print("Ingrese los nombres: ");
                            String losNombresNuevo = leerDatos.nextLine();
                            System.out.print("Ingrese los apellidos: ");
                            String losApellidosNuevo = leerDatos.nextLine();
                            
                            /*
                            Validar que la nueva contraseña sea igual a la confirmación
                            si son iguales cambiar la contraseña de lo contrario no
                            almacenar los datos
                            */
                            System.out.print("Ingrese la clave: ");
                            String laClaveNuevo = leerDatos.nextLine();
                            System.out.print("Confirme la contraseña: ");
                            String confirmacion = leerDatos.nextLine();
                            
                            System.out.println("::::: Seleccionar un nivel de usuario :::::");
                            /*
                            Validar las opciones de entrada del nivel del usuario
                            solo opciones 1, 2 ó 3
                            */
                            System.out.println("1- Usuario");
                            System.out.println("2- Asistente");
                            System.out.println("3- Administrador");
                            System.out.println("");
                            String opcionNivel = leerDatos.nextLine();
                            
                            usuarios.setUsuario(elCorreoNuevo, losNombresNuevo, losApellidosNuevo, laClaveNuevo, opcionNivel);
                            System.out.println("Datos almacenados");
                            
                        break;
                        case 13:
                            int opcionSalir = 0;
                            do{
                                System.out.println("Salir del sistema?: 1 = si, 0 = no");
                                opcionSalir = leerDatos.nextInt();
                                leerDatos.nextLine();
                                if(opcionSalir == 1){
                                    opcionesMenuPrincipal = 13;
                                    contador = 4;
                                }
                                else if(opcionSalir == 0){
                                    opcionesMenuPrincipal = 1;
                                    opcionSalir = 1;
                                }
                            }while(opcionSalir != 1);
                        break;
                        case 12:
                            int opcionSesion = 0;
                            do{
                                System.out.println("Cerrar sesión: 1 = si, 0 = no");
                                opcionSesion = leerDatos.nextInt();
                                leerDatos.nextLine();
                                if(opcionSesion == 1){
                                    opcionesMenuPrincipal = 13;
                                    contador = 0;
                                }
                                else if(opcionSesion == 0){
                                    opcionesMenuPrincipal = 1;
                                    opcionSesion = 1;
                                }
                            }while(opcionSesion != 1);
                        break;
                        case 1:
                            System.out.println("░░░ LISTADO DE USUARIOS ░░░");
                            int cantidadUsuarios = usuarios.getCantidadCorreos();
                            for(int indice = 0; indice < cantidadUsuarios; indice++){
                                System.out.println("Correo: " + usuarios.getCorreo(indice));
                                System.out.println("Nombres: " + usuarios.getNombre(indice));
                                System.out.println("Apellidos: " + usuarios.getApellidos(indice));
                                System.out.println("Claves: " + usuarios.getClave(indice));
                                /*
                                    Mostrar el nivel del usuario correspondiente 
                                */
                                System.out.println("Nivel: " + usuarios.getNivel(indice));
                                System.out.println("│││││││││││││││││││││││││││");
                            }                        
                        break;
                    }
                }while(opcionesMenuPrincipal <= 11);
            }
            else{
                System.out.println("Error, usuario y/o contraseña no válida...");
            }
            contador++;
        }while(contador <= 3);
        /*
        do{
            
            System.out.print("Ingrese el correo: ");
            String elCorreo = leerDatos.nextLine();
            System.out.print("Ingrese el Nombre: ");
            String elNombre = leerDatos.nextLine();
            System.out.print("Ingrese el apellidos: ");
            String elApellido = leerDatos.nextLine();
            System.out.print("Ingrese la clave: ");
            String laClaveNueva = leerDatos.nextLine();
            System.out.print("Ingrese el nivel: ");
            String elNivel = leerDatos.nextLine();
           
            usuarios.setUsuario(elCorreo, elNombre, elApellido, laClaveNueva, elNivel);
            System.out.println("Cantidad de elementos: " + usuarios.getCantidadCorreos());
            
            System.out.println("Continuar 1 = si");
            respuesta = leerDatos.nextInt();
            leerDatos.nextLine();
        }while(respuesta == 1);
        */
    }
    
}
