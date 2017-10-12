package com.jm.jengo.dealz.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jm.jengo.dealz.R;
import com.jm.jengo.dealz.classes.Message;
import com.jm.jengo.dealz.classes.SaleItem;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by rajay on 10/11/17.
 */

public class InboxRecyclerViewAdapter extends RecyclerView.Adapter<InboxRecyclerViewAdapter.Holder> {

    private ArrayList<Message> items;

    public InboxRecyclerViewAdapter(ArrayList<Message> items) {
        this.items = items;
    }

    @Override
    public InboxRecyclerViewAdapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.inbox_item_layout, parent, false);
        return new InboxRecyclerViewAdapter.Holder(view);
    }

    @Override
    public void onBindViewHolder(final InboxRecyclerViewAdapter.Holder holder, int position) {
        Message currentItem = items.get(position);
        int index = ThreadLocalRandom.current().nextInt(0, 6);
        holder.name.setText(currentItem.getSender());
        holder.message.setText( String.valueOf(currentItem.getLastMessage()) );
        holder.time.setText(currentItem.getTimeStamp());
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
        public TextView name;
        public TextView message;
        public TextView time;

        public Holder(View view) {
            super(view);
            name = (TextView)view.findViewById(R.id.inbox_sender_name);
            message = (TextView)view.findViewById(R.id.inbox_sender_message);
            time = (TextView)view.findViewById(R.id.inbox_sender_time);
        }
    }
}
