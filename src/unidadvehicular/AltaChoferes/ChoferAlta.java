/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Integrantes:
//221246 Yoshtin German Gutierrez Perez
//221237 Jose Fernando Duran Villatoro
//221230 Ballinas Vallejo Guadalupe del Rocio

package unidadvehicular.AltaChoferes;


public class ChoferAlta {
    private static ChoferAlta log;
    private String id_chofer;
    private String nombre;
    private String edad;
    private String cdCircula;
    public static ChoferAlta getInstance(){
        if(log == null){
           log = new ChoferAlta(null,null,null,null);
        }
        return log;
    }        

    public ChoferAlta(String id_chofer,String nombre, String edad, String cdCircula) {
        this.id_chofer=id_chofer;
        this.nombre=nombre;
        this.edad=edad;
        this.cdCircula=cdCircula;
    }

    public void setId_chofer(String id_chofer) {
        this.id_chofer = id_chofer;
    }

    public String getId_chofer() {
        return id_chofer;
    }
    
    public void setCdCircula(String cdCircula) {
        this.cdCircula = cdCircula;
    }

    public String getCdCircula() {
        return cdCircula;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "ID de chofer("+getId_chofer()+") El nombre es ("+getNombre()+") La edad es ("+getEdad()+") El codigo de circulacion ("+getCdCircula()+")"; //To change body of generated methods, choose Tools | Templates.
    }
}
