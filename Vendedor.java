/*terminado por luciano Budman*/
package paquete;


public class Vendedor {
    
    int id_vendedor = 0;
    int dni;
    String nombre;
    String email;

    public Vendedor(int id_vendedor, int dni, String nombre, String email) {
        this.id_vendedor = id_vendedor;
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void generarIdVendedor(){
        id_vendedor = id_vendedor++;
    }
}
