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
public class Inscripcion {

    //variables de instancia 
    private int hora;
    private Socio socio;
    private Actividad actividad;
    private int tel;
    
    //Constructores
    public Inscripcion(){
        this.setHora (12);
        this.setSocio (new Socio());
        this.setActividad (new Actividad());
        this.setTel (27072345);
    }

    public Inscripcion(int unaHora, Socio unSocio, Actividad unaActividad, int unTel) {
        this.setHora (unaHora);
        this.setSocio (unSocio);
        this.setActividad  (unaActividad);
        this.setTel (unTel);
    }

    //métodos de acceso y modificación
    public int getHora() {
        return hora;
    }

    public void setHora(int unaHora) {
        this.hora = unaHora;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio unSocio) {
        this.socio = unSocio;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return ("Inscripción en la " + "hora " + this.getHora() + ", del socio " + this.getSocio() + ", a la actividad " + this.getActividad() + ", con el telefono de contacto" + this.getTel()  );
    }
    
}
