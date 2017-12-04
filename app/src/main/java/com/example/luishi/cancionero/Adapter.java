package com.example.luishi.cancionero;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Luishi on 03/12/2017.
 */

public class Adapter extends BaseAdapter
{
    Activity context;
    String[] title;
    String[] descripcion;
    public Adapter(Activity context,String[] title, String[] descripcion)
    {
        super();
        this.context = context;
        this.title = title;
        this.descripcion = descripcion;
    }
    @Override

    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        TextView txtViewTitle;
        TextView txtViewDescription;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        // TODO Auto-generated method stub
        ViewHolder holder;
        LayoutInflater inflater =  context.getLayoutInflater();

        if (convertView == null)
        {
            convertView = inflater.inflate(R.layout.categorias_list, null);
            holder = new ViewHolder();
            holder.txtViewTitle = (TextView) convertView.findViewById(R.id.textView1);
            holder.txtViewDescription = (TextView) convertView.findViewById(R.id.textView2);
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtViewTitle.setText(title[position]);
        holder.txtViewDescription.setText(descripcion[position]);

        return convertView;
    }
}
