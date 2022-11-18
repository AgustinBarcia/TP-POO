package paquete;
import java.util.Scanner;

/*terminado por Luciano Budman*/
public class Hotel {
    String direccion;

    public Hotel(String direccion) {
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
       System.out.println("Ingrese dirección del hotel");
       String direccion= a.nextLine();
    }
}
