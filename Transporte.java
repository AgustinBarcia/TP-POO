/*
Agustrin Barcia y Budman*/
package paquete;

public class Transporte{
    Autobus precioA;
    Barco precioB;
    Avion precioC;
    int cantEscala = 2;
    String tTransporte ;
    int precioT;

    public Transporte(Autobus precioA, Barco precioB, Avion precioC, String tTransporte, int precioT) {
        this.precioA = precioA;
        this.precioB = precioB;
        this.precioC = precioC;
        this.tTransporte = tTransporte;
        this.precioT = precioT;
    }

    public Autobus getPrecioA() {
        return precioA;
    }

    public void setPrecioA(Autobus precioA) {
        this.precioA = precioA;
    }

    public Barco getPrecioB() {
        return precioB;
    }

    public void setPrecioB(Barco precioB) {
        this.precioB = precioB;
    }

    public Avion getPrecioC() {
        return precioC;
    }

    public void setPrecioC(Avion precioC) {
        this.precioC = precioC;
    }

    public int getCantEscala() {
        return cantEscala;
    }

    public void setCantEscala(int cantEscala) {
        this.cantEscala = cantEscala;
    }

    public String gettTransporte() {
        return tTransporte;
    }

    public void settTransporte(String tTransporte) {
        this.tTransporte = tTransporte;
    }

    public int getPrecioT() {
        return precioT;
    }

    public void setPrecioT(int precioT) {
        this.precioT = precioT;
    }

    
    public void calculaPrecio(){
	switch(tTransporte){
            case "Avion" : precioT =precioC * cantEscala;
            break;
			case "Avion + Barco" : precioT =precioC * cantEscala + precioB * cantEscala;
            break;
			case "Avion + Autobus" : precioT =precioC * cantEscala + precioA * cantEscala;
            break;
			case "Avion + Autobus + Barco" : precioT =precioC * cantEscala+ precioA * cantEscala + precioB * cantEscala;
            break;
            case "Barco" : precioT =precioB * cantEscala;
            break;
			case "Barco + Autobus" : precioT =precioB * cantEscala + precioA * cantEscala;
            break;
            case "Autobus" : precioT =precioA * cantEscala;
            break;
            default:
                System.out.println("opcion incorrecta intente de nuevo");

		}

 }
}
    

