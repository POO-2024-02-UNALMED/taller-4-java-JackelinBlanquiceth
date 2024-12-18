package classroom;

public class Grupo {

    public Persona[] estudiantes;
    public Persona profesor;
    public Asignatura asignatura;
    public int codigo;
    public int cantidadEstudiantes;
    public String horario;

    public Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }
   
    public Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
        this.estudiantes = new Persona[cantidadEstudiantes];
        
    }

    void cambiarEstudiante(Persona estudianteViejo, Persona estudianteNuevo) {
        for (int i = 0; i < this.estudiantes.length; i++) {
            if (this.estudiantes[i].getCedula() == estudianteViejo.getCedula()) {
                this.estudiantes[i] = estudianteNuevo;
                break;
            }
        }
    }
    
    void cambiarEstudiante(int indice, Persona estudiante) {
       if (indice >= 0 ) {
    	   if (indice < this.estudiantes.length ) {
    		   this.estudiantes[indice] = estudiante;
    	   }
       }
    	   
              
    }
}