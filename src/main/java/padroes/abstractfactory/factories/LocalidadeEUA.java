package padroes.abstractfactory.factories;

import padroes.abstractfactory.data.Data;
import padroes.abstractfactory.data.DataEUA;
import padroes.abstractfactory.moeda.Moeda;
import padroes.abstractfactory.moeda.MoedaUSA;

import java.time.LocalDate;

public class LocalidadeEUA implements LocalidadeAbstractFactory{
	private LocalDate date;
	private Double valor;
	
	public LocalidadeEUA(LocalDate date, Double valor) {
		this.date = date;
		this.valor = valor;
	}
	@Override
	public Data getData() {
		return new DataEUA(date);
	}

	@Override
	public Moeda getMoeda() {
		return new MoedaUSA(valor);
	}

}
