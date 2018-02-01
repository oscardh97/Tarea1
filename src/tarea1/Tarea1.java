/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario1
 */
public class Tarea1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean salir = false;
        do {
            Scanner lector = new Scanner(System.in);
            int opcion = 4;
            
            System.out.println("1.-\t Ejemplo Labels");
            System.out.println("2.-\t Ejemplo Iterator");
            System.out.println("3.-\t Ejemplo ForEach");
            System.out.println("4.-\t Salir");
            opcion = lector.nextInt();
            switch(opcion) {
                case 1:
                    int[][] matriz = generarMatriz();
                    outer:
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {

                            if (matriz[i][j] == 5) {
                                System.out.println("El valor cinco está en la posición: [" + i + ", " + j + "]");
                                break outer;
                            }
                        }
                    }
                    break;
                
                case 2:
                case 3:
                    
                    ArrayList<Persona> personas = new ArrayList<Persona>();

                    personas.add(new Persona(20, "Oscar"));
                    personas.add(new Persona(21, "David"));
                    personas.add(new Persona(58, "Juan"));
                    personas.add(new Persona(92, "Paco"));
                    personas.add(new Persona(56, "Julio"));
                    personas.add(new Persona(33, "Mateo"));
                    personas.add(new Persona(16, "Lucas"));
                    int cont = 0;
                    if (opcion == 2) {
                        Iterator iterador = personas.iterator();
                        
                        while(iterador.hasNext()) {
                            System.out.println("Persona(" + cont + ") =>\t" + iterador.next().toString());
                            cont++;
                        }
                    } else {
                        for (Persona persona : personas) {
                            System.out.println("Persona(" + cont + ") =>\t" + persona.toString());
                            cont++;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Adios");
                    salir = true;
                    break;
            }
        } while (!salir);
        
    }

    public static int[][] generarMatriz() {
        int[][] matriz = new int[10][10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("[");
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (int)Math.floor(Math.random()*(1-(10+1))+(10));
                System.out.print(matriz[i][j] + (j < 9 ? ", " : ""));
            }
            System.out.println("]");
        }
        
        return matriz;
    }
    
    
}
