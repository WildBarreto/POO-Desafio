package Iphone;

public interface AparelhoTelefonico {
    void fazerLigacao(String numero);
    void receberLigacao(String numero);
    void encerrarLigacao();
    void enviarMensagem(String mensagem, String destinatario);
    void receberMensagem(String mensagem, String remetente);
}
