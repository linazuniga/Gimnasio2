
package gimnasio;

import java.util.Date;

public class Gimnasio3 extends Gimnasio{
    private int numeroDeCadenas;
    private Date fechaDeInaguracion;
    private String nombreDelGimnasio;

    public Gimnasio3(int numeroDeCadenas, Date fechaDeInaguracion, String nombreDelGimnasio, Date fechaDeInscripcion, boolean fisioterapeutas, String colorDeMaquinas, int numeroDeEntrenadores, int numeroDeMaquinas) {
        super(fechaDeInscripcion, fisioterapeutas, colorDeMaquinas, numeroDeEntrenadores, numeroDeMaquinas);
        this.numeroDeCadenas = numeroDeCadenas;
        this.fechaDeInaguracion = fechaDeInaguracion;
        this.nombreDelGimnasio = nombreDelGimnasio;
    }

    public void renombrarGimnasio(String nuevoNombre){
        this.nombreDelGimnasio = nuevoNombre;
    }
    
    public void renombrarGimnasio(String nuevoNombre, String especialidad){
        this.nombreDelGimnasio = nuevoNombre + " de " + especialidad;
    }
    
    public int getNumeroDeCadenas() {
        return numeroDeCadenas;
    }

    public void setNumeroDeCadenas(int numeroDeCadenas) {
        this.numeroDeCadenas = numeroDeCadenas;
    }

    public Date getFechaDeInaguracion() {
        return fechaDeInaguracion;
    }

    public void setFechaDeInaguracion(Date fechaDeInaguracion) {
        this.fechaDeInaguracion = fechaDeInaguracion;
    }

    public String getNombreDelGimnasio() {
        return nombreDelGimnasio;
    }

    public void setNombreDelGimnasio(String nombreDelGimnasio) {
        this.nombreDelGimnasio = nombreDelGimnasio;
    }

}
