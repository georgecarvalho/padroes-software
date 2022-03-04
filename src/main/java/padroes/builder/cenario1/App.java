package padroes.builder.cenario1;

public class App {

  public static void main(String[] args) {

    ContatoDirector director = new ContatoDirector(new ContatoCompleto());
    director.construiContato();
    Contato contato = director.getContato();
    System.out.println(contato.toString());

  }


}