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
public class Actividad {

    //variables de instancia
    private int dia;
    private int tipo;
    private int capmax;
    private int costo;
    private int horac;

    //constructores
    public Actividad() {
        this.setDia(4);
        this.setTipo(1);
        this.setCapmax(28);
        this.setCosto(200);
        this.setHorac(18);
    }

    public Actividad(int unDia, int unTipo, int unaCapmax, int unCosto, int unaHorac) {
        this.setDia(unDia);
        this.setTipo(unTipo);
        this.setCapmax(unaCapmax);
        this.setCosto(unCosto);
        this.setHorac(unaHorac);
    }

    //metodos de acceso y modificación
    public int getDia() {
        return dia;
    }
        
    public void setDia(int unDia) {
        this.dia = unDia;
    }
    
    public int getTipo() {
        return tipo;
    }    
    
    public void setTipo(int unTipo) {
        this.tipo = unTipo;
    }

    public int getCapmax() {
        return capmax;
    }

    public void setCapmax(int unaCapmax) {
        this.capmax = unaCapmax;
    }

    public int getCosto() {
        return costo;
    }

        public void setCosto(int unCosto) {
        this.costo = unCosto;
    }

    public int getHorac() {
        return horac;
    }
            
    public void setHorac(int unaHorac) {
        this.horac = unaHorac;
    }

    @Override
    public String toString() {
        return ("Actividad el dia "  + this.getDia() + ", de tipo" + this.getTipo() + ", con la capacidad máxima de " + this.getCapmax() + " personas, con el costo" + this.getCosto() + ", con la hora de comienzo " + this.getHorac() );
    }

    
}
