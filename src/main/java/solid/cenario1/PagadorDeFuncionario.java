package solid.cenario1;

public class PagadorDeFuncionario {
    public void paga(Remuneravel remuneravel){
        remuneravel.deposita(remuneravel.calculaSalario() + remuneravel.calculaBonificacao());
    }
}
