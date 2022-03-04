package padroes.factorymethod.factory;

import padroes.factorymethod.product.Sanduiche;

public abstract class SanduicheFactory {
    public Sanduiche montaSanduiche(){
        Sanduiche sanduiche = null;

        sanduiche = recebeSanduiche();

        sanduiche.adicionaPao();
        sanduiche.adicionaQueijo();
        sanduiche.adicionaPresunto();
        sanduiche.adicionaSalada();

        return sanduiche;
    }

    protected abstract Sanduiche recebeSanduiche();
}
