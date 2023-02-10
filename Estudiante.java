package Ejercicio_1;

public class Estudiante {
	
	public int[] enteros = new int[15];
	public String[] nombres = new String[20];
	
	public Estudiante() {
		enteros[9] = 5;
		nombres[0] = "Franscisco";
	}
	
	public void mostrarEnteros() {
		System.out.println("Lista de enteros");
		for(int i=0; i<enteros.length; i++) {
			System.out.println(enteros[i]);
		}
	}
	
	public void mostrarNombres() {
		System.out.println("Lista de nombres");
		for(int i=0; i<nombres.length; i++) {
			System.out.println(nombres[i]);
		}
	}
	
	public int encontrarEntero(int entero) {
		int posicion = -1;
		for(int i=0; i<enteros.length; i++) {
		if(enteros[i] == entero) {
			posicion = i;
			break;
		} else {
			continue;
		}
		}
		return posicion;
	}
	
	public int encontrarNombre(String nombre) {
		int posicion = -1;
		for(int i=0; i<nombres.length; i++) {
			if(nombres[i].equals(nombre)) {
				posicion = i;
				break;
			} else {
				continue;
			}
		}
		return posicion;
	}
	
	public void eliminarEntero(int entero) {
		int posicion = encontrarEntero(entero);
		if(posicion!=-1) {
			int count = 0;
			for(int i=0; i<enteros.length-1; i++) {
				if(i==posicion) {
					count++;
				}
				enteros[i] = enteros[count];
				count++;
			}
		} else {
			System.out.println("No se encontró");
		}
	}
	
	public void eliminarNombre(String nombre) {
		int posicion = encontrarNombre(nombre);
		if(posicion!=-1) {
			int count = 0;
			for(int i=0; i<nombres.length-1; i++) {
				if(i==posicion) {
					count++;
				}
				nombres[i] = nombres[count];
				count++;
			}
		} else {
			System.out.println("No se encontró");
		}
	}
}
