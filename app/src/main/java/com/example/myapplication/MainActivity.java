package com.example.myapplication;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity
{
    EditText edtSearch;
    RecyclerView recyclerView;
    ArrayList<SanPham> listSanPham;
    SanPhamAdapter sanPhamAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerview);
        listSanPham = new ArrayList<>();
        listSanPham.add(new SanPham("Cherry MX RGB Black", 7500, R.drawable.cherry_mx_rgb_black));
        listSanPham.add(new SanPham("Kailh Deap Sea", 6300, R.drawable.kailh_deap_sea));
        listSanPham.add(new SanPham("Gateron Ink Yellow V2", 6000, R.drawable.gateron_ink_yellow_v2));
        listSanPham.add(new SanPham("Outemu Blue Switch", 5800, R.drawable.outemu_blue_switch));
        listSanPham.add(new SanPham("TTC Gold Blue Switch", 7000, R.drawable.ttc_gold_blue_switch));
        sanPhamAdapter = new SanPhamAdapter(getApplicationContext(), listSanPham);
        recyclerView.setAdapter(sanPhamAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if (id == R.id.menu_modify_3)
        {
            SanPham sanPham = listSanPham.get(2);
            sanPham.setTenSanPham("tên mới sp3: " + Calendar.getInstance().getTimeInMillis());
            sanPham.setGiaSanPham(3000);
            sanPhamAdapter.notifyItemChanged(2);
        }
        else if (id == R.id.menu_insert_2)
        {
            SanPham sanPham = new SanPham("Cherry MX Green", 6000, R.drawable.cherry_mx_green);
            listSanPham.add(1, sanPham);
            sanPhamAdapter.notifyItemInserted(1);
        }
        else if (id == R.id.menu_remove_first)
        {
            listSanPham.remove(0);
            sanPhamAdapter.notifyItemRemoved(0);
        }
        return super.onOptionsItemSelected(item);
    }
}
