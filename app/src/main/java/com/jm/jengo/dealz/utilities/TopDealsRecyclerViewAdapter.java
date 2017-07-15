package com.jm.jengo.dealz.utilities;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jm.jengo.dealz.R;
import com.jm.jengo.dealz.classes.SaleItem;

import java.util.ArrayList;

public class TopDealsRecyclerViewAdapter extends RecyclerView.Adapter<TopDealsRecyclerViewAdapter.Holder> {

    private ArrayList<SaleItem> items;

    public TopDealsRecyclerViewAdapter(ArrayList<SaleItem> items) {
        this.items = items;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.top_deal_item_layout, parent, false);
        return new Holder(view);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onBindViewHolder(final Holder holder, int position) {
        SaleItem currentItem = items.get(position);
        holder.name.setText(currentItem.getName());
        Glide.with(holder.image.getContext())
            .load(R.drawable.test_image)
            .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class Holder extends RecyclerView.ViewHolder{
        public TextView name;
        public ImageView image;

        public Holder(View itemView) {
            super(itemView);
            this.name = (TextView)itemView.findViewById(R.id.top_deals_name);
            this.image = (ImageView)itemView.findViewById(R.id.top_deals_image);
        }
    }
}
