package padroes.strategy.cenario1;

public class CalculadorDeImposto {
  private Double executa(Orcamento orcamento, Imposto imposto) {
    return imposto.calcula(orcamento);
  }

  public void mostraCalculo(Orcamento orcamento, Imposto imposto) {
    System.out.println(this.executa(orcamento, imposto));
  }
}
