package es.curso.web1.dto;

public class ExamenDto {

	private String asignatura;
	private String texto;
	private String nombreAlumno;
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public ExamenDto(String asignatura, String texto, String nombreAlumno) {
		super();
		this.asignatura = asignatura;
		this.texto = texto;
		this.nombreAlumno = nombreAlumno;
	}
	public ExamenDto() {
		super();
	}
	
	
	
}
