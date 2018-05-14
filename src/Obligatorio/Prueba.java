/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obligatorio;

import java.util.Scanner;

/**
 *
 * @author Franco Galeano y Felipe Estrella
 */
public class Prueba {

    public static void main(String[] args) {
        //Definir, los dos socios, una actividad y dos inscripciones
        Socio c1 = new Socio("Pepe", 18, 49396412, "Av. Brasil");
        Socio c2 = new Socio("Carlos", 24, 49602653, "Bv. España");
        Actividad a1 = new Actividad(12,1,200,180,18);
        int opc = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Seleccione opción del menú");
        do {
            System.out.println("Ingrese opción");

            switch (opc) {

                case 1: {
                    int soc = 0;
                    System.out.println("Indique cual socio se modificará");
                    soc = in.nextInt();
                    if (soc == 1) {

                        String nuevaDir1 = null;
                        System.out.println("Ingrese nueva Dirección");
                        nuevaDir1 = in.nextLine();
                        c2.setDireccion(nuevaDir1);
                        System.out.println("Ingrese nueva Edad");
                        int nuevaEdad1 = 0;
                        nuevaEdad1 = in.nextInt();
                        c2.setEdad(nuevaEdad1);
                    }
                    if (soc == 2) {
                        String nuevaDir2 = null;
                        System.out.println("Ingrese nueva Dirección");
                        nuevaDir2 = in.nextLine();
                        c2.setDireccion(nuevaDir2);
                        System.out.println("Ingrese nueva Edad");
                        int nuevaEdad2 = 0;
                        nuevaEdad2 = in.nextInt();
                        c2.setEdad(nuevaEdad2);
                    }
                    break;
                }
                case 2: {
                    Inscripcion i1 = new Inscripcion();
                    Inscripcion i2 = new Inscripcion();
                    i1.setSocio(c1);
                    i2.setSocio(c2);
                    int h1=0;
                    int h2=0;
                    int aux1=h1-1;
                    int aux2=h2-1;
                    
                    
                    
                    break;
                }
                case 3: {
                    
                    break;
                }
                case 4: {
                    
                    break;
                }
                case 5: {

                    break;
                }
                default: {
                    System.out.println("Ingrese un número del 1-6");
                }
            }

        } while (opc != 6);

    }
}
