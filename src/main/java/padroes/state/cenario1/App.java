package padroes.state.cenario1;

public class App {
    public static void main(String[] args) {
        Conta c1 = new Conta();

        System.out.println(c1);
        c1.deposita(800.0);
        System.out.println(c1);
        c1.saca(1600.0);
        System.out.println(c1);
        c1.saca(100.0);
        System.out.println(c1);
    }
}
