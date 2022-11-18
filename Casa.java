package paquete;

import java.util.Scanner;

public class Casa {
    String dirreccion;

    public Casa(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }
    
    

    
    public void generarPrecio(int dias){
     int precio= 4000 * dias;
    }
    
    public void asignarDireccion(){
        
        Scanner d = new Scanner (System.in);
        System.out.println("Ingrese la dirrecion de la casa: ");
        String dirreccion=d.nextLine();
        
    }

}
