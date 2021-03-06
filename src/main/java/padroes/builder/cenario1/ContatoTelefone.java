package padroes.builder.cenario1;

public class ContatoTelefone extends ContatoBuilder {

  @Override
  public void buildEmail(String email) {
    contato.setEmail(null);
  }

  @Override
  public void buildEndereco(String endereco) {
    contato.setEndereco(null);
  }

  @Override
  public void buildTelefone(String telefone) {
    contato.setTelefone(telefone);
  }

}
