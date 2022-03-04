package padroes.factorymethod.factory;

import padroes.factorymethod.product.Sanduiche;
import padroes.factorymethod.product.SanduicheJP;

public class SanduicheJPFactory extends SanduicheFactory{
    @Override
    public Sanduiche recebeSanduiche() {
        return new SanduicheJP();
    }
}
