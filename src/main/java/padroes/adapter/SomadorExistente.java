package padroes.adapter;

import java.util.List;

public class SomadorExistente {

  public int somaLista(List<Integer> lista) {
    return lista.stream().reduce(0, Integer::sum);
  }

}
