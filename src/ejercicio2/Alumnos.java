package ejercicio2;

public class Alumnos {
	private int cod_alumno;
	private int anio;
	private String nombre;

	public Alumnos() {
		this.cod_alumno = 0;
		this.anio = 0;
		this.nombre = "a";
	}

	public String toString() {
		return "(cod_alumno=" + cod_alumno + ", anio=" + anio + ", nombre=" + nombre + ")";
	}

	public int getCod_alumno() {
		return cod_alumno;
	}

	public void setCod_alumno(int cod_alumno) {
		this.cod_alumno = cod_alumno;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
