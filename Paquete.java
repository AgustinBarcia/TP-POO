/*echo por barcia
ayudado por budman*/
package paquete;

import java.time.LocalDate;

public class Paquete {

    int id_paquete = 0;
    double precio;
    String origen;
    String destino;
    LocalDate tiepoD;
    LocalDate fecha_paquete;
    Transporte cantEscala;
    Transporte tTransporte;
    Hospedaje provincia;

    public Paquete(double precio, String origen, String destino, LocalDate tiepoD, LocalDate fecha_paquete, Transporte cantEscala, Transporte tTransporte, Hospedaje provincia) {
        this.precio = precio;
        this.origen = origen;
        this.destino = destino;
        this.tiepoD = tiepoD;
        this.fecha_paquete = fecha_paquete;
        this.cantEscala = cantEscala;
        this.tTransporte = tTransporte;
        this.provincia = provincia;
    }

    public int getId_paquete() {
        return id_paquete;
    }

    public void setId_paquete(int id_paquete) {
        this.id_paquete = id_paquete;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getTiepoD() {
        return tiepoD;
    }

    public void setTiepoD(LocalDate tiepoD) {
        this.tiepoD = tiepoD;
    }

    public LocalDate getFecha_paquete() {
        return fecha_paquete;
    }

    public void setFecha_paquete(LocalDate fecha_paquete) {
        this.fecha_paquete = fecha_paquete;
    }

    public Transporte getCantEscala() {
        return cantEscala;
    }

    public void setCantEscala(Transporte cantEscala) {
        this.cantEscala = cantEscala;
    }

    public Transporte gettTransporte() {
        return tTransporte;
    }

    public void settTransporte(Transporte tTransporte) {
        this.tTransporte = tTransporte;
    }

    public Hospedaje getProvincia() {
        return provincia;
    }

    public void setProvincia(Hospedaje provincia) {
        this.provincia = provincia;
    }

    public void calcularPrecio(int cantEscala, String tTransporte) {

    }
}
