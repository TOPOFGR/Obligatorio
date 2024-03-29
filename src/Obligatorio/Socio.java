/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Obligatorio;

/**
 *
 * @author Franco Galeano y Felipe Estrella
 */
public class Socio {

    //variables de instancia
    private String nombre;
    private int edad;
    private int ci;
    private String direccion;

    //Constructores
    public Socio() {
        this.setNombre("Pepe");
        this.setEdad(18);
        this.setCi(49396412);
        this.setDireccion("Av. Brasil");
    }

    public Socio(String unNombre, int unaEdad, int unaCi, String unaDireccion) {
        this.setNombre(unNombre);
        this.setEdad(unaEdad);
        this.setCi(unaCi);
        this.setDireccion(unaDireccion);
    }

    //metodos de acceso y modificacion    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int unaEdad) {
        this.edad = unaEdad;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int unaCi) {
        this.ci = unaCi;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String unaDireccion) {
        this.direccion = unaDireccion;
    }

    @Override
    public String toString() {
        return ("Socio de Nombre " + this.getNombre() + " con  " + this.getEdad() + "años, de CI " + this.getCi() + " y de dirección " + this.getDireccion());
    }

}
