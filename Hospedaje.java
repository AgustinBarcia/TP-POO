package paquete;
/* 
autor Luciano Budman y Agustin Barcia
*/
import java.util.Scanner;
public class Hospedaje {
    String pais ;
    String provincia;
    String ciudad ;
    String establecimiento;
    String direccion;

    
    public Hospedaje(String pais, String ciudad, String establecimiento, String direccion, String provincia) {
        this.pais = pais;
        this.provincia= provincia;
        this.ciudad = ciudad;
        this.establecimiento = establecimiento;
        this.direccion = direccion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void Testablecimiento(){
        Scanner a=new Scanner(System.in);
        System.out.println("Hola porfavor escoja el tipo de establecimiento que quiere. Casa= 1, Hotel= 2, Hostel= 3. ");
        String numero = a.nextLine();
        switch(numero){
            case "1" : establecimiento="casa";
            break;
            case "2" : establecimiento="hotel";
            break;
            case "3" : establecimiento="hostel";
            break;
            default:
                System.out.println("opcion incorrecta intente de nuevo");
        }
    }


    
    public void AsignarPais(){
        Scanner a=new Scanner(System.in);
        System.out.println("Paises disponibles: Argentina - Holanda - Mexico - Estados Unidos - Canada - japon - Alemania. Escriba el pais a donde viaja");
        String npais = a.nextLine();
        switch(npais){
            case "1" : pais="Argentina";
            break;
            case "2" : pais="Holanda";
            break;
            case "3" : pais="Mexico";
            break;
            case "4" : pais="Estados Unidos";
            break;
            case "5" : pais="Canada";
            break;
            case "6" : pais="Japon";
            break;
            case "7" : pais="Alemania";
            break;
            default:
                System.out.println("opcion incorrecta intente de nuevo");
        }
    }

    public void AsignarProvincia(){
        Scanner a=new Scanner(System.in);
        System.out.println("elegiste " +pais+" elija la provincia que desea ir");
        switch(pais){
            case "Argentina": System.out.println("las opciones son: Buenos aires, Mendoza, porfavor escoja una opcion");
            String nprovincia = a.nextLine();
            switch(nprovincia){
            case "1" : provincia="Buenos aires";
            break;
            case "2" : provincia="Mendoza";
            break;
            default : System.out.println("error 404");
            }
            case "Holanda": System.out.println("las opciones son: Limburgo,zelanda,porfavor escoja una opcion");
            String n2provincia = a.nextLine();
            switch(n2provincia){
            case "1" : provincia="Limburgo";
            break;
            case "2" : provincia="zelanda";
            break;
            default : System.out.println("error 404");
            }
            case "Mexico": System.out.println("las opciones son: Baja Califronia, Jalisco,porfavor escoja una opcion");
            String n3provincia = a.nextLine();
            switch(n3provincia){
            case "1" : provincia="Baja Califronia";
            break;
            case "2" : provincia="Jalisco";
            break;
            default : System.out.println("error 404");
            }
            case "Estados Unidos": System.out.println("las opciones son: California, New York,porfavor escoja una opcion");
            String n4provincia = a.nextLine();
            switch(n4provincia){
            case "1" : provincia="California";
            break;
            case "2" : provincia="New York";
            break;
            default : System.out.println("error 404");
            }
            case "Canada": System.out.println("las opciones son: Alberta , Columbia Británica ,porfavor escoja una opcion");
            String n5provincia = a.nextLine();
            switch(n5provincia){
            case "1" : provincia="Alberta";
            break;
            case "2" : provincia="Columbia Británica";
            break;
            default : System.out.println("error 404");
            }
            case "Japon": System.out.println("las opciones son: Tokio, Osaka,porfavor escoja una opcion");
            String n6provincia = a.nextLine();
            switch(n6provincia){
            case "1" : provincia="Tokio";
            break;
            case "2" : provincia="Osaka";
            break;
            default : System.out.println("error 404");
            }
            case "Alemania": System.out.println("las opciones son:  Berlin, Hamburgo,porfavor escoja una opcion");
            String n7provincia = a.nextLine();
            switch(n7provincia){
            case "1" : provincia="Berlin";
            break;
            case "2" : provincia="Hamburgo";
            break;
            default : System.out.println("error 404");
        }
        }
    }
    
            }
