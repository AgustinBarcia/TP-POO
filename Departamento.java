package paquete;

import java.util.Scanner;


public class Departamento {
    String direccion;

    public Departamento(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void generarPrecio(int dias){
     int precio= 5000 * dias;
    }
    
   public void asignarDireccion(){
        
       Scanner a = new Scanner (System.in);
       System.out.println("Ingrese dirección del departamento");
       a.nextLine();
    }
    
}

