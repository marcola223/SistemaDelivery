package delivery.dip;
public class NotificacaoService {
 private final CanalNotificacao canal;
 public NotificacaoService(CanalNotificacao canal){if(canal==null)throw new IllegalArgumentException("Canal obrigatório.");this.canal=canal;}
 public void notificar(String mensagem){canal.enviar(mensagem);}
}