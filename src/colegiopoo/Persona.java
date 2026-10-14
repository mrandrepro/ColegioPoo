package colegiopoo;

public class Persona {

    private String nombre;
    private String direccion;
    private String telefono;
    private String fechaNacimiento; // formato dd/mm/aaaa

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
     public int calcularEdad() {
        String[] p = fechaNacimiento.split("/");
        int dia = Integer.parseInt(p[0].trim());
        int mes = Integer.parseInt(p[1].trim());
        int anio = Integer.parseInt(p[2].trim());
        return java.time.Period.between(
                java.time.LocalDate.of(anio, mes, dia),
                java.time.LocalDate.now()).getYears();
    }

    // Sobrecarga: edad que tendrá o tuvo en un año dado
    public int calcularEdad(int anioReferencia) {
        String[] p = fechaNacimiento.split("/");
        return anioReferencia - Integer.parseInt(p[2].trim());
    }
}