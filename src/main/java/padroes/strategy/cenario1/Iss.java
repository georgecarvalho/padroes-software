package padroes.strategy.cenario1;

public class Iss implements Imposto {
  @Override
  public Double calcula(Orcamento orcamento) {
    return orcamento.getValor() * 0.06;
  }
}
