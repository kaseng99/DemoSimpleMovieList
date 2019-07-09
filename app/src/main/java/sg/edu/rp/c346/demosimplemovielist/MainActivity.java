package sg.edu.rp.c346.demosimplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lvMovie;
ArrayList<String> movieList;
ArrayAdapter<String> aaMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie);

        movieList = new ArrayList<>();
        movieList.add("Avengers Infinity War");
        movieList.add("Justice League");

        aaMovie = new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1, movieList);
        lvMovie.setAdapter(aaMovie);
    }
}
