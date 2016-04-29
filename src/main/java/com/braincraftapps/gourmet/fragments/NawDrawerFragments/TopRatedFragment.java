package com.braincraftapps.gourmet.fragments.NawDrawerFragments;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.braincraftapps.gourmet.R;
import com.braincraftapps.gourmet.adapter.RecipesListViewAdapter;
import com.braincraftapps.gourmet.model.Recipe;

import java.util.ArrayList;

/**
 * Created by Alex Sysoiev on 02.03.2015.
 */
public class TopRatedFragment extends Fragment {

    public TopRatedFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_best_recipes, container, false);

        TypedArray images = getResources().obtainTypedArray(R.array.nav_category_icons);

        ArrayList<Recipe> recipes = new ArrayList<>();
        //recipes.add(new Recipe("Креольское гамбо", images.getResourceId(6, -1), 120, "Морепродукты", "Родина этого пикантного супа – Юг США. Гамбо из риса, курицы, креветок и овощей – вкусный и сытный обед в одной тарелке. Нарезанные ломтиками стручки бамии (окры) придают гамбо традиционную густую консистенцию.",230, 4.7f));
        ListView mListView = (ListView) rootView.findViewById(R.id.list_item_best);
        RecipesListViewAdapter adapter = new RecipesListViewAdapter(getActivity(), recipes);
        mListView.setAdapter(adapter);
        images.recycle();
        return rootView;
    }
}
