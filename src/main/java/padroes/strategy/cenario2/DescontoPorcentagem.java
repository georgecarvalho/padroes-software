package padroes.strategy.cenario2;

import padroes.strategy.cenario1.Orcamento;

public interface DescontoPorcentagem {


  Double calcula(Orcamento orcamento);

  void setProximoDesconto(DescontoPorcentagem proximoDesconto);

}
