
import java.util.*;

public class Curso {

    private Materia materia;

    private Profesor profesor;

    private Dia dia;

    private Turno turno;

    private List<Alumno> alumnos;

    private int maxAlum;

    private Carrera carrera;

    public Curso(Materia materia, Profesor profesor, Dia dia, Turno turno, List<Alumno> alumnos, int maxAlum, Carrera carrera) {
        this.materia = materia;
        this.profesor = profesor;
        this.dia = dia;
        this.turno = turno;
        this.alumnos = alumnos;
        this.maxAlum = maxAlum;
        this.carrera = carrera;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public int getMaxAlum() {
        return maxAlum;
    }

    public void setMaxAlum(int maxAlum) {
        this.maxAlum = maxAlum;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
}