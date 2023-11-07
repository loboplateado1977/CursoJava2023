public class E2_Kiosco {

    private String direccion;

    private String nombre;

    private int cuit;

    private E2_Empleado empleado1;

    private E2_Empleado empleado2;

    private E2_Empleado empleado3;

    public E2_Kiosco() {
    }

    public E2_Kiosco(String direccion, String nombre, int cuit, E2_Empleado empleado1, E2_Empleado empleado2, E2_Empleado empleado3) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.cuit = cuit;
        this.empleado1 = empleado1;
        this.empleado2 = empleado2;
        this.empleado3 = empleado3;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCuit() {
        return cuit;
    }

    public E2_Empleado getEmpleado1() {
        return empleado1;
    }

    public E2_Empleado getEmpleado2() {
        return empleado2;
    }

    public E2_Empleado getEmpleado3() {
        return empleado3;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public void setEmpleado1(E2_Empleado empleado1) {
        this.empleado1 = empleado1;
    }

    public void setEmpleado2(E2_Empleado empleado2) {
        this.empleado2 = empleado2;
    }

    public void setEmpleado3(E2_Empleado empleado3) {
        this.empleado3 = empleado3;
    }
    public void inicializarEmpleados(){
        
    }
    public void antiguedad(){
        
    }
}
