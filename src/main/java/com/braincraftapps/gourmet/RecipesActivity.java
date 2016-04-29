package com.braincraftapps.gourmet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.braincraftapps.gourmet.adapter.RecipesListViewAdapter;
import com.braincraftapps.gourmet.model.Recipe;

import java.util.ArrayList;

/**
 * Created by Alex Sysoiev on 16.03.2015.
 */
public class RecipesActivity extends ActionBarActivity {
    private ListView mListView;
    private ArrayList<Recipe> recipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
       // final Intent intent = getIntent();


       // int position = intent.getExtras().getInt("id");


        /*TypedArray images = getResources().
                obtainTypedArray(R.array.nav_category_icons);*/
        recipes = new ArrayList<>();
        //recipes.add(new Recipe("Фаршированный перец", images.getResourceId(0, -1), 90, "Мясо", "Перец фаршированный мясным фаршем и рисом, запеченный в духовке с сыром.", 4500, 4));
        //recipes.add(new Recipe("Курица гриль", images.getResourceId(1 + 1, -1), 10, "Птица", "Хотите получить курочку-гриль в домашних условиях? Тогда попробуйте вот такой способ: курица натирается специями, маринуется ночь в холодильнике, затем запекается в духовке", 4500, 5));
        //images.recycle();

        mListView = (ListView) findViewById(R.id.search_listview);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), RecipeActivity.class);
               // intent.putExtra("id", position);
                startActivity(intent);
            }
        });

        RecipesListViewAdapter adapter = new RecipesListViewAdapter(getApplicationContext(), recipes);
        mListView.setAdapter(adapter);
    }
}
