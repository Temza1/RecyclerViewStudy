package com.moinonemoi.recyclerviewstudy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GiftAdapter extends RecyclerView.Adapter<GiftAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<Gift> gifts;
    private ViewHolder holder;
    private int position;

    GiftAdapter(Context context, List<Gift> gifts){
        this.gifts = gifts;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.gift, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Gift gift = gifts.get(position);
        holder.address.setText(gift.getAddress());
        holder.size.setText(gift.getSize());
        holder.color.setText(gift.getColor());
    }


    @Override
    public int getItemCount() {
        return gifts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView address,size,color;

        public ViewHolder(View view) {
            super(view);

            address = view.findViewById(R.id.address_txt);
            size = view.findViewById(R.id.size_txt);
            color = view.findViewById(R.id.color_txt);
        }
    }
}
