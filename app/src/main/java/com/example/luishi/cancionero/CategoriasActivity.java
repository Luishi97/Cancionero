package com.example.luishi.cancionero;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class CategoriasActivity extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    Principal prc;
    private ListView list;
    Adapter lvAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categorias);

        prc = new Principal();
        list = (ListView) findViewById(R.id.categorias);
        lvAdapter = new Adapter(this,prc.getCate(),prc.getCate());
        list.setAdapter(lvAdapter);
        list.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id)
    {
        Toast.makeText(this,"Title => "+prc.getCate()[position]+"=> n Description"+prc.getCate()[position],
                Toast.LENGTH_SHORT).show();
        String can = "";
        Intent i = new Intent(this, cancionesActivity.class);
        switch (prc.getCate()[position])
        {
            case "himnos":
                can = "himnos";
                break;
            case "marchas":
                can = "marchas";
                break;
            case "cantos":
                can = "cantos";
        }

        i.putExtra("cate",can);
        startActivity(i);
    }
}
