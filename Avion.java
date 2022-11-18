
package paquete;


public class Avion {
   
    double precio = 27000 ;
    int clase ;
  
   
    
    
   
    public Avion(double precio, int clase){
        this.clase = clase ;
        this.precio = precio;
        
    }

    public void DefinirClase (int clase) {
        if (clase==1) {
            precio = precio + 10000 ; }
         }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }
    
    
}
