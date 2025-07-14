
public class Iphone implements AparalhoTelefonico,NavgadorInternet,ReprodutorMusical {
    @Override
    public void Desbloquear() {
        System.out.println("Desbloqueando Celular");
    }

    @Override
    public void Ligar() {
        System.out.println("Ligando Celular");
    }

    @Override
    public void Desligar() {
        System.out.println("Desligando...");
    }

    @Override
    public void NavegarPeloAparelho() {
        System.out.println("Navegando ate o destino");
    }

    @Override
    public void Pesquisar() {
        System.out.println("Pesquisando...");
    }

    @Override
    public void Compartilhar() {
        System.out.println("Compartilhando");
    }

    @Override
    public void Publicar() {
        System.out.println("Publicando");
    }

    @Override
    public void Tocar() {
        System.out.println("Play na musica");
    }

    @Override
    public void Pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void EscollherMusica() {
        System.out.println("Escolhendo a musica");
    }
}
