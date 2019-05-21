package com.gamecodeschool.humanoop;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        /*Human person1 = new Human("Poshie", 20, 55);

        Log.d("Human","Given name is "+ person1.getName());

        int myAge = person1.getAge();
        Log.d("Human","Given age is "+myAge);
        int myWeight = person1.getWeight();
        Log.d("Human","Given weight is "+myWeight);
        person1.setName("Perlee");
        Log.d("Human", "New name is " + person1.getName());
        person1.setAge(24);
        Log.d("Human", "New age is " + person1.getAge());
        person1.setWeight(60);
        Log.d("Human", "New weight is " + person1.getWeight());
        person1.eat();
        person1.sleep();
        person1.sleep(9);
        person1.speak("Mobile Development is fun.");
        person1.birthday();
        Log.d("Human", "New age is "+person1.getAge());*/

        Anna iminza = new Anna("Iminza", 19, 65, 2);

        /*Log.d("Anna", "Given weight is "+ iminza.getWeight());
        Log.d("Anna", "Given age is " + iminza.getAge());
        Log.d("Anna", "Given height is " + iminza.getHeight());
        Log.d("Anna", "Given name is  " +iminza.getName());*/

        iminza.eat();
        Log.d("Human", "Anna's new weight is " + iminza.getWeight());
        iminza.birthday();
        Log.d("Anna", "New age is " + iminza.getAge());
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
}
