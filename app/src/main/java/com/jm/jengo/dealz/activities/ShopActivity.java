package com.jm.jengo.dealz.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jm.jengo.dealz.R;
import com.jm.jengo.dealz.fragments.HomeFragment;
import com.jm.jengo.dealz.fragments.TopDealsFragment;

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.top_deals_container, new TopDealsFragment()).commit();

//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.search_result_container, new HomeFragment()).commit();
    }
}
