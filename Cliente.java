/* echo por luciano budman*/
package paquete;
public class Cliente {
    int num_cliente;
    String nombre;
    String direccion;
    String email;
    int numTelefono;

    public Cliente(int num_cliente, String nombre, String direccion, String email, int numTelefono) {
        this.num_cliente = num_cliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.numTelefono = numTelefono;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }
    
    public void generarNumCliente(){
         num_cliente = num_cliente++;
    }
}
