package com.example.luishi.cancionero;

public class Datos
{
    protected String autor;
    protected String fecha;

    public Datos(String autor, String fecha)
    {
        this.autor = autor;
        this.fecha = fecha;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAño() {
        return fecha;
    }

    public void setAño(String fecha) {
        this.fecha = fecha;
    }
}
