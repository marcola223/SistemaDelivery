package delivery.srp;
public class Pedido {
 private final int id; private final String cliente; private final String produto; private final double valor;
 public Pedido(int id, String cliente, String produto, double valor) {
  if (cliente == null || cliente.isBlank() || produto == null || produto.isBlank() || valor < 0) throw new IllegalArgumentException("Dados do pedido inválidos.");
  this.id=id; this.cliente=cliente; this.produto=produto; this.valor=valor;
 }
 public int getId(){return id;} public String getCliente(){return cliente;} public String getProduto(){return produto;} public double getValor(){return valor;}
}