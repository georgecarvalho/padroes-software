package padroes.factorymethod;

import padroes.factorymethod.factory.SanduicheCGFactory;
import padroes.factorymethod.factory.SanduicheJPFactory;
import padroes.factorymethod.factory.SanduicheRTFactory;
import padroes.factorymethod.product.Sanduiche;

public class App {
    public static void main(String[] args) {
        System.out.println("Montando sanduíche CG:");
        Sanduiche cg = new SanduicheCGFactory().montaSanduiche();
        System.out.println(cg);

        System.out.println("Montando sanduíche JP:");
        Sanduiche jp = new SanduicheJPFactory().montaSanduiche();
        System.out.println(jp);

        System.out.println("Montando sanduíche RT:");
        Sanduiche rt = new SanduicheRTFactory().montaSanduiche();
        System.out.println(rt);
    }
}
