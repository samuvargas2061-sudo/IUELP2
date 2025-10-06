
public class Empleado {
    private String nombre, genero, ciudad, casado, experiencia;

    public Empleado(String nombre, String genero, String ciudad, String casado, String experiencia) {
        this.nombre = nombre;
        this.genero = genero;
        this.ciudad = ciudad;
        this.casado = casado;
        this.experiencia = experiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCasado() {
        return casado;
    }

    public void setCasado(String casado) {
        this.casado = casado;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return  "\n\nNombre= " + nombre + "\nGenero= " + genero + "\nCiudad= " + ciudad + "\nCasado= " + casado + "\nExperiencia= " + experiencia;
    }
    
    
}