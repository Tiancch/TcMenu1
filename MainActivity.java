package com.example.user.tcmenu1;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public  SharedPreferences sharedPreferences;
    public SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ConstraintLayout bgElement = findViewById(R.id.contentPanel);
        TextView textView = findViewById(R.id.textView);



        setContentView(R.layout.activity_main);

        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu){

            MenuInflater inflater = getMenuInflater();
            inflater.inflate(R.menu.main_menu, menu);


        ConstraintLayout bgElement = findViewById(R.id.contentPanel);
        TextView textView = findViewById(R.id.textView);

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        sharedPreferences = getSharedPreferences("com.example.user.tcmenu1", Context.MODE_PRIVATE);




        int backgroundColor = sharedPreferences.getInt("backgroundColor", R.color.colorGreen);
        int textColor = sharedPreferences.getInt("textColor",R.color.colorRed);


                bgElement.setBackgroundColor(getResources().getColor(backgroundColor));
                textView.setTextColor(getResources().getColor(textColor));

            return super.onCreateOptionsMenu(menu);

        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
            sharedPreferences = getSharedPreferences("com.example.user.tcmenu1", Context.MODE_PRIVATE);

            editor = getSharedPreferences("com.example.user.tcmenu1", MODE_PRIVATE).edit();

            ConstraintLayout bgElement = findViewById(R.id.contentPanel);
            TextView textView = findViewById(R.id.textView);

            int id = item.getItemId();
            int saveBackgroundColor;
            int saveTextColor;


            if (id == R.id.menu_red){
                bgElement.setBackgroundColor(getResources().getColor(R.color.colorRed));
                textView.setTextColor(getResources().getColor(R.color.colorGreen));
                saveBackgroundColor = R.color.colorRed;
                saveTextColor = R.color.colorGreen;

                editor.putInt("backgroundColor", saveBackgroundColor);
                editor.putInt("textColor", saveTextColor);
                editor.commit();

            }
            else if (id == R.id.menu_blue){
                bgElement.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                textView.setTextColor(getResources().getColor(R.color.colorRed));
                saveBackgroundColor = R.color.colorPrimaryDark;
                saveTextColor = R.color.colorRed;

                editor.putInt("backgroundColor", saveBackgroundColor);
                editor.putInt("textColor", saveTextColor);
                editor.commit();

            } else if (id == R.id.menu_green) {
                bgElement.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                textView.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                saveBackgroundColor = R.color.colorGreen;
                saveTextColor = R.color.colorPrimaryDark;

                editor.putInt("backgroundColor", saveBackgroundColor);
                editor.putInt("textColor", saveTextColor);
                editor.commit();
            }
                else if (id == R.id.menu_black) {
                bgElement.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                textView.setTextColor(getResources().getColor(R.color.colorWhite));
                saveBackgroundColor = R.color.colorBlack;
                saveTextColor = R.color.colorWhite;

                editor.putInt("backgroundColor", saveBackgroundColor);
                editor.putInt("textColor", saveTextColor);
                editor.commit();
            } else if (id == R.id.menu_signOut){

            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
