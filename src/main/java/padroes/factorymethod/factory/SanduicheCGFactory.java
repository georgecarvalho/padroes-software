package padroes.factorymethod.factory;

import padroes.factorymethod.product.Sanduiche;
import padroes.factorymethod.product.SanduicheCG;

public class SanduicheCGFactory extends SanduicheFactory{
    @Override
    public Sanduiche recebeSanduiche() {
        return new SanduicheCG();
    }
}
