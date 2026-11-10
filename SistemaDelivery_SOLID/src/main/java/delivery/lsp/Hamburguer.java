package delivery.lsp;
public class Hamburguer extends Produto {
 public Hamburguer(String nome,double preco){super(nome,preco);}
 public String getDescricao(){return "Hambúrguer: "+nome;}
}