package com.careator.custom_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv_products;
    ArrayList<Prodocto> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_products = findViewById(R.id.lv_products);

        list = new ArrayList<Prodocto>();

        Prodocto p1 = new Prodocto("Dell", "Nice Laptop", "Laptop", 2.0, true);
        Prodocto p2 = new Prodocto("HP", "Okay Laptop", "Laptop", 0.0, false);
        Prodocto p3 = new Prodocto("SANDISK", "Good pendrive", "pendrivce", 21.0, true);
        Prodocto p4 = new Prodocto("SONY", "Nice Hardisk", "hard_drive", 10.0, false);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        Product adapter = new Product(this, list);


        lv_products.setAdapter(adapter);
    }
}
