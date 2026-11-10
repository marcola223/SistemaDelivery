package delivery.ocp;
public class PagamentoDinheiro implements Pagamento { public void pagar(double valor){System.out.printf("Pagamento em dinheiro: R$ %.2f%n",valor);} }