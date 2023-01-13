package oop;

public class BicicletaTandem extends bicicleta {
	protected int numAsientos;

	public BicicletaTandem(int velocidadActual, int platoActual, int piñonActual, int numAsientos) {
		super(velocidadActual, platoActual, piñonActual);
		this.numAsientos = numAsientos;
	}

}
