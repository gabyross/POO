
import java.util.*;

public class Carrera {

    private int codigo;

    private String descripcion;

    private List<Materia> materias;

    private boolean isActive;


    public Carrera(int codigo, String descripcion, List<Materia> materias, boolean isActive) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.materias = materias;
        this.isActive = isActive;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}