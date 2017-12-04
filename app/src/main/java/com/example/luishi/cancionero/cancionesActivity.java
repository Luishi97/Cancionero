package com.example.luishi.cancionero;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class cancionesActivity extends AppCompatActivity implements  AdapterView.OnItemClickListener
{
    String tipo;
    Principal prc;
    private ListView list;
    Adapter lvAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.canciones);

        tipo = getIntent().getExtras().getString("cate");

        prc = new Principal();
        list = (ListView) findViewById(R.id.canciones);
        lvAdapter = new Adapter(this,prc.getListaCan(tipo),prc.getListaDet(tipo));
        list.setAdapter(lvAdapter);
        list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id)
    {
        Toast.makeText(this,"Title => "+prc.getListaCan(tipo)[position]+"=> n Description"+prc.getListaDet(tipo)[position],
                Toast.LENGTH_SHORT).show();
        String can = "";
        Intent i = new Intent(this, cancionActivity.class);
        switch (prc.getListaCan(tipo)[position])
        {
            case "Himno nacional":
                can = "Bolivia";
                break;
            case "Himno a La Paz":
                can = "laPaz";
                break;
            case "Himno a Cochabamba":
                can = "cocha";
                break;
            case "Himno a Santa Cruz":
                can = "santaCruz";
                break;
            case "La Patria":
                can = "laPatria";
                break;
            case "Himnos a los Colorados de Bolivia":
                can = "colorados";
        }

        i.putExtra("cate",can);
        startActivity(i);
    }
}
