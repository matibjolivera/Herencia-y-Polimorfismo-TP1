package Ejercicio5_BaseHechaPorProfesores;

import java.util.*;

public abstract class TorneoFutbol {

	private ArrayList<Jornada> jornadas;
	private ArrayList<Equipo> equipos;

	public TorneoFutbol() {
		this.jornadas = new ArrayList<Jornada>();
		this.equipos = new ArrayList<Equipo>();
	}

	public void agregarJornada(Jornada jornada) {
		this.getJornadas().add(jornada);
	}

	public void eliminarJornada(Jornada jornada) {
		this.getJornadas().remove(jornada);
	}

	public void agregarEquipo(Equipo equipo) {
		this.getEquipos().add(equipo);
	}

	public void eliminarEquipo(Equipo equipo) {
		this.getEquipos().remove(equipo);
	}

	public void finalizarJornada(Jornada jornada) {
		if(jornadas.contains(jornada)) {
			for (Partido match: jornada.getPartidos()) {
				this.calcularPuntos(match);
			}
		}
	}

	public ArrayList<Jornada> getJornadas() {
		return jornadas;
	}

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	public void mostrarTabla() {
		System.out.println(getTipo());
		System.out.println("Tabla de posiciones al cabo de " + String.valueOf(jornadas.size()) + " fechas:");

		this.getEquipos().sort((t1, t2) -> Integer.compare(t2.getPuntos(), t1.getPuntos()));

		for (Equipo team : this.getEquipos()) {
			System.out.println(team.toString());
		}
	}

	public abstract String getTipo();

	public void calcularPuntos(Partido partido) {
		int puntosLocal				= 0;
		int puntosVisitante			= 0;
		int golesEquipoLocal 		= partido.getGolesEquipoLocal();
		int golesEquipoVisitante 	= partido.getGolesEquipoVisitante();

		Equipo localTeam = partido.getEquipoLocal();
		Equipo awayTeam = partido.getEquipoVisitante();

		Equipo winner = null;
		Equipo loser = null;
		int winnerGoals = 0;
		int winnerGoalsReceived = 0;

        if (golesEquipoLocal > golesEquipoVisitante) {//Si gana el local
            winner = localTeam;
            loser = awayTeam;
            winnerGoals = golesEquipoLocal;
            winnerGoalsReceived = golesEquipoVisitante;
        } else if (golesEquipoVisitante > golesEquipoLocal) {
            winner = awayTeam;
            loser = localTeam;
            winnerGoals = golesEquipoVisitante;
            winnerGoalsReceived = golesEquipoLocal;
        }

        int winnerPoints = 0;
        if (winner != null) {
        	winnerPoints += this.puntajePartidoGanado();
            if (winnerGoals > 4) {
                winnerPoints += this.puntajeGanador4Goles();
            }
            if (winnerGoalsReceived == 0) {
                winnerPoints += this.puntajeVallaInvicta();
            }
            winner.setPuntos(winnerPoints);
            loser.setPuntos(this.puntajePartidoPerdido());
        } else {
            int tiePoints = 0;
            tiePoints += this.puntajePartidoEmpatado();
            if (golesEquipoLocal > 3) {
                tiePoints += this.puntajeEmpateMas3Goles();
            }
            localTeam.setPuntos(tiePoints);
            awayTeam.setPuntos(tiePoints);
        }
    }

	public int puntajePartidoEmpatado() {
		return 1;
	}

	public abstract int puntajePartidoGanado();

	public abstract int puntajePartidoPerdido();

	public abstract int puntajeVallaInvicta();

	public abstract int puntajeGanador4Goles();

	public abstract int puntajeEmpateMas3Goles();

}