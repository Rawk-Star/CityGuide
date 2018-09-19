package com.rawks.jeremy.cityguide;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity
{
    @Override
    // This function is invoked when the activity is created.
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // List of Chicago attractions
        String[] attraction = {"Art Institute of Chicago", "Magnificent Mile", "Willis Tower", "Navy Pier", "Water Tower"};

        // Use the "travel" TextView widget defined in activity_main.xml as the layout for each item in the list
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.travel, attraction));
    }

    // This function is invoked when the user clicks an item in the list.
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        switch (position)
        {
            case 0:
                // Open a web browser to visit the Art Institute of Chicago website.
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://artic.edu")));
                break;
            case 1:
                // Open a web browser to visit the Magnificent Mile website.
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://themagnificentmile.com")));
                break;
            case 2:
                // Open the Willis Tower activity
                startActivity(new Intent(MainActivity.this, Willis.class));
                break;
            case 3:
                // Open the Navy Pier activity
                startActivity(new Intent(MainActivity.this, Pier.class));
                break;
            case 4:
                // Open the Water Tower activity
                startActivity(new Intent(MainActivity.this, Water.class));
                break;
        }
    }
}
