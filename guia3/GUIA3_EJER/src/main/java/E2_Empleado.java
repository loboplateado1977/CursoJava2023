import java.time.LocalDate;
public class E2_Empleado {

    private String nombre;
    private String apellido;
    private LocalDate fecha;
    private int dni;

    public E2_Empleado() {
    }

    public E2_Empleado(String nombre, String apellido, LocalDate fecha, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
}
