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
import com.jm.jengo.dealz.utilities.SearchResultRecyclerViewAdapter;
import com.jm.jengo.dealz.utilities.TopDealsRecyclerViewAdapter;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    private static final String TAG = "HomeFragment";

    private ArrayList<SaleItem> tempSearchData = new ArrayList<>();
    private RecyclerView searchItemsRecyclerView;
    private SearchResultRecyclerViewAdapter searchResultsadapter;

    private ArrayList<SaleItem> tempTopData = new ArrayList<>();
    private RecyclerView topItemsRecyclerView;
    private TopDealsRecyclerViewAdapter topItemsadapter;

    public HomeFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tempSearchData.add(new SaleItem("Car", 19.50f, "This is a car"));
        tempSearchData.add(new SaleItem("Car", 19.50f, "This is a car"));
        tempSearchData.add(new SaleItem("Car", 19.50f, "This is a car"));
        tempSearchData.add(new SaleItem("Car", 19.50f, "This is a car"));
        tempSearchData.add(new SaleItem("Car", 19.50f, "This is a car"));
        tempSearchData.add(new SaleItem("Car", 19.50f, "This is a car"));
        tempSearchData.add(new SaleItem("Car", 19.50f, "This is a car"));
        tempSearchData.add(new SaleItem("Car", 19.50f, "This is a car"));
        tempSearchData.add(new SaleItem("Car", 19.50f, "This is a car"));
        tempSearchData.add(new SaleItem("Car", 19.50f, "This is a car"));
        tempSearchData.add(new SaleItem("Car", 19.50f, "This is a car"));
        tempSearchData.add(new SaleItem("Car", 19.50f, "This is a car"));
        tempSearchData.add(new SaleItem("Car", 19.50f, "This is a car"));
        tempSearchData.add(new SaleItem("Car", 19.50f, "This is a car"));
        tempSearchData.add(new SaleItem("Car", 19.50f, "This is a car"));
        tempSearchData.add(new SaleItem("Car", 19.50f, "This is a car"));
        tempSearchData.add(new SaleItem("Car", 19.50f, "This is a car"));
        tempSearchData.add(new SaleItem("Car", 19.50f, "This is a car"));


        tempTopData.add(new SaleItem("Car", 19.50f, "THis is a car"));
        tempTopData.add(new SaleItem("Boat", 19.40f, "THis is a car"));
        tempTopData.add(new SaleItem("Rat", 19.50f, "THis is a car"));
        tempTopData.add(new SaleItem("Jims", 19.50f, "THis is a car"));
        tempTopData.add(new SaleItem("Cops", 19.50f, "THis is a car"));
        tempTopData.add(new SaleItem("Tanks", 19.70f, "THis is a car"));
        tempTopData.add(new SaleItem("Romper", 19.90f, "THis is a car"));
        tempTopData.add(new SaleItem("plomp", 19.51f, "THis is a car"));
        tempTopData.add(new SaleItem("trunf", 19.60f, "THis is a car"));
        tempTopData.add(new SaleItem("idk", 19.50f, "THis is a car"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search_result, container, false);

        searchItemsRecyclerView = (RecyclerView)view.findViewById(R.id.search_deals_layout);
        searchItemsRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        searchResultsadapter = new SearchResultRecyclerViewAdapter(tempSearchData);
        searchItemsRecyclerView.setAdapter(searchResultsadapter);

        topItemsRecyclerView = (RecyclerView)view.findViewById(R.id.top_deals_layout);
        topItemsRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false));
        topItemsadapter = new TopDealsRecyclerViewAdapter(tempTopData);
        topItemsRecyclerView.setAdapter(topItemsadapter);

        return view;
    }

}
