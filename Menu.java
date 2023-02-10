package Ejercicio_1;

public class Menu {
	
	public Estudiante[] objetos = new Estudiante[100];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante estudiante = new Estudiante();
		estudiante.mostrarEnteros();
		estudiante.mostrarNombres();
		
		System.out.println("");
		System.out.println("Posición del número y nombre encontrados");
		int posicion = estudiante.encontrarEntero(5);
		System.out.println(posicion);
		int posicion1 = estudiante.encontrarNombre("Franscisco");
		System.out.println(posicion1);
		
		System.out.println("");
		estudiante.eliminarEntero(5);
		estudiante.eliminarNombre("Franscisco");
		estudiante.mostrarEnteros();
		estudiante.mostrarNombres();
	}
}
