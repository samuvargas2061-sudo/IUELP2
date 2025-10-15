import java.util.ArrayList;
public class ControladorEmpresa {
    private ArrayList<Empresa>empresas;
    
    public ControladorEmpresa(){
        empresas = new ArrayList();
    }
    
    public void guardarEmpresa(Empresa empresa){
    empresas.add(empresa);
}
    
    public ArrayList<Empresa> getEmpresas(){
        return empresas;
    }
    
    public String listarEmpresas(){
        String lista ="Las empresas registradas son:";
        for(Empresa empresa : empresas){
            lista+=empresa.toString();
        }
        return lista;
    }
}
