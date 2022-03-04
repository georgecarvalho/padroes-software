package padroes.decorator.cenario2;

public class App {
    public static void main(String[] args) {

        Numero numeroUm = new ParentesesDecorator(new ColchetesDecorator(new ChavesDecorator(new NumeroUm())));
        System.out.println(numeroUm.imprime());
    }
}
