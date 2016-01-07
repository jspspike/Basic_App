package com.example.johnson_849323.test10;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends Activity {

    int press = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void pressed (View v) {
        ImageButton button = (ImageButton) findViewById(R.id.imageButton);

        int pic =  (int)(Math.random() * 5);

        press++;
        switch(press) {
            case 1: button.setImageResource(R.drawable.bird_egg2); break;
            case 2: button.setImageResource(R.drawable.bird_egg3); break;
            case 3: button.setImageResource(R.drawable.bird_egg4); break;
            case 4:
                System.out.println("Picture Index" + pic);
                switch (pic) {

                    case 0: button.setImageResource(R.drawable.cat); break;
                    case 1: button.setImageResource(R.drawable.chick); break;
                    case 2: button.setImageResource(R.drawable.dog); break;
                    case 3: button.setImageResource(R.drawable.donkey); break;
                    case 4: button.setImageResource(R.drawable.shark); break;
                    case 5: button.setImageResource(R.drawable.shark); break;
                }
                break;
            case 5: button.setImageResource(R.drawable.bird_egg); press = 0; break;
        }

    }
}
