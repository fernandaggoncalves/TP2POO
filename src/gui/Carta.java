package gui;

import javax.swing.ImageIcon;

public class Carta {
    
    public static final int ESPADAS = 1;
    public static final int OURO = 2;
    public static final int PAUS = 3;
    public static final int COPAS = 4;
    
    private int valor;
    private int naipe;
    private ImageIcon icone;

    public Carta(int valor, int naipe, ImageIcon icone) {
        this.valor = valor;
        this.naipe = naipe;
        this.icone = icone;
    }

    public Carta() {
    }
    
    
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getNaipe() {
        return naipe;
    }

    public void setNaipe(int naipe) {
        this.naipe = naipe;
    }

    public ImageIcon getIcone() {
        return icone;
    }

    public void setIcone(ImageIcon icone) {
        this.icone = icone;
    }
}
