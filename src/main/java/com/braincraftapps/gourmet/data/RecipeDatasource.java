package com.braincraftapps.gourmet.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.braincraftapps.gourmet.model.Recipe;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Алексей on 16.04.2015.
 */
public class RecipeDatasource extends GenericDatasource<Recipe> {
    private static final String[] allColumns = {
            DatabaseHelper.ROW_RECIPE_ID,
            DatabaseHelper.ROW_RECIPE_CATEGORY_ID,
            DatabaseHelper.ROW_RECIPE_NAME,
            DatabaseHelper.ROW_RECIPE_SHORT_DESCRIPTION,
            DatabaseHelper.ROW_RECIPE_FULL_DESCRIPTION,
            DatabaseHelper.ROW_RECIPE_TIME,
            DatabaseHelper.ROW_RECIPE_FATS,
            DatabaseHelper.ROW_RECIPE_PROTEINS,
            DatabaseHelper.ROW_RECIPE_CARBOHYDRATES,
            DatabaseHelper.ROW_RECIPE_TOTAL_CALORIES,
            DatabaseHelper.ROW_RECIPE_TOTAL_IMAGES,
            DatabaseHelper.ROW_RECIPE_RATING,
            DatabaseHelper.ROW_RECIPE_SERVES_COUNT
    };

    public RecipeDatasource(Context context) {
        super(context, DatabaseHelper.TABLE_RECIPES, allColumns);
    }

    @Override
    protected List<Recipe> cursorToList(Cursor cursor) {
        List<Recipe> recipes = new ArrayList<>();
        if (cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                long id = cursor.getLong(cursor.getColumnIndex(DatabaseHelper.ROW_RECIPE_ID));
                long categoryId = cursor.getLong(cursor.getColumnIndex(DatabaseHelper.ROW_RECIPE_CATEGORY_ID));
                String name = cursor.getString(cursor.getColumnIndex(DatabaseHelper.ROW_RECIPE_NAME));
                String shortDescription = cursor.getString(cursor.getColumnIndex(DatabaseHelper.ROW_RECIPE_SHORT_DESCRIPTION));
                String fullDescription = cursor.getString(cursor.getColumnIndex(DatabaseHelper.ROW_RECIPE_FULL_DESCRIPTION));
                int time = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.ROW_RECIPE_TIME));
                float fats = cursor.getFloat(cursor.getColumnIndex(DatabaseHelper.ROW_RECIPE_FATS));
                float protein = cursor.getFloat(cursor.getColumnIndex(DatabaseHelper.ROW_RECIPE_PROTEINS));
                float carbohydrates = cursor.getFloat(cursor.getColumnIndex(DatabaseHelper.ROW_RECIPE_CARBOHYDRATES));
                float totalCalories = cursor.getFloat(cursor.getColumnIndex(DatabaseHelper.ROW_RECIPE_TOTAL_CALORIES));
                int totalImages = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.ROW_RECIPE_TOTAL_IMAGES));
                float rating = cursor.getFloat(cursor.getColumnIndex(DatabaseHelper.ROW_RECIPE_RATING));
                int servesCount = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.ROW_RECIPE_SERVES_COUNT));

                Recipe recipe = new Recipe(id, categoryId, name, shortDescription, fullDescription,
                        time, fats, protein,carbohydrates,totalCalories,totalImages, rating, servesCount);
                recipes.add(recipe);
            }
        }
        return recipes;
    }

    @Override
    protected long getEntryId(Recipe entry) {
        return entry.getId();
    }

    @Override
    protected ContentValues entryToContentValues(Recipe entry) {
        ContentValues values = new ContentValues();
        values.put(DatabaseHelper.ROW_RECIPE_CATEGORY_ID, entry.getCategoryId());
        values.put(DatabaseHelper.ROW_RECIPE_NAME, entry.getName());
        values.put(DatabaseHelper.ROW_RECIPE_SHORT_DESCRIPTION, entry.getShortDescription());
        values.put(DatabaseHelper.ROW_RECIPE_FULL_DESCRIPTION, entry.getFullDescription());
        values.put(DatabaseHelper.ROW_RECIPE_TIME, entry.getTime());
        values.put(DatabaseHelper.ROW_RECIPE_FATS, entry.getFats());
        values.put(DatabaseHelper.ROW_RECIPE_PROTEINS, entry.getProtein());
        values.put(DatabaseHelper.ROW_RECIPE_CARBOHYDRATES, entry.getCarbohydrates());
        values.put(DatabaseHelper.ROW_RECIPE_TOTAL_CALORIES, entry.getTotalCalories());
        values.put(DatabaseHelper.ROW_RECIPE_TOTAL_IMAGES, entry.getTotalImages());
        values.put(DatabaseHelper.ROW_RECIPE_RATING, entry.getRating());
        values.put(DatabaseHelper.ROW_RECIPE_SERVES_COUNT, entry.getServesCount());

        return values;
    }

    @Override
    protected void setEntryId(Recipe entry, long insertId) {
        entry.setId(insertId);
    }
}
