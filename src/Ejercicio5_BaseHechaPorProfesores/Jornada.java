package Ejercicio5_BaseHechaPorProfesores;

import java.util.ArrayList;

public class Jornada {
	
	private ArrayList<Partido> partidos;
	private int fecha;//1,2...n

	public Jornada() {
		this.partidos = new ArrayList<>();
		this.fecha = 1;
	}
	
	public Jornada(int fecha) {
		this.partidos = new ArrayList<>();
		this.fecha = fecha;
	}
	
	public void agregarPartido(Partido partido) {
		this.getPartidos().add(partido);
	}
	
	public void eliminarPartido(Partido partido) {
		this.getPartidos().remove(partido);
	}
	
	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
}