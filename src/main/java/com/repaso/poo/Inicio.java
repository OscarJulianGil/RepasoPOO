package com.repaso.poo;

public class Inicio {

    public static void main(String[] args) {

        //Creo una instancia de la clase Zapato
        Zapato miZapato = new Zapato();
        miZapato.setTalla(34);
        miZapato.setColor("Gris");
        miZapato.setMarca("Arturo Calle");

        Zapato miZapatoDos = new Zapato();
        miZapatoDos.setTalla(34);
        miZapatoDos.setColor("Negro");
        miZapatoDos.setMarca("Aquiles");

        //Creo objetos del tipo Estudiante
        Estudiante nuevoEstudiante = new Estudiante("Pepito","Perez");

        Estudiante otroEstudiante = new Estudiante();
        otroEstudiante.setNombre("Maria");
        otroEstudiante.setApellido("Granados");
        //Creo objeto de la clase Persona
        Persona nuevaPersona = new Persona();




        //System.out.println(miZapatoDos.getMarca());
        //System.out.println(miZapato.getMarca());

        System.out.println(nuevoEstudiante.NombresCompletos());
        System.out.println(otroEstudiante.NombresCompletos());
    }
}
