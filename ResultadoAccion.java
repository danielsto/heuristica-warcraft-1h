package aima.core.environment.warcraftdiagonal;

import aima.core.agent.Action;
import aima.core.search.framework.ResultFunction;

/**
 * Clase que implementa la funcion que devuelve el estado resultante de aplicar
 * una accion sobre un estado.
 */
public class ResultadoAccion implements ResultFunction {

	@Override
	public Object result(Object s, Action a) {
		Estado estado = (Estado) s; // Estado sobre el que se aplica la accion
		Accion accion = (Accion) a; // Acci�n a aplicar sobre el estado

		/*
		 * El estado sucesor comienza siendo una copia del estado actual.
		 * Posteriormente se cambiar� dependiendo de la acci�n escogida.
		 */
		Estado sucesor = new Estado(estado);

		/*
		 * Se comprueba antes de realizar cambios en el estado sucesor si el
		 * estado actual est� ubicado en alg�n lado del mapa. La modificaci�n
		 * del estado sucesor ser� simplemente sumar o restar una posicion a la
		 * coordenada X o Y correspondiente a la acci�n a relizar.
		 */
		switch (accion.tipo) {
		case OESTE:
			if (sucesor.y != 0) {
				sucesor.y = sucesor.y - 1;
			}
			break;
		case ESTE:
			if (sucesor.y != 511) {
				sucesor.y = sucesor.y + 1;
			}
			break;
		case NORTE:
			if (sucesor.x != 0) {
				sucesor.x = sucesor.x - 1;
			}
			break;
		case SUR:
			if (sucesor.x != 511) {
				sucesor.x = sucesor.x + 1;
			}
			break;
		case NOROESTE:
			if (sucesor.y != 0 && sucesor.x != 0) {
				sucesor.x = sucesor.x - 1;
				sucesor.y = sucesor.y - 1;
			}
			break;
		case NORESTE:
			if (sucesor.y != 511 && sucesor.x != 0) {
				sucesor.x = sucesor.x - 1;
				sucesor.y = sucesor.y + 1;
			}
			break;
		case SURESTE:
			if (sucesor.y != 511 && sucesor.x != 511) {
				sucesor.x = sucesor.x + 1;
				sucesor.y = sucesor.y + 1;
			}
			break;
		case SUROESTE:
			if (sucesor.y != 0 && sucesor.x != 511) {
				sucesor.x = sucesor.x + 1;
				sucesor.y = sucesor.y - 1;
			}
			break;
		}

		return sucesor;
	}

}
