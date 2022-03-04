package padroes.state.cenario1;

public interface EstadoDaConta {
    void saca(Conta conta, Double valor);
    void deposita(Conta conta, Double valor);
}
