package padroes.adapter;

public class App {


  public static void main(String[] args) {
    SomadorEsperado somadorEsperado = new SomadorAdapter();

    Cliente cliente = new Cliente(somadorEsperado);
    cliente.executar();


  }
}
