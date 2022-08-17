package com.repaso.poo;

public class Estudiante extends Persona {


    //Constructor de la clase estudiante que recibe dos parametros
    public Estudiante(String nombre,String apellido){
        setNombre(nombre);
        setApellido(apellido);
    }

    public Estudiante(){

    }


    public String NombresCompletos(){
        return getNombre() + " " + getApellido();
    }

}
