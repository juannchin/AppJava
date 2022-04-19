/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.util.ArrayList;

/**
 *
 * @author Acevedo
 */
public class Usuarios {
    private ArrayList correos;
    private ArrayList nombres;
    private ArrayList apellidos;
    private ArrayList claves;
    private ArrayList niveles;    
    
    /**
     * dft hsrt hsr serd fgsrd fgserdfg s
     */
    public Usuarios(){
        correos = new ArrayList();
        nombres = new ArrayList();
        apellidos = new ArrayList();
        claves = new ArrayList();
        niveles = new ArrayList();
        int nivel = 1;
        
        for(int indice = 1; indice <= 100; indice++){
            correos.add("jacevedo" + indice + "@utec");
            nombres.add("Jorge " + indice);
            apellidos.add("Acevedo " + indice);
            claves.add("clave" + indice);
            niveles.add(nivel);
            nivel++;
            if(nivel == 4) nivel = 1;
        }
    }
    
    /**
     * 
     * @param correos - asdfasdfasd fasd fasd f
     * @param nombres a df-asd fasd fasd fasd fasd fads
     * @param apellidos -a sdf asd fasd fasd fasdf 
     * @param claves -asd fasd fasd f
     * @param niveles a sd-a sdfasd fad fad fa
     * 
     *  dfasd fasd fas fgasgaer gzdfggdf
     */
    public void setUsuario(String correos, 
                            String nombres, 
                            String apellidos, 
                            String claves, 
                            String niveles){
        this.correos.add(correos);
        this.nombres.add(nombres);
        this.apellidos.add(apellidos);
        this.claves.add(claves);
        this.niveles.add(niveles);                
    }
    /**
     * as dfasd fasd fasd fasd fasd f
     * @return a sdfasdf asd fasd fasd fasd f
     */
    public int getCantidadCorreos(){
        return correos.size();
    }
    
    /**
     * Este método se utiliza para determinar si existe un correo en el 
     * array correos
     * contains => Retorna verdadero si en encuentra el dato buscado
     * contains => Retorna falso en caso no en encuentra el dato buscado
     * @param elCorreoBuscar Recib el correo a buscar en el array
     * @return retorna Retorna verdadero si en encuentra el dato 
     *          buscado o Retorna falso en caso no en encuentra el dato buscado
     */
    public boolean buscarCorreo(String elCorreoBuscar){
        //contains => Retorna verdadero si en encuentra el dato buscado
        //contains => Retorna falso en caso no en encuentra el dato buscado
        return correos.contains(elCorreoBuscar);
    }
    public int buscarCorreo2(String elCorreoBuscar){
        //indexOf => Retorna el índice del valor encontrado dentro del array
        //indexOf => Retorna -1 en caso no encuentra el valor buscado
        return correos.indexOf(elCorreoBuscar);
    }
    
    /*
    Validar que en caso no encuentra correo y correo retorana -1
    lo que permite ingresar al sistema, validar este error                         
    */
    public boolean login(String elUsuario, String laClave){
        int indiceCorreoEncontrado = buscarCorreo2(elUsuario);
        int indiceClaveEncontrada = claves.indexOf(laClave);
        if(indiceCorreoEncontrado != -1 && indiceCorreoEncontrado != -1){
            if(indiceCorreoEncontrado == indiceClaveEncontrada){
                return true;
            }
            else{
                return false;
            } 
        }
        else{
            return false;
        }
               
    }
    public String getCorreo(int indiceCorreo){
        return correos.get(indiceCorreo).toString();
    }
    public String getNombre(int indiceCorreo){
        return nombres.get(indiceCorreo).toString();
    }
    public String getApellidos(int indiceCorreo){
        return apellidos.get(indiceCorreo).toString();
    }
    public String getClave(int indiceCorreo){
        return claves.get(indiceCorreo).toString();
    }
    public String getNivel(int indiceCorreo){
        return niveles.get(indiceCorreo).toString();
    }    
    public void eliminarUsuario(int indiceCorreoEliminar){
        correos.remove(indiceCorreoEliminar);
        nombres.remove(indiceCorreoEliminar);
        apellidos.remove(indiceCorreoEliminar);
        claves.remove(indiceCorreoEliminar);
        niveles.remove(indiceCorreoEliminar);
    }
    public void editarClave(int indiceClaveEditar, String claveNueva){
        claves.set(indiceClaveEditar, claveNueva);
    }    
    public void editarNivel(int indice, String nivelNuevo){
        niveles.set(indice, nivelNuevo);
    }
}
