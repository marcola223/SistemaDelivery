package delivery.srp;
public class ExibidorPedido {
 public void exibir(Pedido p) {
  System.out.println("ID: "+p.getId()); System.out.println("Cliente: "+p.getCliente());
  System.out.println("Produto: "+p.getProduto()); System.out.printf("Valor: R$ %.2f%n",p.getValor());
 }
}