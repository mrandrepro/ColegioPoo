package colegiopoo;

import java.util.ArrayList;

public class Colegio {

    private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    private ArrayList<Profesor> profesores = new ArrayList<Profesor>();

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    // Sobrecarga: agregar segun el tipo de objeto
    public void agregar(Estudiante e) {
        estudiantes.add(e);
    }

    public void agregar(Profesor p) {
        profesores.add(p);
    }
    public String reporteEstudiantes() {
    if (listaEstudiantes == null || listaEstudiantes.isEmpty()) {
        return "No hay estudiantes registrados.";
    }
    StringBuilder sb = new StringBuilder("=== REPORTE DE ESTUDIANTES ===\n\n");
    for (Estudiante e : listaEstudiantes) {
        sb.append(e.toString()).append("\n-------------------------------\n");
    }
    return sb.toString();
}
    public String reporteProfesoresSinOrdenar() {
    if (listaProfesores == null || listaProfesores.isEmpty()) {
        return "No hay profesores registrados.";
    }
    StringBuilder sb = new StringBuilder("=== REPORTE DE PROFESORES ===\n\n");
    for (Profesor p : listaProfesores) {
        sb.append(p.toString())
          .append("\nPago Total: $").append(p.calcularPago())
          .append("\nPrestaciones: $").append(p.calcularPrestaciones())
          .append("\n-------------------------------\n");
    }
    return sb.toString();
}
}