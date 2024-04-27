package dev.pietro_lopes;

public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        System.out.println("Iniciando SmartPhone do modelo: " + iphone.getModelo());
        System.out.println("Inicializando métodos do reprodutor musical: ");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        System.out.println("Inicializando métodos do aparelho telefonico: ");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("Inicializando métodos do Navegador de Internet: ");
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();

        System.out.println("Todos os métodos foram executados!");
    }
}