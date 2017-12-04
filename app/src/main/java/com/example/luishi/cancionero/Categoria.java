package com.example.luishi.cancionero;

public class Categoria
{
    private String categoria;
    private ListaCanciones lc;
    public Categoria(String categoria, ListaCanciones lc)
    {
        this.categoria = categoria;
        this.lc = lc;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ListaCanciones getLc() {
        return lc;
    }

    public void setLc(ListaCanciones lc) {
        this.lc = lc;
    }
}
