package padroes.abstractfactory;
import padroes.abstractfactory.factories.LocalidadeAbstractFactory;
import padroes.abstractfactory.factories.LocalidadeBrasil;
import padroes.abstractfactory.factories.LocalidadeEUA;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		LocalidadeAbstractFactory factoryBrasil = new LocalidadeBrasil(LocalDate.now(), 100.23);
		LocalidadeAbstractFactory factoryUSA = new LocalidadeEUA(LocalDate.now(), 234.54);
		
		System.out.println("------Brasil: ---------\nData: "+factoryBrasil.getData()+ "\nMoeda: "+ factoryBrasil.getMoeda());
		System.out.println("----- USA: -------\nData: "+factoryUSA.getData()+ "\nMoeda :"+ factoryUSA.getMoeda());
	}

}
