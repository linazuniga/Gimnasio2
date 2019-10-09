
package gimnasio;

import java.util.Date;


public class SmarfitImpl extends Gimnasio {
    private int cantidadEnCali;
    private String nombreDelDueño;
    private int cantidadEnColombia;

    public SmarfitImpl(int cantidadEnCali, String nombreDelDueño, int cantidadEnColombia, Date fechaDeInscripcion, boolean fisioterapeutas, String colorDeMaquinas, int numeroDeEntrenadores, int numeroDeMaquinas) {
        super(fechaDeInscripcion, fisioterapeutas, colorDeMaquinas, numeroDeEntrenadores, numeroDeMaquinas);
        this.cantidadEnCali = cantidadEnCali;
        this.nombreDelDueño = nombreDelDueño;
        this.cantidadEnColombia = cantidadEnColombia;
    }

    public void renombrarDueño(String nuevoNombre){
        this.nombreDelDueño = nuevoNombre;
    }
    
    public void renombrarDueño(String nuevoNombre, String especialidad){
        this.nombreDelDueño = nuevoNombre + " de " + especialidad;
    }

    public int getCantidadEnCali(){
        return cantidadEnCali;
    }
    
    public void setCantidadEnCali(int cantidadEnCali){
        this.cantidadEnCali = cantidadEnCali;
    }

    public String getNombreDelDueño() {
        return nombreDelDueño;
    }

    public void setNombreDelDueño(String nombreDelDueño) {
        this.nombreDelDueño = nombreDelDueño;
    }

    public int getCantidadEnColombia() {
        return cantidadEnColombia;
    }

    public void setCantidadEnColombia(int cantidadEnColombia) {
        this.cantidadEnColombia = cantidadEnColombia;
    }
    
}
