
import java.util.*;

public class Profesor extends Persona {

    private List<Materia> materias;

    private List<Dia> dias;

    private List<Turno> turnos;


    public Profesor(int legajo, TipoDocumento tipoDoc, int numDoc, String nombre, List<Materia> materias, List<Dia> dias, List<Turno> turnos) {
        super(legajo, tipoDoc, numDoc, nombre);
        this.materias = materias;
        this.dias = dias;
        this.turnos = turnos;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public List<Dia> getDias() {
        return dias;
    }

    public void setDias(List<Dia> dias) {
        this.dias = dias;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }
}