
package exercise;

public class Persona {
   
    private String nombre;
    private String apellido;
    private String documento; 
    
    public Persona(String nombre, String apellido, String documento){
    
    this.nombre = nombre;
    this.apellido = apellido;
    this.documento = documento;    
    }
    
    public String getNombre(){
   
        return nombre;
    }
    
    public void setNombre(String nombre){
        
    this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    
}
