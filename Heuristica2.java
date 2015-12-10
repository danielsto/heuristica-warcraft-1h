package aima.core.environment.warcraftdiagonal;

import aima.core.search.framework.HeuristicFunction;

/**
 * Esta heur�stica accede al punto final a trav�s de los catetos que unen los
 * puntos inicial y final del mapa, es decir, se suma el coste de acceder en
 * l�nea recta hasta la fila del estado final y el de acceder en l�nea recta a
 * la columna del estado final.
 */
public class Heuristica2 implements HeuristicFunction {

	public Heuristica2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double h(Object state) {
		// TODO Auto-generated method stub
		Estado estado = (Estado) state;
		int restaX = Ejecutar.estadoFinal.x - estado.x;
		int restaY = Ejecutar.estadoFinal.y - estado.y;
		double valorHeuristica = restaX + restaY;

		return valorHeuristica;
	}

}
