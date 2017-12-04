package com.example.luishi.cancionero;

public class ListaCanciones
{
    private Cancion[] lista;

    public ListaCanciones(Cancion[] lista)
    {
        this.lista = lista;
    }

    public Cancion[] getLista() {
        return lista;
    }

    public void setLista(Cancion[] lista) {
        this.lista = lista;
    }
}
