package padroes.factorymethod.factory;

import padroes.factorymethod.product.Sanduiche;
import padroes.factorymethod.product.SanduicheRT;

public class SanduicheRTFactory extends SanduicheFactory{
    @Override
    public Sanduiche recebeSanduiche() {
        return new SanduicheRT();
    }
}
