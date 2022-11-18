
package paquete;

import java.util.Scanner;


public class Hostel {
    String direccion;
    

    public Hostel(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void generarPrecio(int dias){
     int precio= 2500 * dias;
    }
    
   public void asignarDireccion(){
        
       Scanner a = new Scanner (System.in);
       System.out.println("Ingrese dirección del hostel");
       String direccion = a.nextLine();
    }
    
}
