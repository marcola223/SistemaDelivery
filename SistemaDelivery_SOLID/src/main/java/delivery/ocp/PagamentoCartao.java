package delivery.ocp;
public class PagamentoCartao implements Pagamento { public void pagar(double valor){System.out.printf("Pagamento com cartão: R$ %.2f%n",valor);} }