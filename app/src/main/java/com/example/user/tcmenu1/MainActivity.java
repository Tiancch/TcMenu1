package com.example.user.tcmenu1;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setContentView(R.layout.activity_main);

        ConstraintLayout bgElement = findViewById(R.id.contentPanel);


        int id = item.getItemId();
        if (id == R.id.menu_red){

            bgElement.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        } else if (id == R.id.menu_blue)
        {
            bgElement.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        } else
        { finish();}

        return super.onOptionsItemSelected(item);
    }
}
