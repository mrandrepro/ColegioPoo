package colegiopoo;

public class Profesor extends Persona {

    private String cedula;
    private String area;
    private double salarioHora;
    private double horasDictadas;

    public Profesor(String nombre, String direccion, String telefono,
            String fechaNacimiento, String cedula, String area,
            double salarioHora, double horasDictadas) {
        setNombre(nombre);
        setDireccion(direccion);
        setTelefono(telefono);
        setFechaNacimiento(fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioHora = salarioHora;
        this.horasDictadas = horasDictadas;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public double getHorasDictadas() {
        return horasDictadas;
    }

    public void setHorasDictadas(double horasDictadas) {
        this.horasDictadas = horasDictadas;
    }
}