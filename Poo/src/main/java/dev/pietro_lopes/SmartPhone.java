package dev.pietro_lopes;

public abstract class SmartPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet {
    private final String modelo;
    SmartPhone(String modelo){
        this.modelo = modelo;
    }

    public String getModelo(){
        return modelo;
    }
}
