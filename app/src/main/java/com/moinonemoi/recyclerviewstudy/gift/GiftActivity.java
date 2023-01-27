package com.moinonemoi.recyclerviewstudy.gift;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.moinonemoi.recyclerviewstudy.R;

import java.util.ArrayList;

public class GiftActivity extends AppCompatActivity {
    private RecyclerView recView;
    private ArrayList<Gift> gifts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift);
        initializeData();
    }

    private void initializeData() {
        gifts.add(new Gift("Москва",30,"красный"));
        gifts.add(new Gift("питер",15,"белый"));
        gifts.add(new Gift("Казань",6,"чёрный"));
        gifts.add(new Gift("finland",18,"зелёный"));
    }
}
