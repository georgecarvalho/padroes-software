package padroes.strategy.cenario4;

public interface Formatador {
  String formata(Requisicao requisicao, Conta conta);

  void setProximo(Formatador proximo);
}
