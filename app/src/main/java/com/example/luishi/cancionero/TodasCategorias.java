package com.example.luishi.cancionero;

public class TodasCategorias
{
    private Categoria[] cat;
    private int nroCat;
    public TodasCategorias(int nroCat, Categoria[] cat)
    {
        this.nroCat = nroCat;
        this.cat = cat;
    }

    public Categoria[] getCat() {
        return cat;
    }

    public void setCat(Categoria[] cat) {
        this.cat = cat;
    }

    public int getNroCat() {
        return nroCat;
    }

    public void setNroCat(int nroCat) {
        this.nroCat = nroCat;
    }
}
