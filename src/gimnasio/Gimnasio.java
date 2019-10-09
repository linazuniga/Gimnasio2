package gimnasio;

import java.util.Date;

public class Gimnasio {
    
  private final Date fechaDeInscripcion;
  private final boolean fisioterapeutas;
  private final String colorDeMaquinas;
  private final int numeroDeEntrenadores;
  private final int numeroDeMaquinas;

    public Gimnasio(Date fechaDeInscripcion, boolean fisioterapeutas, String colorDeMaquinas, int numeroDeEntrenadores, int numeroDeMaquinas) {
        this.fechaDeInscripcion = fechaDeInscripcion;
        this.fisioterapeutas = fisioterapeutas;
        this.colorDeMaquinas = colorDeMaquinas;
        this.numeroDeEntrenadores = numeroDeEntrenadores;
        this.numeroDeMaquinas = numeroDeMaquinas;
    }
 
}
        

