/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas1.pkg1;

import java.util.Scanner;

/**
 *
 * @author garci
 */
public class Colas11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cola[] = new char[26];
        int Respuesta = 0, Tope = 0;
        do {
            System.out.println(" 1. Agregar dato ");
            System.out.println(" 2. Mostrar cola ");
            System.out.println(" 3. Eliminar ultimo dato ");
            System.out.println(" 4. Eliminar primer dato ");
            System.out.println(" 5. Vaciar cola ");
            System.out.println(" 6. salir \n");
            Respuesta = sc.nextInt();
            switch (Respuesta) {
                case 1: {
                    System.out.println(" Agregar dato ");
                    cola[Tope] = sc.next().charAt(0);//comando para leer un caracter
                    Tope++;
                    System.out.println(" ... Agregado ");
                }
                break;
                case 2: {
                    for (int x = 0; x < Tope; x++) {
                        System.out.println(cola[x] + " ");
                    }

                }
                break;
                case 3: {
                    Tope--;
                    System.out.println(" Dato eliminado con exito c: ");

                }
                break;
                case 4: {
                    for (int x = 0; x < (Tope - 1); x++) {
                        cola[x] = cola[x + 1];

                    }
                    Tope--;
                    System.out.println(" Dato eliminado con exito c: ");

                }
                break;
                case 5:{
                    Tope=0;
                    System.out.println(" Vacio :c... "); 
                }
                break;
                default:{
                    System.out.println(" Esta opcion no existe >:v ");
                }
                break;
            }
        } while (Respuesta != 6);
        System.out.println(" fin ");
        // TODO code application logic here
    }

}
// Y U O M M P  TOPE=5  TOPE-1 =4
// 0 1 2 3 4 5    X= 4 
