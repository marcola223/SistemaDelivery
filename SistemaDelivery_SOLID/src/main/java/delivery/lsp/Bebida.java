package delivery.lsp;
public class Bebida extends Produto {
 public Bebida(String nome,double preco){super(nome,preco);}
 public String getDescricao(){return "Bebida: "+nome;}
}