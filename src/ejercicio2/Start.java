package ejercicio2;

public class Start {

	public static void main(String[] args) {
		Aula aula1 = new Aula(4);
		Alumnos alumno1 =new Alumnos();
		alumno1.setAnio(2005);
		alumno1.setCod_alumno(1);
		alumno1.setNombre("Diego");
		aula1.AddAllumno(alumno1);
		Alumnos alumno2 =new Alumnos();
		alumno2.setAnio(2002);
		alumno2.setCod_alumno(2);
		alumno2.setNombre("Paco");
		aula1.AddAllumno(alumno2);
		System.out.println(aula1);
	}

}
