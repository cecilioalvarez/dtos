package es.curso.web1.mapper;

import es.curso.web1.dto.AlumnoDto;
import es.curso.web1.dto.ExamenDto;
import es.curso.web1.models.Alumno;
import es.curso.web1.models.Examen;

public class ExamenMapper {

	
	public static ExamenDto toDto(Examen examen) {
		return new ExamenDto(examen.getAsignatura(),examen.getTexto(),examen.getAlumno().getNombre());
	}
	public static Examen toBo(ExamenDto examenDto) {
		Examen examen= new Examen();
		examen.setAlumno(new Alumno(examenDto.getNombreAlumno()));
		examen.setAsignatura(examenDto.getAsignatura());
		examen.setTexto(examenDto.getTexto());
		return examen;
	}
}
