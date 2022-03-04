package padroes.strategy.cenario1;

public class Icms implements Imposto {
  @Override
  public Double calcula(Orcamento orcamento) {
    return orcamento.getValor() * 0.25;
  }
}
