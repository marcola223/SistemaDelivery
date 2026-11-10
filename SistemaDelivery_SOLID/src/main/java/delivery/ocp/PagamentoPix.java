package delivery.ocp;
public class PagamentoPix implements Pagamento { public void pagar(double valor){System.out.printf("Pagamento via PIX: R$ %.2f%n",valor);} }