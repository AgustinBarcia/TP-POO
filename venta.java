
package paquete;
import java.util.ArrayList;
import java.time.LocalDate;

public class venta {
    private ArrayList<Cliente> newcliente = new ArrayList();
    int idVenta;
    Paquete idPaquete;
    Vendedor idVendedor;
    Cliente numCliente;
    Paquete  fechaPaquete;
    LocalDate fechaFacturacion;
    int canPaquete;
    String mPago;
    double precioF;
    Paquete provincia;
    
    public venta(int idVenta, Paquete idPaquete, Vendedor idVendedor, Cliente numCliente, Paquete fechaPaquete, LocalDate fechaFacturacion, int canPaquete, String mPago, double precioF, Paquete provincia) {
        this.idVenta = idVenta;
        this.idPaquete = idPaquete;
        this.idVendedor = idVendedor;
        this.numCliente = numCliente;
        this.fechaPaquete = fechaPaquete;
        this.fechaFacturacion = fechaFacturacion;
        this.canPaquete = canPaquete;
        this.mPago = mPago;
        this.precioF = precioF;
        this.provincia = provincia;
    }

    public Paquete getProvincia() {
        return provincia;
    }

    public void setProvincia(Paquete provincia) {
        this.provincia = provincia;
    }

    
    public ArrayList<Cliente> getNewcliente() {
        return newcliente;
    }

    public void setNewcliente(ArrayList<Cliente> newcliente) {
        this.newcliente = newcliente;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Paquete getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(Paquete idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Vendedor getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Vendedor idVendedor) {
        this.idVendedor = idVendedor;
    }

    public Cliente getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(Cliente numCliente) {
        this.numCliente = numCliente;
    }

    public Paquete getFechaPaquete() {
        return fechaPaquete;
    }

    public void setFechaPaquete(Paquete fechaPaquete) {
        this.fechaPaquete = fechaPaquete;
    }

    public LocalDate getFechaFacturacion() {
        return fechaFacturacion;
    }

    public void setFechaFacturacion(LocalDate fechaFacturacion) {
        this.fechaFacturacion = fechaFacturacion;
    }

    public int getCanPaquete() {
        return canPaquete;
    }

    public void setCanPaquete(int canPaquete) {
        this.canPaquete = canPaquete;
    }

    public String getmPago() {
        return mPago;
    }

    public void setmPago(String mPago) {
        this.mPago = mPago;
    }

    public double getPrecioF() {
        return precioF;
    }

    public void setPrecioF(double precioF) {
        this.precioF = precioF;
    }
    
    public void calcularFechaF(){
        fechaFacturacion = LocalDate.now();
    }
    

    
}
