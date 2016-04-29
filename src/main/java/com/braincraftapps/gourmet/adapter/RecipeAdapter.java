package com.braincraftapps.gourmet.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.braincraftapps.gourmet.R;
import com.braincraftapps.gourmet.vm.IngredientVM;

import java.util.List;

/**
 * Created by Алексей on 29.03.2015.
 */
public class RecipeAdapter extends ArrayAdapter<IngredientVM> {
    private Context context;
    private List<IngredientVM> ingredients;


    public RecipeAdapter(Context context, List<IngredientVM> ingredients) {
        super(context, android.R.layout.simple_list_item_1, ingredients);
        /*this.context = context;
        this.ingredients = ingredients;*/
    }

    public RecipeAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public int getCount() {
        return ingredients.size();
    }

    @Override
    public IngredientVM getItem(int position) {
        return ingredients.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        IngredientVM currentIngredient = getItem(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.recipe_table_ingredints, parent);
            viewHolder = new ViewHolder();

            viewHolder.ingredientName = (TextView) convertView.findViewById(R.id.ingredientName);
            viewHolder.ingredientCount = (TextView) convertView.findViewById(R.id.ingredientCount);
            viewHolder.ingredientMeasurement = (TextView) convertView.findViewById(R.id.ingredientMeasurement);
            viewHolder.serves = (TextView) convertView.findViewById(R.id.recipeServes);
            viewHolder.servesCount = (TextView) convertView.findViewById(R.id.recipeServesCount);

            /*viewHolder.ingredientName.setText(currentIngredient);
            if(ingredients.get(position).getIngredientCount() == 0 ) {
                viewHolder.ingredientCount.setText(null);
                viewHolder.ingredientMeasurement.setText(null);
            } else {
                viewHolder.ingredientCount.setText(Double.toString(ingredients.get(position).getIngredientCount()));
                viewHolder.ingredientMeasurement.setText(ingredients.get(position).getIngredientMeasurment());
            }*/


        }
        return convertView;
    }

    private static class ViewHolder {
        TextView ingredientName, ingredientCount, ingredientMeasurement, serves, servesCount;
    }

}



