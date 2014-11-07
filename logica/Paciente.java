public class Paciente extends Persona {
	
	private Date fechaNacimiento;
	private String numeroSeguridadSocial;
	private String actividadEconomica;
	
	
	public Paciente (String nombre_completo, String doc_id, String direccion_residencia, String num_telefono, String num_seguridad,
						String actividad, Date fecha_nac) {
							
		super (nombre_completo, doc_id, direccion_residencia, num_telefono);
		
		numeroSeguridadSocial = num_seguridad;
		actividadEconomica = actividad;
		fechaNacimiento = fecha_nac;
		
	}
	
}
