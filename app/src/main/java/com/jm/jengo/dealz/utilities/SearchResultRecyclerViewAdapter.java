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

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SearchResultRecyclerViewAdapter extends RecyclerView.Adapter<SearchResultRecyclerViewAdapter.Holder> {

    private ArrayList<SaleItem> items;

    public SearchResultRecyclerViewAdapter(ArrayList<SaleItem> items) {
        this.items = items;
    }

    private int[] images = {R.drawable.car, R.drawable.fan, R.drawable.tang, R.drawable.test_image,
            R.drawable.piano, R.drawable.shirt, R.drawable.shoes};

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.search_item_layout, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(final Holder holder, int position) {
        SaleItem currentItem = items.get(position);
        int index = ThreadLocalRandom.current().nextInt(0, 6);
        holder.name.setText(currentItem.getName());
        holder.price.setText( String.valueOf(currentItem.getPrice()) );
        holder.description.setText(currentItem.getDescription());
        Glide.with(holder.image.getContext())
                .load(images[index])
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public class Holder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView name;
        public TextView description;
        public TextView price;

        public Holder(View view) {
            super(view);
            image = (ImageView)view.findViewById(R.id.search_item_image);
            name = (TextView)view.findViewById(R.id.search_item_name);
            description = (TextView)view.findViewById(R.id.search_item_description);
            price = (TextView)view.findViewById(R.id.search_item_price);
        }
    }
}
