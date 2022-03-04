package padroes.decorator.cenario2;

public abstract class NumeroUmDecorator implements Numero {
    private Numero numero;

    public NumeroUmDecorator(Numero numero) {
        this.numero = numero;
    }

    public abstract String imprime();

    public Numero getNumero() {
        return numero;
    }
}
