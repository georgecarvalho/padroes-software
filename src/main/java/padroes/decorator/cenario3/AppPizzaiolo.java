package padroes.decorator.cenario3;

public class AppPizzaiolo {

  public static void main(String[] args) {

    Pizza pizzaMussarela  = new Mussarela();

    System.out.println(new StringBuilder(pizzaMussarela.getDescricao()).append(" -- ").append(pizzaMussarela.custo()));

    pizzaMussarela =  new TomateDecorator(pizzaMussarela);
    System.out.println(new StringBuilder(pizzaMussarela.getDescricao()).append(" -- ").append(pizzaMussarela.custo()));

    pizzaMussarela = new CreamCheeseDecorator(pizzaMussarela);
    System.out.println(new StringBuilder(pizzaMussarela.getDescricao()).append(" -- ").append(pizzaMussarela.custo()));

    Pizza pizzaPepperoni  = new Pepperoni();
    System.out.println(new StringBuilder(pizzaPepperoni.getDescricao()).append(" -- ").append(pizzaPepperoni.custo()));


    pizzaPepperoni = new OreganoDecorator(pizzaPepperoni);
    pizzaPepperoni = new BaconDecorator(pizzaPepperoni);
    System.out.println(new StringBuilder(pizzaPepperoni.getDescricao()).append(" -- ").append(pizzaPepperoni.custo()));

    pizzaPepperoni = new TomateDecorator(pizzaPepperoni);
    System.out.println(new StringBuilder(pizzaPepperoni.getDescricao()).append(" -- ").append(pizzaPepperoni.custo()));
  }


}


