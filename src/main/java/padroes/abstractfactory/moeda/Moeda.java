package padroes.abstractfactory.moeda;

public abstract class Moeda {
	protected Double valor;
	
	public Moeda(Double valor) {
		this.valor = valor;
	}

	public abstract String getMoeda();
}
