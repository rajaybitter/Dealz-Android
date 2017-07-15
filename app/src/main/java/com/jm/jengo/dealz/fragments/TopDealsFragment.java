package com.jm.jengo.dealz.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jm.jengo.dealz.R;
import com.jm.jengo.dealz.classes.SaleItem;
import com.jm.jengo.dealz.utilities.TopDealsRecyclerViewAdapter;

import java.util.ArrayList;

public class TopDealsFragment extends Fragment {

    private static final String TAG = "TopDealsFragment";

    private ArrayList<SaleItem> tempData = new ArrayList<>();
    private RecyclerView recyclerView;
    private TopDealsRecyclerViewAdapter adapter;

    public TopDealsFragment() {
    }

    public static TopDealsFragment newInstance(int columnCount) {
        TopDealsFragment fragment = new TopDealsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tempData.add(new SaleItem("Car", 19.50f, "THis is a car"));
        tempData.add(new SaleItem("Boat", 19.40f, "THis is a car"));
        tempData.add(new SaleItem("Rat", 19.50f, "THis is a car"));
        tempData.add(new SaleItem("Jims", 19.50f, "THis is a car"));
        tempData.add(new SaleItem("Cops", 19.50f, "THis is a car"));
        tempData.add(new SaleItem("Tanks", 19.70f, "THis is a car"));
        tempData.add(new SaleItem("Romper", 19.90f, "THis is a car"));
        tempData.add(new SaleItem("plomp", 19.51f, "THis is a car"));
        tempData.add(new SaleItem("trunf", 19.60f, "THis is a car"));
        tempData.add(new SaleItem("idk", 19.50f, "THis is a car"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_deals_fragment, container, false);
        recyclerView = (RecyclerView)view.findViewById(R.id.top_deals_layout);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false));

        adapter = new TopDealsRecyclerViewAdapter(tempData);
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
    }
}
