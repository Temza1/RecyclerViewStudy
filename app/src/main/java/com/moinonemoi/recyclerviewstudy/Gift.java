package com.moinonemoi.recyclerviewstudy;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Gift extends AppCompatActivity {
    private RecyclerView recView;
    private ArrayList<Gift> gifts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gift);
        initializeData();
    }

    private String address;
    private int size;
    private String color;

    public Gift (String Address,int size,String color){
        this.address = Address;
        this.color = color;
        this.size = size;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String Address) {
        this.address = Address;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int Size) {
        this.size = Size;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String Color) {
        this.color = Color;
    }

    private void initializeData() {
        gifts.add(new Gift("Москва",30,"красный"));
        gifts.add(new Gift("питер",15,"белый"));
        gifts.add(new Gift("Казань",6,"чёрный"));
        gifts.add(new Gift("finland",18,"зелёный"));
    }


}
