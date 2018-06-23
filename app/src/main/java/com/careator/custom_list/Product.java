package com.careator.custom_list;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.careator.custom_list.Prodocto;
import com.careator.custom_list.R;

import java.util.ArrayList;

import static com.careator.custom_list.R.layout.row_layout;

/**
 * Created by ssv520 on 6/1/2018.
 */

public class Product extends ArrayAdapter<Prodocto> {

    private final Context context;
    private final ArrayList<Prodocto> values;

    public Product(@NonNull Context context, ArrayList<Prodocto> list) {
        super(context, R.layout.row_layout, list);
        this.context = context;
        this.values = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView= inflater.inflate(R.layout.row_layout, parent,false);

        TextView prod_name= rowView.findViewById(R.id.prod_name);
        TextView prod_price= rowView.findViewById(R.id.prod_price);
        TextView prod_desc= rowView.findViewById(R.id.prod_desc);

        ImageView prod_pic= rowView.findViewById(R.id.prod_pic);
        ImageView prod_sale= rowView.findViewById(R.id.prod_sale);

        prod_name.setText(values.get(position).getTitle());
        prod_price.setText("R"+values.get(position).getPrice());
        prod_desc.setText(values.get(position).getDescrpition());

        if(values.get(position).getSale())
        {
            prod_sale.setImageResource(R.mipmap.sale);
        }
        else
        {
            prod_sale.setImageResource(R.mipmap.best_price);
        }
        if(values.get(position).getType().equals("Laptop"))
        {
            prod_pic.setImageResource(R.mipmap.laptop);
        }
        else if (values.get(position).getType().equals("pendrivce"))
        {
            prod_pic.setImageResource(R.mipmap.pendrivce);
        }
        else if (values.get(position).getType().equals("hard_drive"))
        {
            prod_pic.setImageResource(R.mipmap.hard_drive);

        }

        return rowView;
    }
}


