package padroes.observer.cenario2;

public interface BingoCardObserver {

    int getCardId();
    void update(int numberDrawn);
    boolean didIWin();
}
