package delivery.srp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class PedidoRepositoryMemoria implements PedidoRepository {
 private final List<Pedido> pedidos = new ArrayList<>();
 public void salvar(Pedido pedido) {
  if (pedido == null) throw new IllegalArgumentException("Pedido não pode ser nulo.");
  pedidos.add(pedido); System.out.println("Pedido salvo com sucesso!");
 }
 public List<Pedido> listarTodos(){return Collections.unmodifiableList(pedidos);}
}