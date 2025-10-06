import java.util.ArrayList;
public class Controlador {
 private ArrayList<Empleado>empleados;
 
 public Controlador(){
     empleados = new ArrayList();
 }
 
 public void guardarEmpleado(Empleado empleado){
     empleados.add(empleado);
    }
    
public ArrayList<Empleado>getEmpleados(){
    return empleados;
}

public String listarEmpleados(){
    String lista = "Los empleados registrados son: ";
    for(Empleado empleado : empleados){
        lista+= empleado.toString();   
    }
    return lista;
}
 
 
}