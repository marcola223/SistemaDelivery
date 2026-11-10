package delivery.srp;
public class CriadorPedido {
 public Pedido criar(int id, String cliente, String produto, double valor) { return new Pedido(id, cliente, produto, valor); }
}