package com.braincraftapps.gourmet;

import android.app.SearchManager;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;
import com.braincraftapps.gourmet.adapter.RecipesListViewAdapter;
import com.braincraftapps.gourmet.model.Recipe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex Sysoiev on 15.03.2015.
 */
public class SearchResultActivity extends ActionBarActivity {
    private ListView mListView;
    private List<Recipe> recipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Результат поиска");

        TypedArray images = getResources().
                obtainTypedArray(R.array.nav_category_icons);
        recipes = new ArrayList<>();
        //recipes.add(new Recipe("Фаршированный перец", images.getResourceId(0, -1), 90, "Мясо", "Перец фаршированный мясным фаршем и рисом, запеченный в духовке с сыром.", 4500, 4));
        //recipes.add(new Recipe("Курица гриль", images.getResourceId(1, -1), 10, "Птица", "Хотите получить курочку-гриль в домашних условиях? Тогда попробуйте вот такой способ: курица натирается специями, маринуется ночь в холодильнике, затем запекается в духовке", 4500, 5));
        images.recycle();
        mListView = (ListView) findViewById(R.id.search_listview);

        RecipesListViewAdapter adapter = new RecipesListViewAdapter(getApplicationContext(), recipes);
        mListView.setAdapter(adapter);


        handleIntent(getIntent());


    }

    @Override
    protected void onNewIntent(Intent intent) {
        setIntent(intent);
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);

            //txt.setText("Search query " + query);
        }
    }
}
