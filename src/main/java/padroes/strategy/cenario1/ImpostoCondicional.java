package padroes.strategy.cenario1;

import padroes.strategy.cenario2.DescontoCincoPorcento;
import padroes.strategy.cenario2.DescontoOitoPorcento;
import padroes.strategy.cenario2.DescontoSetePorcento;

public class ImpostoCondicional implements Imposto {


  DescontoOitoPorcento descontoOitoPorcento = new DescontoOitoPorcento(null);
  DescontoSetePorcento descontoSetePorcento = new DescontoSetePorcento(descontoOitoPorcento);
  DescontoCincoPorcento descontoCincoPorcento = new DescontoCincoPorcento(descontoSetePorcento);
  public ImpostoCondicional() {
    DescontoOitoPorcento descontoOitoPorcento = new DescontoOitoPorcento(null);
    DescontoSetePorcento descontoSetePorcento = new DescontoSetePorcento(descontoOitoPorcento);
    DescontoCincoPorcento descontoCincoPorcento = new DescontoCincoPorcento(descontoSetePorcento);


  }

  @Override
  public Double calcula(Orcamento orcamento) {
    return descontoCincoPorcento.calcula(orcamento);
  }
}
