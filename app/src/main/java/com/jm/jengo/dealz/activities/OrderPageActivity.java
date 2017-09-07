package com.jm.jengo.dealz.activities;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.jm.jengo.dealz.R;


/**
 * Created by equ-user on 8/29/17.
 */

public class OrderPageActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.order_bar);
        setSupportActionBar(myToolbar);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_test, menu);
        return true;
    }
    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.actions, popup.getMenu());
        popup.show();
    }
   /* public void showMenu(View v) {
        PopupMenu popup = new PopupMenu(this, v);

        // This activity implements OnMenuItemClickListener
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.actions);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.archive:
                archive(item);
                return true;
            case R.id.delete:
                delete(item);
                return true;
            default:
                return false;
        }
    }*/



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.pay_seller){
            Toast.makeText(OrderPageActivity.this, "Pay only this seller",
                    Toast.LENGTH_SHORT).show();
        }else if(item.getItemId() == R.id.help){
            Toast.makeText(OrderPageActivity.this, "Help options scanty",
                    Toast.LENGTH_SHORT).show();
        }else if(item.getItemId() == R.id.hidden_options){

        }

        return super.onOptionsItemSelected(item);
    }

    public OrderPageActivity() {
        super();
    }

}
