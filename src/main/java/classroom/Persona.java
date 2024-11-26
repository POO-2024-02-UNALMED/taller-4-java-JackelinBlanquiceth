package classroom;

public class Persona {

    long cedula;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        Persona.totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
      this(cedula, nombre);
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        Persona.totalPersonas++;
    }

    public Persona(String nombre) {
    	this.cedula = 1;
        this.nombre = "";
        Persona.totalPersonas++;
    }
    
    public Persona() {
    	this.cedula = 0;
    	this.nombre = "";
    	Persona.totalPersonas++;
    }
    
    public long getCedula() {
        return cedula;
    }

 
}