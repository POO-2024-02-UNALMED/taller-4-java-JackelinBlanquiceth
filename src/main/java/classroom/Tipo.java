package classroom;

public enum Tipo {
	DISCIPLINAR(10, "Disciplinar"),FUNDAMENTACION(20, "Fundamentación"),ELECTIVA(30, "Electiva");
	
	private int codigo;
	private String nombre;
	private Tipo(final int codigo,final String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}