package padroes.state.cenario2;

public abstract class Avaliado {
    public final void transcorrerPrazoLegal(Processo processo){
        processo.estado = new Fechado();
    }
}
