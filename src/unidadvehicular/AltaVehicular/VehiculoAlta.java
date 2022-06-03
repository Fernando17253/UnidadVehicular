/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidadvehicular.AltaVehicular;


public class VehiculoAlta {
    private static VehiculoAlta log;
    private String marca;
    private String linea;
    private String nacion;
    private String anos;
    private String asignado;
    private int costo;
    public static VehiculoAlta getInstance(){
        if(log == null){
           log = new VehiculoAlta(null,null,null,null,null,0);
        }
        return log;
    }        

    public VehiculoAlta(String asignado,String marca, String linea, String nacion, String anos,int costo) {
        this.asignado=asignado;
        this.marca=marca;
        this.linea=linea;
        this.nacion=nacion;
        this.anos=anos;
        this.costo=costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCosto() {
        return costo;
    }

    public void setAsignado(String asignado) {
        this.asignado = asignado;
    }

    public String getAsignado() {
        return asignado;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;

    }
   
    public String getMarca() {
        return marca;
    }
    

    public void setAnos(String anos) {
        this.anos = anos;
    }

    public String getAnos() {
        return anos;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getLinea() {
        return linea;
    }

    public void setNacion(String nacion) {
        this.nacion = nacion;
    }

    public String getNacion() {
        return nacion;
    }
    

    @Override
    public String toString() {
        return "|| Codigo de chofer asignado ("+getAsignado()+")|| La marca es =("+getMarca()+")|| La linea es de ("+getLinea()+")|| La nacionalidad ("+getNacion()+")|| Edad vehiculo ("+getAnos()+")"+"El Precio ("+getCosto()+")"; //To change body of generated methods, choose Tools | Templates.
    }
    

}
