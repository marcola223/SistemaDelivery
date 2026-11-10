package delivery.ocp;
public class Checkout {
 public void finalizarPagamento(Pagamento pagamento,double valor) {
  if(pagamento==null || valor<0) throw new IllegalArgumentException("Pagamento inválido.");
  pagamento.pagar(valor);
 }
}