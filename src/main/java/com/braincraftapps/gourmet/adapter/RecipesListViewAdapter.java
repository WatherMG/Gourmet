package com.braincraftapps.gourmet.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.braincraftapps.gourmet.R;
import com.braincraftapps.gourmet.model.Recipe;

import java.util.List;

/**
 * Created by Alex Sysoiev on 15.03.2015.
 */
public class RecipesListViewAdapter extends BaseAdapter {

    private Context context;
    private List<Recipe> recipes;

    public RecipesListViewAdapter(Context context, List<Recipe> recipes) {
        this.context = context;
        this.recipes = recipes;
    }

    @Override
    public int getCount() {
        return recipes.size();
    }

    @Override
    public Object getItem(int position) {
        return recipes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.recipes_list_item, null);

            viewHolder = new ViewHolder();
            viewHolder.title = (TextView) convertView.findViewById(R.id.recipes_title);
            viewHolder.image = (ImageView) convertView.findViewById(R.id.recipes_image);
            viewHolder.time = (TextView) convertView.findViewById(R.id.recipes_time);
            viewHolder.category = (TextView) convertView.findViewById(R.id.recipes_category);
            viewHolder.calories = (TextView) convertView.findViewById(R.id.recipes_calories_total);
            viewHolder.rating = (RatingBar) convertView.findViewById(R.id.recipes_rating);
            viewHolder.shortDescription = (TextView) convertView.findViewById(R.id.recipes_short_description);

            viewHolder.title.setText(recipes.get(position).getName());
           // viewHolder.image.setImageResource(recipes.get(position).getImage());
            viewHolder.time.setText(Integer.toString(recipes.get(position).getTime())+ " мин.");
            //viewHolder.category.setText(recipes.get(position).getCategoryId());
            //viewHolder.calories.setText(Float.toString(recipes.get(position).)+ " ккал.");
            viewHolder.rating.setRating(recipes.get(position).getRating());
            viewHolder.shortDescription.setText(recipes.get(position).getShortDescription());

        }

        return convertView;
    }
    private static class ViewHolder {
        TextView title, time, category, calories, shortDescription;
        ImageView image;
        RatingBar rating;


    }
}
