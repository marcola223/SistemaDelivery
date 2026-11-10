package delivery.lsp;
public class Pizza extends Produto {
 public Pizza(String nome,double preco){super(nome,preco);}
 public String getDescricao(){return "Pizza: "+nome;}
}