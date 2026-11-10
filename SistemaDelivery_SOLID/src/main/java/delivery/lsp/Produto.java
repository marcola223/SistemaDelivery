package delivery.lsp;
public abstract class Produto {
 protected final String nome; protected final double preco;
 public Produto(String nome,double preco) {
  if(nome==null || nome.isBlank() || preco<0) throw new IllegalArgumentException("Produto inválido.");
  this.nome=nome; this.preco=preco;
 }
 public String getNome(){return nome;} public double getPreco(){return preco;}
 public abstract String getDescricao();
}