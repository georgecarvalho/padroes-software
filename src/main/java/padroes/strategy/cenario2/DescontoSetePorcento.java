package padroes.strategy.cenario2;

import padroes.strategy.cenario1.Orcamento;

public class DescontoSetePorcento implements DescontoPorcentagem {

  DescontoPorcentagem proximoDesconto;

  public DescontoSetePorcento(DescontoPorcentagem proximoDesconto) {
    this.proximoDesconto = proximoDesconto;
  }

  public Double calcula(Orcamento orcamento) {
    if (orcamento.getValor() >= 1000.00 && orcamento.getValor() <= 3000.00) {
      return orcamento.getValor() * 0.07;
    } else {
      return proximoDesconto.calcula(orcamento);
    }
  }

  public void setProximoDesconto(DescontoPorcentagem proximoDesconto) {
    this.proximoDesconto = proximoDesconto;
  }
}
