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
                    int soc=0;
                    System.out.println("Seleccione que socio quiere ingresar primero, el socio 1 o el socio 2 (ingrese 1 o 2)");
                    soc=in.nextInt();
                    while (soc<1 || soc >2){
                        System.out.println("Ingrese un número correcto (1 o 2)");
                        soc=in.nextInt();
                    }
                    if (soc==1){
                        i1.setSocio(c1);
                    }
                    else {
                        i2.setSocio(c2);
                    }                    
                    i1.setActividad(a1);
                    i2.setActividad(a1);
                    System.out.println("Ingrese hora de la Actividad en la primera inscripción");
                    int h1=0;
                    while (h1<6 || h1>20){
                        System.out.println("Ingrese una hora válida (de 6 a 20 hs)");
                        h1=in.nextInt();
                    }
                    a1.setHorac(h1);
                    int aux1=h1-1;
                    i1.setHora(aux1);
                    System.out.println("Se le pasará a buscar a las "+ aux1+ "hs");
                    System.out.println("Ingrese hora de la Actividad en la segunda inscripción");
                    int h2=0;
                    while (h2<6 || h2>20){
                        System.out.println("Ingrese una hora válida (de 6 a 20 hs)");
                        h2=in.nextInt();
                    }
                    a1.setHorac(h2);
                    int aux2=h2-1;
                    i2.setHora(aux2);
                    System.out.println("La hora que se lo pasará a buscar sera a las "+ aux2+ "hs");
                    
                    
                    
                    
                    
                    
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
    public static Socio ingresarSocio(){
        Socio s = null;
        String nom= null;
        Scanner input = new Scanner (System.in);
        System.out.println("Ingrese nombre del Socio");
        nom=input.nextLine();
        int ed=0;
        System.out.println("Ingresar Edad");
        ed=input.nextInt();
        int ced=0;
        System.out.println("Ingresar documento");
        ced=input.nextInt();
        String dir=null;
        System.out.println("Ingresar dirección");
        dir=input.nextLine();
        return s;
    }
    public static Actividad ingresarActividad(){
        Scanner inp= new Scanner(System.in);
        Actividad a = null;
        int dia =0;
        System.out.println("Ingrese día de la Actividad");
        dia=inp.nextInt();
        int tipo=0;
        System.out.println("Ingrese tipo de Actividad");
        tipo=inp.nextInt();
        int capamax = 0;
        System.out.println("Ingrese Capacidad Máxima");
        capamax=inp.nextInt();
        int costo=0;
        System.out.println("Ingrese costo");

    }
}

