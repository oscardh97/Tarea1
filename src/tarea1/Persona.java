/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author Usuario1
 */

public class Persona {
    int edad;
    String nombre;

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public String toString() {
        return "Nombre:\t" + nombre + "\t Edad:\t" + edad;
    }
}