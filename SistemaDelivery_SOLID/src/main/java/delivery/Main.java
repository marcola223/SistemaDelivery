package delivery;
import delivery.srp.*;
import delivery.ocp.*;
import delivery.lsp.*;
import delivery.isp.*;
import delivery.dip.*;
import java.util.Arrays;
import java.util.List;

public class Main {
 public static void main(String[] args) {
  System.out.println("===== SISTEMA DE DELIVERY =====");
  System.out.println("--- SRP ---");
  Pedido pedido = new CriadorPedido().criar(1, "Leonardo", "Pizza", 45.00);
  PedidoRepository repo = new PedidoRepositoryMemoria();
  repo.salvar(pedido);
  new ExibidorPedido().exibir(pedido);

  System.out.println("\n--- OCP ---");
  Checkout checkout = new Checkout();
  checkout.finalizarPagamento(new PagamentoCartao(), 45.00);
  checkout.finalizarPagamento(new PagamentoPix(), 45.00);
  checkout.finalizarPagamento(new PagamentoDinheiro(), 45.00);

  System.out.println("\n--- LSP ---");
  List<Produto> produtos = Arrays.asList(new Pizza("Calabresa",45), new Hamburguer("X-Burger",25), new Bebida("Refrigerante",8));
  for (Produto p : produtos) {
   System.out.println(p.getDescricao());
   System.out.printf("Preço: R$ %.2f%n", p.getPreco());
  }

  System.out.println("\n--- ISP ---");
  PedidoGerenciavel pedidos = new ServicoPedidos(); pedidos.criarPedido();
  RelatorioGeravel relatorio = new RelatorioPedidos(); relatorio.gerarRelatorio();
  EntregaGerenciavel entrega = new ServicoEntrega(); entrega.atualizarEntrega();
  NotificacaoGeravel aviso = new ServicoNotificacao(); aviso.enviarNotificacao("Seu pedido foi recebido!");

  System.out.println("\n--- DIP ---");
  new NotificacaoService(new Email()).notificar("Seu pedido foi confirmado!");
  new NotificacaoService(new SMS()).notificar("Seu pedido saiu para entrega!");
  new NotificacaoService(new WhatsApp()).notificar("Seu pedido está chegando!");
 }
}