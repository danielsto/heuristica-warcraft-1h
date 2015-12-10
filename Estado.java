package aima.core.environment.warcraftdiagonal;

/**
 * Los estados estar�n formados por dos coordenadas que indican la posicion en
 * el mapa (x,y). Se crear�n a partir de un vector de ints de tama�o dos que
 * ser� pasado por par�metro al constructor.
 */
public class Estado {

	int x;
	int y;

	/**
	 * Constructor de estado dadas las coordenadas.
	 * 
	 * @param posicion
	 *            Vector de ints que contiene las coordenadas.
	 */
	public Estado(int[] posicion) {
		this.x = posicion[0];
		this.y = posicion[1];
	}

	/**
	 * Constructor de copia de un estado.
	 * 
	 * @param otro
	 *            Estado que se quiere copiar.
	 */
	public Estado(Estado otro) {
		this.x = otro.x;
		this.y = otro.y;
	}

	/*
	 * Tambi�n se han creado los m�todos hashCode, equals y toString que son
	 * necesarios para el correcto funcionamiento de la librer�a aima.
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Estado [x=" + x + ", y=" + y + "]";
	}

}