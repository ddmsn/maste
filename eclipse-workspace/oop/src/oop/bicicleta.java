package oop;

public class bicicleta {
	
	private int velocidadActual;
	private int platoActual;
	private int piñonActual;
	
	public bicicleta(int velocidadActual, int platoActual, int piñonActual) {
		super();
		this.velocidadActual = velocidadActual;
		this.platoActual = platoActual;
		this.piñonActual = piñonActual;
	}
	
	
	public void acelerar() {
		velocidadActual*=2;
	};
	
	public void frenar() {
		velocidadActual/=2;
	};
	
	public void cambiarPlato(int plato) {
		platoActual=plato;
	};
	
	public void cambiarPiñon(int piñon) {
		piñonActual=piñon;
	};
	
	
		
	
	}



