public class Empleado extends Persona {
	
	private String cargo;
	private String email;
	private double salario;
	
	
	public Empleado (String nombre_completo, String doc_id, String direccion_residencia, String num_telefono, String cargo_emp, 
						String correo_e, double salario) {
		
		super (nombre_completo, doc_id, direccion_residencia, num_telefono);
		
		cargo = cargo_emp;
		email = correo_e;
		this.salario = salario;
		
	}
	
}
