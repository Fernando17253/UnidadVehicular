/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidadvehicular;

import java.util.Scanner;
import unidadvehicular.AltaChoferes.ChoferAlta;
import unidadvehicular.AltaVehicular.VehiculoAlta;


public class UnidadVehicular {
    static VehiculoAlta[] vecVehiculo = new VehiculoAlta[10];
    static ChoferAlta[] vecChoferes = new ChoferAlta[10];
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
       int estado=0;
        do{
           estado=menu(estado);
       }while(estado!=2);
    }
    public static int menu(int estado){
        int opc1=0;
        do{
            System.out.println("Que Deseas Realizar ");
            System.out.println("(1) ALTA DE VEHICULO");
            System.out.println("(2) ALTA DE CHOFERES ");
            System.out.println("(3) ASIGNACION DE CHOFERES");
            System.out.println("(4) IMPRIMIR LISTA DE UNIDADES ");
            System.out.println("(5) IMPRIMI LAS GANANCIAS POR CADA UNIDAD");
            System.out.println("(6) Salir");
            opc1=teclado.nextInt();
            switch(opc1){
                case 1:{
                    altaVehiculo();
                }break;
                case 2:{
                    altaChoferes();
                }break;    
                case 3:{
                    asignar();
                }break;   
                case 4:{
                     MostrarDatos(3);
                }break;    
                case 5:{
                    MostrarDatos(4);
                }break;
            }
        }while(opc1!=6);   
        
        return estado;
    }
    public static void altaVehiculo(){   
        int i=0;
        //Logger logger_1 = Logger.getInstance();
        VehiculoAlta registro1 = VehiculoAlta.getInstance();
        do{
            //logger_1.setlog(teclado.nextLine());
            System.out.println("Ingrese La Marca");
            registro1.setMarca(teclado.nextLine());
            registro1.setMarca(teclado.nextLine());
            System.out.println("ingrese la linea ");
            registro1.setLinea(teclado.nextLine());
            System.out.println("ingrese nacionalidad");
            registro1.setNacion(teclado.nextLine());
            System.out.println("ingres año del vehiculo");
            registro1.setAnos(teclado.nextLine());
            VehiculoAlta entry = new  VehiculoAlta(registro1.getAsignado(),registro1.getMarca(),registro1.getLinea(),registro1.getNacion(),registro1.getAnos(),registro1.getCosto());
            vecVehiculo[i]=entry;
            i++;        
            System.out.println("DESEA INGRESAR DE NUEVO (1) SI || (2) NO");
        }while(teclado.nextInt()!=2);
        System.out.println("Se a guardado los datos ");
       
    }
    public static void altaChoferes(){
        int i=0;
        ChoferAlta registro2 = ChoferAlta.getInstance();
        do{
            System.out.println("ingrese el id del chofer");
            registro2.setId_chofer(teclado.nextLine());
            registro2.setId_chofer(teclado.nextLine());
            System.out.println("ingrese el nombre ");
            registro2.setNombre(teclado.nextLine());
            System.out.println("ingrese su edad");
            registro2.setEdad(teclado.nextLine());
            System.out.println("ingrese su codijo de Circulacion");
            registro2.setCdCircula(teclado.nextLine());
            ChoferAlta entry2 = new ChoferAlta(registro2.getId_chofer(),registro2.getNombre(),registro2.getEdad(),registro2.getCdCircula());
            vecChoferes[i]=entry2;
            i++;
            System.out.println("DESEA INGRESAR DE NUEVO (1) SI || (2) NO");
        }while(teclado.nextInt()!=2);
        System.out.println("Se a guardado los datos ");
        
    }
    public static void MostrarDatos(int ops){
        switch(ops){
            case 1:{
                System.out.println("******************************");
                System.out.println("REGISTRO VEHICULOS");
            for(int i=0;i<vecVehiculo.length;i++){
                if(vecVehiculo[i]!=null){
                    System.out.println("Vehiculo ("+i+") || "+vecVehiculo[i]);
                }
               
            }
                System.out.println("****************************");
            }break;
            case 2:{
                System.out.println("****************************");
                System.out.println("REGISTRO CHOFERES");
            for(int i=0;i<vecChoferes.length;i++){
                if(vecChoferes[i]!=null){
                     System.out.println(vecChoferes[i]);
                }
                
            }
            System.out.println("****************************");
            }break;
            case 3:{
                String num="";
                 System.out.println("********* Unidades mas choferes asignados *************");
                for(int j=0;j<vecVehiculo.length;j++){
                    if(vecVehiculo[j]!=null){
                        System.out.println("Nombre del vehiculo");
                        System.out.println(vecVehiculo[j]);
                        num=vecVehiculo[j].getAsignado();
                       
                        for(int f =0;f<vecChoferes.length;f++){
                            if(vecChoferes[f]!=null){
                            if(num.equals(vecChoferes[f].getId_chofer())){
                                System.out.println("CHOFER ASIGNADO");
                                System.out.println(vecChoferes[f]);
                            }   
                            }
                        }
                    }
                }
                 System.out.println("********************************************************");
            }break;    
            case 4:{
                int cont=0;
                for(int i=0;i<vecVehiculo.length;i++){
                    if(vecVehiculo[i]!=null){
                        System.out.println(vecVehiculo[i]);
                        cont=cont+vecVehiculo[i].getCosto();
                    }
                }
                System.out.println("la ganacia por cada unida es ="+cont);
                    
                
            }break;    
        }

    
    }
    public static void asignar(){
        int posicion;
        String asig;
        MostrarDatos(1);
        System.out.println("ingrese la posicion del vehiculo en asignar");
        posicion=teclado.nextInt();
        MostrarDatos(2);
        System.out.println("ingrese el id del chofer que desea asignar");
        asig=teclado.nextLine();
        asig=teclado.nextLine();
        vecVehiculo[posicion].setAsignado(asig);
        System.out.println("ingrese el Precio del taxi");
        vecVehiculo[posicion].setCosto(teclado.nextInt());
        MostrarDatos(1);
    }

    
}
