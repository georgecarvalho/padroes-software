package padroes.abstractfactory.factories;


import padroes.abstractfactory.data.Data;
import padroes.abstractfactory.moeda.Moeda;

public interface LocalidadeAbstractFactory {

	public Data getData();
	public Moeda getMoeda();
}
