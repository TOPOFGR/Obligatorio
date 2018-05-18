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
        Socio c1 = ingresarSocio();
        Socio c2 = ingresarSocio();
        Actividad a1 = ingresarActividad();
        Inscripcion i1 = null;
        Inscripcion i2 = null;
        //Se empieza el menú
        int opc = 0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Seleccione opción del menú");
            System.out.println("1)Actualización de datos de socio");
            System.out.println("2) Inscripciones a actividad");
            System.out.println("3) Listado de inscripciones");
            System.out.println("4) Actualización de hora de actividad");
            System.out.println("5) Mostrar datos");
            System.out.println("6) Terminar");
            opc = in.nextInt();
            switch (opc) {

                case 1: {
                    System.out.println("Indique cual socio se modificará");
                    int soc = in.nextInt();
                    switch (soc){
                        case 1:{
                                String nuevaDir1 = in.nextLine();
                        System.out.println("Ingrese nueva Dirección");
                        nuevaDir1 = in.nextLine();
                        c2.setDireccion(nuevaDir1);
                        System.out.println("Ingrese nueva Edad");
                        int nuevaEdad1 = in.nextInt();
                        c2.setEdad(nuevaEdad1);
                            break;
                        }
                        case 2:{
                            String nuevaDir2 = in.nextLine();
                        System.out.println("Ingrese nueva Dirección");
                        nuevaDir2 = in.nextLine();
                        c2.setDireccion(nuevaDir2);
                        System.out.println("Ingrese nueva Edad");
                        int nuevaEdad2 = in.nextInt();
                        c2.setEdad(nuevaEdad2);                    
                            break;
                        }
                        default:{
                            System.out.println("Ingrese un socio válido (1 o 2)");                            
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Seleccione que socio quiere ingresar primero, el socio 1 o el socio 2 (ingrese 1 o 2)");
                    int soc = in.nextInt();
                    while (soc < 1 || soc > 2) {
                        System.out.println("Ingrese un número correcto (1 o 2)");
                        soc = in.nextInt();
                    }
                    if (soc == 1) {
                        i1.setSocio(c1);
                        i2.setSocio(c2);
                    } else {
                        i2.setSocio(c1);
                        i1.setSocio(c2);
                    }
                    i1.setActividad(a1);
                    i2.setActividad(a1);
                    System.out.println("Ingrese hora de la Actividad en la primera inscripción");
                    int h1 = in.nextInt();
                    while (h1 < 6 || h1 > 20) {
                        System.out.println("Ingrese una hora válida (de 6 a 20 hs)");
                        h1 = in.nextInt();
                    }
                    a1.setHorac(h1);
                    int aux1 = h1 - 1;
                    i1.setHora(aux1);
                    System.out.println("Se le pasará a buscar a las " + aux1 + "hs");
                    System.out.println("Ingrese hora de la Actividad en la segunda inscripción");
                    int h2 = in.nextInt();
                    while (h2 < 6 || h2 > 20) {
                        System.out.println("Ingrese una hora válida (de 6 a 20 hs)");
                        h2 = in.nextInt();
                    }
                    a1.setHorac(h2);
                    int aux2 = h2 - 1;
                    i2.setHora(aux2);
                    System.out.println("La hora que se lo pasará a buscar sera a las " + aux2 + "hs");
                    break;
                    
                }
                case 3: {
                    if (i1 == null) {
                        System.out.println("No hay inscripciones");
                    }
                    /*
                    else{
                        System.out.println("Esto lo hace vos Estrella");
                    }
                    */
                    break;
                }
                case 4: {
                    if (i1==null){
                        System.out.println("No hay inscripciones");
                    }
                    System.out.println("Ingrese nueva hora de Actividad");
                    int nuevaHoraActividad = in.nextInt();
                    while (nuevaHoraActividad<7 || nuevaHoraActividad>21){
                        System.out.println("Seleccione hora valida (7-21)");
                        nuevaHoraActividad = in.nextInt();    
                    }
                    int relacion= nuevaHoraActividad - a1.getHorac();
                        a1.setHorac(nuevaHoraActividad);
                    if (i1==null){
                        System.out.println("No hay inscripciones");
                    }
                    else {
                        i1.setHora(i1.getHora() +relacion);
                        while (i1.getHora()<6){
                            i1.setHora(i1.getHora()+1);
                        }
                        i2.setHora(i2.getHora() +relacion);
                        while (i2.getHora()<6){
                            i2.setHora(i2.getHora()+1);
                        }
                        System.out.println("La nueva hora de la Actividad es "+a1.getHorac()+", la hora de la primera inscripcion es "+i1.getHora()+" y el de la segunda inscripcion"+i2.getHora());
                    }
                    break;
                }
                case 5: {
                    if (i1 == null) {
                        System.out.println("No se crearon inscripciones, la Actividad es " + a1 + " y los Socios son " + c1 + " y " + c2);
                    } else {
                        System.out.println("Primera " + i1);
                        System.out.println("Segunda " + i2);
                    }
                    break;
                }
                default: {
                    System.out.println("Ingrese un número del 1-6");
                    opc = in.nextInt();
                    break;
                }
            }
        } while (opc != 6);
    }
//Se hace el método para poder ingresar los datos de los Socios

    public static Socio ingresarSocio() {
        Socio s = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese nombre del Socio");
        String nom = input.nextLine();
        System.out.println("Ingresar Edad");
        int ed = input.nextInt();
        System.out.println("Ingresar documento");
        int ced = input.nextInt();
        input.nextLine();
        System.out.println("Ingresar dirección");
        String dir = input.nextLine();
        s = new Socio(nom, ed, ced, dir);
        return s;
    }
//Se hace el método para poder ingresar los datos de la Actividad

    public static Actividad ingresarActividad() {
        Scanner inp = new Scanner(System.in);
        Actividad a = null;
        System.out.println("Ingrese día de la Actividad");
        int dia = inp.nextInt();
        while (dia < 1 || dia > 31) {
            System.out.println("Ingrese día entre 1-31");
            dia = inp.nextInt();
        }
        System.out.println("Ingrese tipo de Actividad");
        int tipo = inp.nextInt();
        while (tipo < 1 || tipo > 7) {
            System.out.println("Ingrese actividad entre 1-7");
            tipo = inp.nextInt();
        }
        System.out.println("Ingrese Capacidad Máxima");
        int capamax = inp.nextInt();
        System.out.println("Ingrese costo");
        int costo = inp.nextInt();
        System.out.println("Ingrese la hora de comienzo");
        int horac = inp.nextInt();
        while (horac < 6 || horac > 20) {
            System.out.println("Seleccione hora de comienzo (6-20)");
            horac = inp.nextInt();
        }
        a = new Actividad(dia, tipo, capamax, costo, horac);
        return a;
    }
}
