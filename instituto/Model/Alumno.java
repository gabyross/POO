
import java.util.*;

/**
 * 
 */
public class Alumno extends Persona {

    private List<Curso> cursos;


    public Alumno(int legajo, TipoDocumento tipoDoc, int numDoc, String nombre) {
        super(legajo, tipoDoc, numDoc, nombre);
        this.cursos = new ArrayList<Curso>();
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}