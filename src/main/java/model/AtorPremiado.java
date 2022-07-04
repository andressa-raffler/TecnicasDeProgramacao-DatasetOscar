package model;

public class AtorPremiado {
    private  int qtdOscar;
    private String ator;

    public AtorPremiado(String ator, int qtdOscar) {
        this.qtdOscar = qtdOscar;
        this.ator = ator;
    }

    public int getQtdOscar() {
        return qtdOscar;
    }

    public String getAtor() {
        return ator;
    }

    }

