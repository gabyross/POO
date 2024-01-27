
import java.util.*;

/**
 * 
 */
public class Instituto {
    private List<Carrera> carreras;

    private List<Curso> cursos;

    private List<Profesor> profesores;

    private List<Alumno> alumnos;

    public Instituto() {
        this.carreras = new ArrayList<Carrera>();
        this.cursos = new ArrayList<Curso>();
        this.profesores = new ArrayList<Profesor>();;
        this.alumnos = new ArrayList<Alumno>();;
    }

    public void AgregarCurso(Curso curso) {
        if (curso.getCarrera().isActive()) {
            this.cursos.add(curso);
        } else {
            throw new IllegalArgumentException("La carrera asociada al curso no se encuentra activa");
        }
    }

    public void InscribirAlumEnCurso(Alumno alumno, Curso curso) {
        for (int i = 0; i < alumno.getCursos().size(); i++) {
            Dia d = alumno.getCursos().get(i).getDia();
            Turno t = alumno.getCursos().get(i).getTurno();
            if (d == curso.getDia() && t == curso.getTurno()) {
                throw new IllegalArgumentException("El estudiante no tiene ese horario disponible");
            }
        }

        alumno.getCursos().add(curso);
        curso.getAlumnos().add(alumno);
    }

    public void printAlumnYProfEnCurso(Curso curso) {
        System.out.println("Profesor:");
        System.out.println(curso.getProfesor().getNombre());

        System.out.println("Alumnos:");
        for (int i = 0; i < curso.getAlumnos().size(); i++) {
            Alumno estudiante = curso.getAlumnos().get(i);
            System.out.println(estudiante.getNombre());
        }
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}