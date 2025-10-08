import java.util.ArrayList;
public class Empresa {
    private String nit, nombre;
    private ArrayList<Empleado>empleados;

    public Empresa(String nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
        empleados= new ArrayList();
        
        
    }

    public String getNombre() {
        return nombre;
    }
    
    
    public void agregarEmpleado(Empleado empleado){
        
        empleados.add(empleado);
    
    }

    @Override
    public String toString() {
        return "\n\nNit= " + nit + "\nNombre= " + nombre + "\nEmpleados= " + empleados.toString();
    }
    
    
}
