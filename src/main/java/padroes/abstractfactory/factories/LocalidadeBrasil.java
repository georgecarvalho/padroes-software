package padroes.abstractfactory.factories;

import padroes.abstractfactory.data.Data;
import padroes.abstractfactory.data.DataBrasil;
import padroes.abstractfactory.moeda.Moeda;
import padroes.abstractfactory.moeda.MoedaBrasil;

import java.time.LocalDate;

public class LocalidadeBrasil implements LocalidadeAbstractFactory{
	private LocalDate date;
	private Double valor;
	
	public LocalidadeBrasil(LocalDate date, Double valor) {
		this.date = date;
		this.valor = valor;
	}
	
	
	@Override
	public Data getData() {
		return new DataBrasil(date);
	}

	@Override
	public Moeda getMoeda() {
		return new MoedaBrasil(valor);
	}

}
