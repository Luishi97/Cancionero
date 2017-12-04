package com.example.luishi.cancionero;


public class Principal
{
    private TodasCategorias tc;

    public Principal()
    {
        Categoria[] ct = new Categoria[3];
        //Categoria 1
        Cancion[] canH = new Cancion[4];
        canH[0] = new Cancion(" letra de José Ignacio de Sanjinés y música de Leopoldo Benedetto Vincenti.",
                " 18 de noviembre de 1845","Himno nacional","Himno");
        canH[1] = new Cancion("Letra: José Ricardo Bustamante, Música: Eloy Salmón Ampuero",
                "16 de Julio de 1863","Himno a La Paz","Himno");
        canH[2] = new Cancion("Letra: Benjamín Blanco Unzueta Música: Teófilo Vargas Candia",
                "14 de septiembre de 1810","Himno a Cochabamba","Himno");
        canH[3] = new Cancion("Letra: Felipe Leonor Ribera Música: Gastón Guillaux Humery",
                "10 de diciembre de 1920","Himno a Santa Cruz","Himno");
        ListaCanciones lcH = new ListaCanciones(canH);
        ct[0] = new Categoria("himnos",lcH);

        //Categoria 2
        Cancion[] canM = new Cancion[1];
        canM[0] = new Cancion("Letra: Gregorio Reynolds, Música: Mauricio Mancilla",
                "23 de octubre de 1861","Himnos a los Colorados de Bolivia","Marcha");
        ListaCanciones lcM = new ListaCanciones(canM);
        ct[1] = new Categoria("marchas",lcM);

        //Categoria 3
        Cancion[] canC = new Cancion[1];
        canC[0] = new Cancion("Letra: Benjamín Guzmán, Música: Juan Enrique Jurado.",
                "1826","La Patria","Cantos");
        ListaCanciones lcC = new ListaCanciones(canC);
        ct[2] = new Categoria("cantos",lcC);

        tc = new TodasCategorias(3,ct);
    }
    public String[] getCate()
    {
        String[] cat = new String[tc.getNroCat()];
        Categoria[] lc = tc.getCat();
        for(int i = 0; i < tc.getNroCat(); i++)
             cat[i] = lc[i].getCategoria();
        return cat;
    }
    public String[] getListaCan(String x)
    {
        String[] canciones = new String[1];
        for(int i = 0; i < tc.getNroCat(); i++)
        {
            Categoria[] cat = tc.getCat();
            if(cat[i].getCategoria().equalsIgnoreCase(x))
            {
                canciones = new String[cat[i].getLc().getLista().length];
                Cancion[] c = cat[i].getLc().getLista();
                for (int j = 0; j < canciones.length; j++)
                    canciones[j] = c[j].getNom();
                return canciones;
            }
        }
        return canciones;
    }
    public String[] getListaDet(String x)
    {
        String[] detalles = new String[1];
        for(int i = 0; i < tc.getNroCat(); i++)
        {
            Categoria[] cat = tc.getCat();
            if(cat[i].getCategoria().equalsIgnoreCase(x))
            {
                detalles = new String[cat[i].getLc().getLista().length];
                Cancion[] c = cat[i].getLc().getLista();
                for (int j = 0; j < detalles.length; j++)
                    detalles[j] = c[j].getAutor();
                return detalles;
            }
        }
        return detalles;
    }
}
