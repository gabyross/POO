import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // CREACION DE MATERIAS
        Materia quimica = new Materia("Q1", "quimica inorganica");
        Materia fisica1 = new Materia("F1", "introduccion a fisica");
        Materia fisica2 = new Materia("F2", "fisica inorganica");
        Materia baseDeDatos = new Materia("BD1", "ingenieria de datos");
        Materia ingles = new Materia("I1", "ingles nivel 1");

        // CREACION DE LISTAS DE MATERIAS PARA LAS CARRERAS
        List<Materia> materiaDeIngEnInf = new ArrayList<Materia>();
        materiaDeIngEnInf.add(fisica1);
        materiaDeIngEnInf.add(fisica2);
        materiaDeIngEnInf.add(baseDeDatos);
        materiaDeIngEnInf.add(ingles);

        List<Materia> materiaDeLicEnInf = new ArrayList<Materia>();
        materiaDeLicEnInf.add(baseDeDatos);
        materiaDeLicEnInf.add(ingles);

        // CREACION DE CARRERAS
        Carrera ingEnInf = new Carrera(1, "ingenieria en informatica",materiaDeIngEnInf, true);
        Carrera licEnInf = new Carrera(1, "ingenieria en informatica",materiaDeLicEnInf, true);


        // CREACION DE PROFESORES
        List<Materia> materiasP1 = new ArrayList<Materia>();
        materiasP1.add(fisica1);
        materiasP1.add(fisica2);
        materiasP1.add(baseDeDatos);
        List<Dia> diasP1 = new ArrayList<Dia>();
        diasP1.add(Dia.Lun);
        List<Turno> turnosP1 = new ArrayList<Turno>();
        turnosP1.add(Turno.M);

        Profesor p1 = new Profesor(1, TipoDocumento.DNI, 111, "Profesor 1", materiasP1, diasP1, turnosP1);


        List<Materia> materiasP2 = new ArrayList<Materia>();
        materiasP2.add(ingles);
        List<Dia> diasP2 = new ArrayList<Dia>();
        diasP2.add(Dia.Mar);
        List<Turno> turnosP2 = new ArrayList<Turno>();
        turnosP2.add(Turno.T);
        turnosP2.add(Turno.N);

        Profesor p2 = new Profesor(2, TipoDocumento.DNI, 222, "Profesor 2", materiasP2, diasP2, turnosP2);


        // CREACION DE ALUMNOS Y CURSOS
        List<Alumno> alumsIngles = new ArrayList<Alumno>();
        Alumno a1 = new Alumno(1, TipoDocumento.DNI, 1, "alumno 1");
        Alumno a2 = new Alumno(2, TipoDocumento.DNI, 2, "alumno 2");
        alumsIngles.add(a2);
        Curso c1 = new Curso(ingles, p2, Dia.Mar, Turno.T, alumsIngles, 45, licEnInf);
        Curso c2 = new Curso(baseDeDatos, p1, Dia.Mar, Turno.N, alumsIngles, 45, licEnInf);

        // CREACION DE INSTITUTO
        /*
        podria implementarse interfaz
        List<Carrera> carrerasUade = new ArrayList<Carrera>();
        carrerasUade.add(ingEnInf);
        carrerasUade.add(licEnInf);

        List<Materia> materiasUade = new ArrayList<Materia>();
        materiasUade.add(quimica);
        materiasUade.add(fisica1);
        materiasUade.add(fisica2);
        materiasUade.add(baseDeDatos);
        materiasUade.add(ingles);

        List<Profesor> profesoresUade = new ArrayList<Profesor>();
        profesoresUade.add(p1);
        profesoresUade.add(p2);

        List<Alumno> alumnosUade = new ArrayList<Alumno>();
        alumnosUade.add(a1);
        alumnosUade.add(a2);*/

        Instituto uade = new Instituto();

        uade.AgregarCurso(c1);
        uade.AgregarCurso(c2);

        uade.InscribirAlumEnCurso(a1, c1);
        //uade.InscribirAlumEnCurso(a1, c1); da error
        uade.printAlumnYProfEnCurso(c1);




    }
}
