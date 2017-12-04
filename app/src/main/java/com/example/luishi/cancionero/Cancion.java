package com.example.luishi.cancionero;

public class Cancion extends Datos
{
    private String nom;
    private String tipo;

    public Cancion(String autor, String año,String nom, String tipo)
    {
        super(autor,año);
        this.nom = nom;
        this.tipo = tipo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
